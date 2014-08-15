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

    public StudentBean() {
        student=new Student();
    }
    public String limpStudent() {
        student=new Student();       
        return editStudent();
    }
    
    public String editStudent() {
        return "/cadastre/cadStudent.xhtml";
    }
    
    public String addStudent() {
        if (student.getId() == null || student.getId() == 0) {
            insertStudent();
        } else {
            updateStudent();
        }
        limpStudent();
        return null;
    }
    
    private void insertStudent() {
        studentFacade.create(student);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    private void updateStudent() {
        studentFacade.edit(student);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    public void removeStudent() {
        studentFacade.remove(student);
    }

    public StudentDaoIF getStudentFacade() {
        return studentFacade;
    }

    public void setStudentFacade(StudentDaoIF studentFacade) {
        this.studentFacade = studentFacade;
    }

    public List<Student> getListStudents() {
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
