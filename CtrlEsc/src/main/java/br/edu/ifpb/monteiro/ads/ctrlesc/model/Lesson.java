package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table(name = "TB_lesson")
public class Lesson extends Identifiable {
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date dateLesson;
    
    @Column
    private int presence;
    
    @Column
    private String observation;

    @Column
    @ManyToOne
    @JoinColumn(name = "id")
    private StudentClass studentClass;

    @Column
    @ManyToOne
    @JoinColumn(name = "id")
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
