
package br.edu.ifpb.monteiro.ads.ctrlesc.model.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Entity Discipline contains atribudos and methods of creating a 
 * discipline.
 * @author E.Wellington
 */
@br.edu.ifpb.monteiro.ads.ctrlesc.model.qualifiers.Discipline
@Entity
@Table (name = "TB_discipline")
public class Discipline implements Identifiable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "discipline_name", length = 50, nullable = false)
    private String disciplineName;
    
    @Column (name = "discipline_description")
    private String disciplineDescription;
    
    @ManyToMany(mappedBy = "studentClassListDicipline", targetEntity = StudentClass.class)
    private List<StudentClass> disciplineListStudentClasses;
    
    @ManyToMany(mappedBy = "teacherListDisciplines", targetEntity = Teacher.class)
    private List<Teacher> disciplineListTeachers;

    
    public Discipline(String name, String description, List<StudentClass> listStudentClasses, List<Teacher> listTeachers) {
        this.disciplineName = name;
        this.disciplineDescription = description;
        this.disciplineListStudentClasses = listStudentClasses;
        this.disciplineListTeachers = listTeachers;
    }

    public Discipline() {
        
    }

    // Get's and Set's
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
    
    
    @Override
    public Long getId(){
        return id;
    }
    
   
    
}
