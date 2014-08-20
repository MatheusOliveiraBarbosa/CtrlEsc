package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.StudentClass;
import br.edu.ifpb.monteiro.ads.ctrlesc.dao.StudentClassDaoIF;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@RequestScoped
public class StudentClassBean implements Serializable {

    @EJB
    private StudentClassDaoIF studentClassFacade;
    private List<StudentClass> lisStudentClass;
    private StudentClass studentClass;

    /**
     * Creates a new instance of StudentClassBean.
     */
    public StudentClassBean() {
        studentClass= new StudentClass();
    }
    
    /**
     * Method used by the cancel button to clear the data in a form.
     * @return editStudentClass
     */
    public String limpStudentClass() {
        studentClass=new StudentClass();       
        return editStudentClass();
    }
    
    /**
     * Method used by the edit button for editing data in a registration form.
     * @return cadStudentClass
     */
    public String editStudentClass() {
        return "/cadastre/cadStudentClass.xhtml";
    }
    
    /**
     * Method used by the save button for adding a new studentClass.
     * @return null
     */
    public String addStudentClass() {
        if (studentClass.getId() == null || studentClass.getId() == 0) {
            insertStudentClass();
        } else {
            updateStudentClass();
        }
        limpStudentClass();
        return null;
    }
    
    /**
     * Method responsible for inserting a studentClass. And exposure 
     * confirmation message to the user.
     */
    private void insertStudentClass() {
        studentClassFacade.create(studentClass);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for editing the form studentClass. And exposure 
     * confirmation message to the user.
     */
    private void updateStudentClass() {
        studentClassFacade.edit(studentClass);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    /**
     * Method responsible for the removal of a studentClass.
     */
    public void removeStudentClass() {
        studentClassFacade.remove(studentClass);
    }

    /*
    Getters and Setters
    */
    public StudentClassDaoIF getStudentClassFacade() {
        return studentClassFacade;
    }

    public void setStudentClassFacade(StudentClassDaoIF studentClassFacade) {
        this.studentClassFacade = studentClassFacade;
    }

    public List<StudentClass> getLisStudentClass() {
        return lisStudentClass;
    }

    public void setLisStudentClass(List<StudentClass> lisStudentClass) {
        this.lisStudentClass = lisStudentClass;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }
    
    
}
