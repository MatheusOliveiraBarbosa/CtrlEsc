
package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table (name = "TB_discipline")
public class Discipline extends Identifiable {
    
    @Column(length = 50, nullable = false)
    private String name;
    
    @Column
    private String description;
    
    @Column
    @ManyToMany(mappedBy = "TB_studentClass")
    private List<StudentClass> listStudentClasses;
    
    @Column
    @ManyToMany(mappedBy = "TB_teacher")
    private List<Teacher> listTeachers;

    
    public Discipline(String name, String description, List<StudentClass> listStudentClasses, List<Teacher> listTeachers) {
        this.name = name;
        this.description = description;
        this.listStudentClasses = listStudentClasses;
        this.listTeachers = listTeachers;
    }

    public Discipline() {
        listStudentClasses = new ArrayList<StudentClass>();
        listTeachers = new ArrayList<Teacher>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<StudentClass> getListStudentClasses() {
        return listStudentClasses;
    }

    public void setListStudentClasses(List<StudentClass> listStudentClasses) {
        this.listStudentClasses = listStudentClasses;
    }

    public List<Teacher> getListTeachers() {
        return listTeachers;
    }

    public void setListTeachers(List<Teacher> listTeachers) {
        this.listTeachers = listTeachers;
    }
    
    
    
    
    
}
