
package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table (name = "TB_discipline")
public class Discipline extends Identifiable {
    
    private String name;
    
    private String description;
    
    private List<StudentClass> listStudentClasses;
    
    private List<Teacher> listTeachers;
    
    
    
}
