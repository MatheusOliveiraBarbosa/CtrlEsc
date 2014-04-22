package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table(name = "TB_teacher")
public class Teacher extends Person {
    
    @Column
    @ManyToMany
    @JoinTable(name="TB_teachersDisciplines", joinColumns = @JoinColumn(name = "id"))
    private List<Discipline> listDisciplines;
    
    @Column
    @ManyToMany
    @JoinTable(name="TB_teachersStudentClasses", joinColumns = @JoinColumn(name = "id"))
    private List<StudentClass> listStudentClasses;

    public Teacher() {

        listDisciplines = new ArrayList<Discipline>();
        listStudentClasses = new ArrayList<StudentClass>();

    }

    public List<Discipline> getListDisciplines() {
        return listDisciplines;
    }

    public void setListDisciplines(List<Discipline> listDisciplines) {
        this.listDisciplines = listDisciplines;
    }

    public List<StudentClass> getListStudentClasses() {
        return listStudentClasses;
    }

    public void setListStudentClasses(List<StudentClass> listStudentClasses) {
        this.listStudentClasses = listStudentClasses;
    }
    
    

}
