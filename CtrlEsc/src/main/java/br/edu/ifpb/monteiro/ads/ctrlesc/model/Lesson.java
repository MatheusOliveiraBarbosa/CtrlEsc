package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author E.Wellington
 */

@Entity
@Table (name = "TB_lesson")
public class Lesson extends Identifiable{
    
    private Date dateLesson;
    
    private int presence;
    
    private String observation;
    
    private StudentClass studentClass;
    
    private List<Student> listStudents;

    public Lesson() {
        listStudents = new ArrayList<Student>();
    }

    public Date getDateLesson() {
        return dateLesson;
    }

    public void setDateLesson(Date dateLesson) {
        this.dateLesson = dateLesson;
    }

    public int getPresence() {
        return presence;
    }

    public void setPresence(int presence) {
        this.presence = presence;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }
    
    
    
}
