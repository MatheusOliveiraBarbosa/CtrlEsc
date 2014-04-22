package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table(name = "TB_studentClass")
public class StudentClass extends Identifiable {

    @Column (length = 50, nullable = false)
    private String name;

    @Column
    @ManyToMany
    @JoinTable(name = "TB_StudentClassesDisciplines", joinColumns = @JoinColumn(name = "id"))
    private List<Discipline> listDicipline;

    @Column
    @OneToMany(mappedBy = "schoolPerformance", targetEntity = SchoolPerformance.class, fetch = FetchType.LAZY)
    private List<SchoolPerformance> listSchoolPerformance;

    @Column
    @OneToMany(mappedBy = "lesso", targetEntity = Lesson.class, fetch = FetchType.LAZY)
    private List<Lesson> listLessons;

    @ManyToMany(mappedBy = "TB_teacher")
    private List<Teacher> listTeachers;

    public StudentClass() {
        listDicipline = new ArrayList<Discipline>();
        listLessons = new ArrayList<Lesson>();
        listSchoolPerformance = new ArrayList<SchoolPerformance>();
        listTeachers = new ArrayList<Teacher>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Discipline> getListDicipline() {
        return listDicipline;
    }

    public void setListDicipline(List<Discipline> listDicipline) {
        this.listDicipline = listDicipline;
    }

    public List<SchoolPerformance> getListSchoolPerformance() {
        return listSchoolPerformance;
    }

    public void setListSchoolPerformance(List<SchoolPerformance> listSchoolPerformance) {
        this.listSchoolPerformance = listSchoolPerformance;
    }

    public List<Lesson> getListLessons() {
        return listLessons;
    }

    public void setListLessons(List<Lesson> listLessons) {
        this.listLessons = listLessons;
    }

    public List<Teacher> getListTeachers() {
        return listTeachers;
    }

    public void setListTeachers(List<Teacher> listTeachers) {
        this.listTeachers = listTeachers;
    }

}
