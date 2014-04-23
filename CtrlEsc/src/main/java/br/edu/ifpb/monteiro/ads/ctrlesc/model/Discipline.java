
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
    
    @Column(name = "discipline_name", length = 50, nullable = false)
    private String disciplineName;
    
    @Column (name = "discipline_description")
    private String disciplineDescription;
    
    @ManyToMany(mappedBy = "listDicipline", targetEntity = StudentClass.class)
    private List<StudentClass> disciplineListStudentClasses;
    
    @ManyToMany(mappedBy = "listDicipline", targetEntity = Teacher.class)
    private List<Teacher> disciplineListTeachers;

    
    public Discipline(String name, String description, List<StudentClass> listStudentClasses, List<Teacher> listTeachers) {
        this.disciplineName = name;
        this.disciplineDescription = description;
        this.disciplineListStudentClasses = listStudentClasses;
        this.disciplineListTeachers = listTeachers;
    }

    public Discipline() {
        disciplineListStudentClasses = new ArrayList<StudentClass>();
        disciplineListTeachers = new ArrayList<Teacher>();
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public String getDisciplineDescription() {
        return disciplineDescription;
    }

    public void setDisciplineDescription(String disciplineDescription) {
        this.disciplineDescription = disciplineDescription;
    }

    public List<StudentClass> getDisciplineListStudentClasses() {
        return disciplineListStudentClasses;
    }

    public void setDisciplineListStudentClasses(List<StudentClass> disciplineListStudentClasses) {
        this.disciplineListStudentClasses = disciplineListStudentClasses;
    }

    public List<Teacher> getDisciplineListTeachers() {
        return disciplineListTeachers;
    }

    public void setDisciplineListTeachers(List<Teacher> disciplineListTeachers) {
        this.disciplineListTeachers = disciplineListTeachers;
    }
    
    
   
    
    
    
    
}
