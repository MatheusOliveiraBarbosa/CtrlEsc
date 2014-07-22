package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
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
@Entity
@Table(name = "TB_lesson")
public class Lesson implements Identifiable<Lesson> {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column (name = "lesson_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private GregorianCalendar lessonDate;
    
    @Column (name = "lesson_presence")
    @Min(value = 0)
    private int lessonPresence;
    
    @Column(name = "lesson_observation")
    private String lessonObservation;

    @ManyToOne
    @JoinColumn (name = "id_studentClass", referencedColumnName = "id")
    private StudentClass lessonStudentClass;

    @ManyToMany (mappedBy = "studentListLessons", targetEntity = Student.class)
    private List<Student> lessonListStudents;

    public Lesson() {
        lessonListStudents = new ArrayList<Student>();
    }

    public Lesson(GregorianCalendar lessonDate, int lessonPresence, String lessonObservation, StudentClass lessonStudentClass, List<Student> lessonListStudents) {
        this.lessonDate = lessonDate;
        this.lessonPresence = lessonPresence;
        this.lessonObservation = lessonObservation;
        this.lessonStudentClass = lessonStudentClass;
        this.lessonListStudents = lessonListStudents;
    }

    //Get's and Set's 
    public GregorianCalendar getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(GregorianCalendar lessonDate) {
        this.lessonDate = lessonDate;
    }

    public int getLessonPresence() {
        return lessonPresence;
    }

    public void setLessonPresence(int lessonPresence) {
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

    @Override
    public void setId(Long id) {
        this.id = id;
    }
  
}
