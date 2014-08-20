package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Student;
import br.edu.ifpb.monteiro.ads.ctrlesc.dao.StudentDaoIF;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@RequestScoped
public class StudentBean implements Serializable {

    @EJB
    private StudentDaoIF studentFacade;
    private List<Student> listStudents;
    private Student student;

    /**
     * Creates a new instance of StudentBean.
    */
    public StudentBean() {
        student=new Student();
    }
    
    /**
     * Method used by the cancel button to clear the data in a form.
     * @return editStudent
     */
    public String limpStudent() {
        student=new Student();       
        return editStudent();
    }
    
    /**
     * Method used by the edit button for editing data in a registration form.
     * @return cadStudent
     */
    public String editStudent() {
        return "/cadastre/cadStudent.xhtml";
    }
    
    /**
     * Method used by the save button for adding a new student.
     * @return null
    */
    public String addStudent() {
        if (student.getId() == null || student.getId() == 0) {
            insertStudent();
        } else {
            updateStudent();
        }
        limpStudent();
        return null;
    }
    
     /**
     * Method responsible for the insertion of a student. And exposure 
     * confirmation message to the user.
     */
    private void insertStudent() {
        studentFacade.create(student);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for editing the form student. And exposure 
     * confirmation message to the user.
     */
    private void updateStudent() {
        studentFacade.edit(student);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    /**
     * Method responsible for the removal of a student.
     */
    public void removeStudent() {
        studentFacade.remove(student);
    }

    /*
    Getters and Setters
    */
    public StudentDaoIF getStudentFacade() {
        return studentFacade;
    }

    public void setStudentFacade(StudentDaoIF studentFacade) {
        this.studentFacade = studentFacade;
    }

    public List<Student> getListStudents() {
        listStudents = studentFacade.findAll();
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
        
}
