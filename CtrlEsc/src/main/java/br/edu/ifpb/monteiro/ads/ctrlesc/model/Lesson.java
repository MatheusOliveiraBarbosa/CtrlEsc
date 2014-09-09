package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

/**
 * Entity Lesson contains atribudos and methods of creating a 
 * lesson.
 * 
 * @author E.Wellington
 */
@br.edu.ifpb.monteiro.ads.ctrlesc.model.qualifiers.Lesson
@Entity
@Table(name = "TB_lesson")
public class Lesson implements Identifiable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column (name = "lesson_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date lessonDate;
    
    @Column (name = "lesson_presence")
    @Min(value = 0)
    private Integer lessonPresence;
    
    @Column(name = "lesson_observation")
    private String lessonObservation;

    @ManyToOne
    @JoinColumn (name = "id_studentClass", referencedColumnName = "id")
    private StudentClass lessonStudentClass;

    @ManyToMany (mappedBy = "studentListLessons", targetEntity = Student.class)
    private List<Student> lessonListStudents;

    public Lesson() {
    }

    public Lesson(Date lessonDate, Integer lessonPresence, String lessonObservation, StudentClass lessonStudentClass, List<Student> lessonListStudents) {
        this.lessonDate = lessonDate;
        this.lessonPresence = lessonPresence;
        this.lessonObservation = lessonObservation;
        this.lessonStudentClass = lessonStudentClass;
        this.lessonListStudents = lessonListStudents;
    }
    
    //Get's and Set's 
    public Date getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    public Integer getLessonPresence() {
        return lessonPresence;
    }

    public void setLessonPresence(Integer lessonPresence) {
        this.lessonPresence = lessonPresence;
    }

    public String getLessonObservation() {
        return lessonObservation;
    }

    public void setLessonObservation(String lessonObservation) {
        this.lessonObservation = lessonObservation;
    }

    public StudentClass getLessonStudentClass() {
        return lessonStudentClass;
    }

    public void setLessonStudentClass(StudentClass lessonStudentClass) {
        this.lessonStudentClass = lessonStudentClass;
    }

    public List<Student> getLessonListStudents() {
        return lessonListStudents;
    }

    public void setLessonListStudents(List<Student> lessonListStudents) {
        this.lessonListStudents = lessonListStudents;
    }

    @Override
    public Long getId() {
        return id;
    }

   
}
