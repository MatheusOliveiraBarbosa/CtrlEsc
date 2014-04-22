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
    private Date lessonDate;
    
    private int lessonPresence;
    
    private String lessonObservation;

    @ManyToOne
    @JoinColumn(name = "id")
    private StudentClass lessonStudentClass;

    @Column
    @ManyToOne
    @JoinColumn(name = "id")
    private List<Student> listStudents;

    public Lesson() {
        listStudents = new ArrayList<Student>();
    }

  
}
