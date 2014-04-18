package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.BirthRecord;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.CertificateReservist;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.ElectionTitle;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.PortfolioWork;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table (name = "TB_student")
class Student extends Person{

    private int year;
    
    private int numberBrothersScholarship;
    
    private CertificateReservist certificateReservist;
    
    private ElectionTitle electionTitle;
    
    private BirthRecord birthRecord;
    
    private boolean fatherAlive;
    
    private boolean motherAlive;
    
    private String profession;
    
    private PortfolioWork portfolioWork;
    
    private String pensionOrgan;
    
    private String period;
    
    private String levelEducation;
    
    private int numberBrotherStudent;
    
    private List<SchoolPerformance> listSchoolPerformances;
    
    private List<Lesson> listLessons;
    
    private Responsible responsible;
    
}
