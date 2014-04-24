package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "TB_teacher")
public class Teacher extends Person {

    @ManyToMany
    @JoinTable(name = "TB_teachersDisciplines", joinColumns = @JoinColumn(name = "id_teacher"), inverseJoinColumns = @JoinColumn(name = "id_discipline"))
    private List<Discipline> teacherListDisciplines;

    @ManyToMany
    @JoinTable(name = "TB_teachersStudentClasses", joinColumns = @JoinColumn(name = "id"))
    private List<StudentClass> teacherListStudentClasses;

    public Teacher(List<Discipline> teacherListDisciplines, List<StudentClass> teacherListStudentClasses) {
        this.teacherListDisciplines = teacherListDisciplines;
        this.teacherListStudentClasses = teacherListStudentClasses;
    }

    public Teacher() {
        teacherListDisciplines = new ArrayList<Discipline>();
        teacherListStudentClasses = new ArrayList<StudentClass>();
    }

    public List<Discipline> getTeacherListDisciplines() {
        return teacherListDisciplines;
    }

    public void setTeacherListDisciplines(List<Discipline> teacherListDisciplines) {
        this.teacherListDisciplines = teacherListDisciplines;
    }

    public List<StudentClass> getTeacherListStudentClasses() {
        return teacherListStudentClasses;
    }

    public void setTeacherListStudentClasses(List<StudentClass> teacherListStudentClasses) {
        this.teacherListStudentClasses = teacherListStudentClasses;
    }

}


