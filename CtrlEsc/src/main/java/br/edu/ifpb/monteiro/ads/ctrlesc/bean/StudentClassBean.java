package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.StudentClass;
import br.edu.ifpb.monteiro.ads.ctrlesc.dao.StudentClassDao;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named
@RequestScoped
public class StudentClassBean implements Serializable {

    @EJB
    @Inject
    private StudentClassDao studentClassFacade;
    private List<StudentClass> lisStudentClass;
    private StudentClass studentClass;

    public StudentClassBean() {
        studentClass= new StudentClass();
    }
   public String limpStudentClass() {
        studentClass=new StudentClass();       
        return editStudentClass();
    }
    
    public String editStudentClass() {
        return "/cadastre/cadStudentClass.xhtml";
    }
    
    public String addStudentClass() {
        if (studentClass.getId() == null || studentClass.getId() == 0) {
            insertStudentClass();
        } else {
            updateStudentClass();
        }
        limpStudentClass();
        return null;
    }
    
    private void insertStudentClass() {
        studentClassFacade.create(studentClass);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    private void updateStudentClass() {
        studentClassFacade.edit(studentClass);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    public void removeStudentClass() {
        studentClassFacade.remove(studentClass);
    }

    public StudentClassDao getStudentClassFacade() {
        return studentClassFacade;
    }

    public void setStudentClassFacade(StudentClassDao studentClassFacade) {
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
