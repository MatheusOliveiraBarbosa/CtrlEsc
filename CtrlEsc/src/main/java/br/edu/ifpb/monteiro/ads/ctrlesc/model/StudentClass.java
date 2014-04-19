package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author E.Wellington
 */

@Entity
@Table (name = "TB_studentClass")
public class StudentClass extends Identifiable{
    
    private String name;
    
    private List<Discipline> listDicipline;
    
    private List<SchoolPerformance> listSchoolPerformance;
    
    private List<Lesson> listLessons;
    
    private List<Teacher> listTeachers;
    
    
    
    
    
    
    
    
}
