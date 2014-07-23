package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.DaoIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.dao.TeacherDao;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Teacher;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author MarkusPatriota
 */
@Named
@RequestScoped
public class TeacherBean implements Serializable{

    @EJB
    @Inject
    private TeacherDao teacherFacade;
    private Teacher teacher;
    private List<Teacher> listTeacher;
    
    /**
     * Creates a new instance of TeacherBean
     */
    public TeacherBean() {
        teacher= new Teacher();
    }
    
    public String limpTeacher() {
        teacher = new Teacher();
        return editTeacher();
    }
    
    public String editTeacher() {
        return "/cadastre/cadTeacher.xhtml";
    }
    
    public String addTeacher() {
        if (teacher.getId() == null || teacher.getId() == 0) {
            insertTeacher();
        } else {
            updateTeacher();
        }
        limpTeacher();
        return null;
    }
    
    private void insertTeacher() {
        teacherFacade.create(teacher);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    private void updateTeacher() {
        teacherFacade.edit(teacher);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    public void removeTeacher() {
        teacherFacade.remove(teacher);
    }
    //Get's

    public DaoIF getTeacherFacade() {
        return teacherFacade;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Teacher> getListTeacher() {
        return listTeacher;
    }
            
}
