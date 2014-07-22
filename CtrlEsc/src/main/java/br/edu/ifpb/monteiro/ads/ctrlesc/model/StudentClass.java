package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity StudentClass contains atribudos and methods of creating a 
 * student class.
 * 
 * @author E.Wellington
 */
@Entity
@Table(name = "TB_studentClass")
public class StudentClass implements Identifiable<StudentClass> {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "studentClass_name", length = 50, nullable = false)
    private String studentClassName;

    @ManyToMany
    @JoinTable(name = "TB_StudentClasses_Disciplines", joinColumns = @JoinColumn(name = "id_studentClass"), inverseJoinColumns = @JoinColumn(name = "id_discipline"))
    private List<Discipline> studentClassListDicipline;

    @OneToMany(mappedBy = "schoolPerformanceStudentClass",targetEntity = SchoolPerformance.class, fetch = FetchType.LAZY)
    private List<SchoolPerformance> studentClassListSchoolPerformance;

    @OneToMany(mappedBy = "lessonStudentClass", targetEntity = Lesson.class)
    private List<Lesson> studentClassListLessons;

    @ManyToMany(mappedBy = "teacherListStudentClasses", targetEntity = Teacher.class)
    private List<Teacher> studentClassListTeachers;

    
    public StudentClass() {
        studentClassListDicipline = new ArrayList<Discipline>();
        studentClassListLessons = new ArrayList<Lesson>();
        studentClassListSchoolPerformance = new ArrayList<SchoolPerformance>();
        studentClassListTeachers = new ArrayList<Teacher>();
    }

    public String getStudentClassName() {
        return studentClassName;
    }

    //Get's and Set's
    public void setStudentClassName(String studentClassName) {
        this.studentClassName = studentClassName;
    }

    public List<Discipline> getStudentClassListDicipline() {
        return studentClassListDicipline;
    }

    public void setStudentClassListDicipline(List<Discipline> studentClassListDicipline) {
        this.studentClassListDicipline = studentClassListDicipline;
    }

    public List<SchoolPerformance> getStudentClassListSchoolPerformance() {
        return studentClassListSchoolPerformance;
    }

    public void setStudentClassListSchoolPerformance(List<SchoolPerformance> studentClassListSchoolPerformance) {
        this.studentClassListSchoolPerformance = studentClassListSchoolPerformance;
    }

    public List<Lesson> getStudentClassListLessons() {
        return studentClassListLessons;
    }

    public void setStudentClassListLessons(List<Lesson> studentClassListLessons) {
        this.studentClassListLessons = studentClassListLessons;
    }

    public List<Teacher> getStudentClassListTeachers() {
        return studentClassListTeachers;
    }

    public void setStudentClassListTeachers(List<Teacher> studentClassListTeachers) {
        this.studentClassListTeachers = studentClassListTeachers;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id=id;
    }
    
}
