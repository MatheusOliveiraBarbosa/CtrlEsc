package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.BirthRecord;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.CertificateReservist;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.ElectionTitle;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.PortfolioWork;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table (name = "TB_student")
class Student extends Person{
    
    @Column (name = "student_year")
    @Min( value = 0 )
    private int studentYear;
    
    @Column (name = "student_number_brothers_scholarship")
    private int studentNumberBrothersScholarship;
    
    @Column (name = "student_certificate_reservist")
    private CertificateReservist studentCertificateReservist;
    
    @Column (name = "student_election_title")
    private ElectionTitle studentElectionTitle;
    
    @Column (name = "student_birth_record")
    private BirthRecord studentBirthRecord;
    
    @Column (name = "student_father_alive")
    private boolean studentFatherAlive;
    
    @Column (name = "student_mother_alive")
    private boolean studentMotherAlive;
    
    @Column (name = "student_profession",length = 50)
    private String studentProfession;
    
    @Column (name = "student_portfolio_work")
    private PortfolioWork studentPortfolioWork;
    
    @Column(name = "student_pension_organ", length = 100)
    private String studentPensionOrgan;
    
    @Column (name = "student_period", length = 20)
    private String studentPeriod;
    
    @Column (name = "student_level_education", length = 20)
    private String studentLevelEducation;
    
    @Column (name = "student_number_brother_student")
    private int studentNumberBrotherStudent;
    
    private Responsible studentResponsible;
    
    @OneToMany (mappedBy = "schoolPerformance", targetEntity = SchoolPerformance.class, fetch = FetchType.LAZY)  
    private List<SchoolPerformance> studentListSchoolPerformances;
    
    @OneToMany (mappedBy = "lesson", targetEntity = Lesson.class, fetch = FetchType.LAZY) 
    private List<Lesson> studentListLessons;
    
    
    
}
