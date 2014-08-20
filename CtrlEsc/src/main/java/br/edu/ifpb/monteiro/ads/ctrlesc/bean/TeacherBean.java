package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.TeacherDaoIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Teacher;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author MarkusPatriota
 */
@Named
@RequestScoped
public class TeacherBean implements Serializable{

    @EJB
    private TeacherDaoIF teacherFacade;
    private Teacher teacher;
    private List<Teacher> listTeacher;
    
    /**
     * Creates a new instance of TeacherBean
     */
    public TeacherBean() {
        teacher= new Teacher();
    }
    
    /**
     * Method used by the cancel button to clear the data in a form.
     * @return editTeacher
     */
    public String limpTeacher() {
        teacher = new Teacher();
        return editTeacher();
    }
    
    /**
     * Method used by the edit button for editing data in a registration form.
     * @return cadTeacher
     */
    public String editTeacher() {
        return "/cadastre/cadTeacher.xhtml";
    }
    
    /**
     * Method used by the save button for adding a new teacher.
     * @return null
     */
    public String addTeacher() {
        if (teacher.getId() == null || teacher.getId() == 0) {
            insertTeacher();
        } else {
            updateTeacher();
        }
        limpTeacher();
        return null;
    }
    
    /**
     * Method responsible for the insertion of a teacher. And exposure 
     * confirmation message to the user.
     */
    private void insertTeacher() {
        teacherFacade.create(teacher);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for editing the form teacher. And exposure 
     * confirmation message to the user.
     */
    private void updateTeacher() {
        teacherFacade.edit(teacher);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    /**
     * Method responsible for the removal of a teacher.
     */
    public void removeTeacher() {
        teacherFacade.remove(teacher);
    }

    /*
    Getters and Setters
    */
    public TeacherDaoIF getTeacherFacade() {
        return teacherFacade;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Teacher> getListTeacher() {
        listTeacher = teacherFacade.findAll();
        return listTeacher;
    }
            
}
