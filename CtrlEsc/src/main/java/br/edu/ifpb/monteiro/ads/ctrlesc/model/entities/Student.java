package br.edu.ifpb.monteiro.ads.ctrlesc.model.entities;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.security.User;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Address;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.BirthRecord;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.CertificateReservist;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.ElectionTitle;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.PortfolioWork;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 * Entity Student contains atribudos and methods of creating a 
 * student.
 * @author E.Wellington
 */
@br.edu.ifpb.monteiro.ads.ctrlesc.model.qualifiers.Student
@Entity
@Table (name = "TB_student")
public class Student extends Person{
    
    @Column (name = "student_year")
    @Min( value = 0 )
    private Integer studentYear;
    
    @Column (name = "student_number_brothers_scholarship")
    private Integer studentNumberBrothersScholarship;
    
    @Column (name = "student_registration", length = 50)   
    private String studentRegistration;
    
    @Inject
    @Embedded
    private CertificateReservist studentCertificateReservist;
    
    @Inject
    @Embedded
    private ElectionTitle studentElectionTitle;
    
    @Inject
    @Embedded
    private BirthRecord studentBirthRecord;
       
    @Column (name = "student_profession",length = 50)
    private String studentProfession;
    
    @Inject
    @Embedded
    private PortfolioWork studentPortfolioWork;
    
    @Column(name = "student_pension_organ", length = 100)
    private String studentPensionOrgan;
    
    @Column (name = "student_period", length = 20)
    private String studentPeriod;
    
    @Column (name = "student_level_education", length = 20)
    private String studentLevelEducation;
    
    @Column (name = "student_number_brother_student")
    private Integer studentNumberBrotherStudent;
    
    @ManyToOne
    @JoinColumn(name = "id_responsible")
    private Responsible studentResponsible;
    
    @OneToMany (mappedBy = "schoolPerformanceStudent", targetEntity = SchoolPerformance.class, fetch = FetchType.LAZY)  
    private List<SchoolPerformance> studentListSchoolPerformances;

    @ManyToMany
    @JoinTable(name = "TB_student_lessons", joinColumns = @JoinColumn(name = "id_student"), inverseJoinColumns = @JoinColumn(name = "id_lesson"))
    private List<Lesson> studentListLessons;

    public Student() {}

    public Student(Integer studentYear, Integer studentNumberBrothersScholarship, String studentRegistration, CertificateReservist studentCertificateReservist, ElectionTitle studentElectionTitle, BirthRecord studentBirthRecord, String studentProfession, PortfolioWork studentPortfolioWork, String studentPensionOrgan, String studentPeriod, String studentLevelEducation, Integer studentNumberBrotherStudent, Responsible studentResponsible, List<SchoolPerformance> studentListSchoolPerformances, List<Lesson> studentListLessons, Long id, String personName, String personCpf, Date personDateBirth, Address personAddress, String personBreed, String personRg, char personSex, byte[] personPhoto, String personNationality, Date personEntryDate, String personPhoneOne, String personPhoneTwo, String personCivilStatus, String personNameMother, String personNameFather) {
super(id, personName, personCpf, personDateBirth, personAddress, personBreed, personRg, personSex, personNationality, personEntryDate, personPhoneOne, personPhoneTwo, personCivilStatus, personNameMother, personNameFather);
        this.studentYear = studentYear;
        this.studentNumberBrothersScholarship = studentNumberBrothersScholarship;
        this.studentRegistration = studentRegistration;
        this.studentCertificateReservist = studentCertificateReservist;
        this.studentElectionTitle = studentElectionTitle;
        this.studentBirthRecord = studentBirthRecord;
        this.studentProfession = studentProfession;
        this.studentPortfolioWork = studentPortfolioWork;
        this.studentPensionOrgan = studentPensionOrgan;
        this.studentPeriod = studentPeriod;
        this.studentLevelEducation = studentLevelEducation;
        this.studentNumberBrotherStudent = studentNumberBrotherStudent;
        this.studentResponsible = studentResponsible;
        this.studentListSchoolPerformances = studentListSchoolPerformances;
        this.studentListLessons = studentListLessons;
    }

    //Get's and Set's
    public Integer getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(Integer studentYear) {
        this.studentYear = studentYear;
    }

    public String getStudentRegistration() {
        return studentRegistration;
    }

    public void setStudentRegistration(String studentRegistration) {
        this.studentRegistration = studentRegistration;
    }
    
    public Integer getStudentNumberBrothersScholarship() {
        return studentNumberBrothersScholarship;
    }

    public void setStudentNumberBrothersScholarship(Integer studentNumberBrothersScholarship) {
        this.studentNumberBrothersScholarship = studentNumberBrothersScholarship;
    }

    public CertificateReservist getStudentCertificateReservist() {
        return studentCertificateReservist;
    }

    public void setStudentCertificateReservist(CertificateReservist studentCertificateReservist) {
        this.studentCertificateReservist = studentCertificateReservist;
    }

    public ElectionTitle getStudentElectionTitle() {
        return studentElectionTitle;
    }

    public void setStudentElectionTitle(ElectionTitle studentElectionTitle) {
        this.studentElectionTitle = studentElectionTitle;
    }

    public BirthRecord getStudentBirthRecord() {
        return studentBirthRecord;
    }

    public void setStudentBirthRecord(BirthRecord studentBirthRecord) {
        this.studentBirthRecord = studentBirthRecord;
    }


    public String getStudentProfession() {
        return studentProfession;
    }

    public void setStudentProfession(String studentProfession) {
        this.studentProfession = studentProfession;
    }

    public PortfolioWork getStudentPortfolioWork() {
        return studentPortfolioWork;
    }

    public void setStudentPortfolioWork(PortfolioWork studentPortfolioWork) {
        this.studentPortfolioWork = studentPortfolioWork;
    }

    public String getStudentPensionOrgan() {
        return studentPensionOrgan;
    }

    public void setStudentPensionOrgan(String studentPensionOrgan) {
        this.studentPensionOrgan = studentPensionOrgan;
    }

    public String getStudentPeriod() {
        return studentPeriod;
    }

    public void setStudentPeriod(String studentPeriod) {
        this.studentPeriod = studentPeriod;
    }

    public String getStudentLevelEducation() {
        return studentLevelEducation;
    }

    public void setStudentLevelEducation(String studentLevelEducation) {
        this.studentLevelEducation = studentLevelEducation;
    }

    public Integer getStudentNumberBrotherStudent() {
        return studentNumberBrotherStudent;
    }

    public void setStudentNumberBrotherStudent(Integer studentNumberBrotherStudent) {
        this.studentNumberBrotherStudent = studentNumberBrotherStudent;
    }

    public Responsible getStudentResponsible() {
        return studentResponsible;
    }

    public void setStudentResponsible(Responsible studentResponsible) {
        this.studentResponsible = studentResponsible;
    }

    public List<SchoolPerformance> getStudentListSchoolPerformances() {
        return studentListSchoolPerformances;
    }

    public void setStudentListSchoolPerformances(List<SchoolPerformance> studentListSchoolPerformances) {
        this.studentListSchoolPerformances = studentListSchoolPerformances;
    }

    public List<Lesson> getStudentListLessons() {
        return studentListLessons;
    }

    public void setStudentListLessons(List<Lesson> studentListLessons) {
        this.studentListLessons = studentListLessons;
    }
       
}
