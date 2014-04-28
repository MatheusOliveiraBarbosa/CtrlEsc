package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.BirthRecord;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.CertificateReservist;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.ElectionTitle;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.PortfolioWork;
import java.util.List;
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
    
    @Embedded
    private CertificateReservist studentCertificateReservist;
    
    @Embedded
    private ElectionTitle studentElectionTitle;
    
    @Embedded
    private BirthRecord studentBirthRecord;
    
    @Column (name = "student_father_alive")
    private boolean studentFatherAlive;
    
    @Column (name = "student_mother_alive")
    private boolean studentMotherAlive;
    
    @Column (name = "student_profession",length = 50)
    private String studentProfession;
    
    @Embedded
    private PortfolioWork studentPortfolioWork;
    
    @Column(name = "student_pension_organ", length = 100)
    private String studentPensionOrgan;
    
    @Column (name = "student_period", length = 20)
    private String studentPeriod;
    
    @Column (name = "student_level_education", length = 20)
    private String studentLevelEducation;
    
    @Column (name = "student_number_brother_student")
    private int studentNumberBrotherStudent;
    
    @ManyToOne
    @JoinColumn(name = "id_student")
    private Responsible studentResponsible;
    
    @OneToMany (mappedBy = "schoolPerformance", targetEntity = SchoolPerformance.class, fetch = FetchType.LAZY)  
    private List<SchoolPerformance> studentListSchoolPerformances;

    @ManyToMany
    @JoinTable(name = "TB_student_lessons", joinColumns = @JoinColumn(name = "id_student"), inverseJoinColumns = @JoinColumn(name = "id_lesson"))
    private List<Lesson> studentListLessons;

    public Student() {
    }

    public Student(int studentYear, int studentNumberBrothersScholarship, CertificateReservist studentCertificateReservist, ElectionTitle studentElectionTitle, BirthRecord studentBirthRecord, boolean studentFatherAlive, boolean studentMotherAlive, String studentProfession, PortfolioWork studentPortfolioWork, String studentPensionOrgan, String studentPeriod, String studentLevelEducation, int studentNumberBrotherStudent, Responsible studentResponsible, List<SchoolPerformance> studentListSchoolPerformances, List<Lesson> studentListLessons) {
        this.studentYear = studentYear;
        this.studentNumberBrothersScholarship = studentNumberBrothersScholarship;
        this.studentCertificateReservist = studentCertificateReservist;
        this.studentElectionTitle = studentElectionTitle;
        this.studentBirthRecord = studentBirthRecord;
        this.studentFatherAlive = studentFatherAlive;
        this.studentMotherAlive = studentMotherAlive;
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

    public int getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    public int getStudentNumberBrothersScholarship() {
        return studentNumberBrothersScholarship;
    }

    public void setStudentNumberBrothersScholarship(int studentNumberBrothersScholarship) {
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

    public boolean isStudentFatherAlive() {
        return studentFatherAlive;
    }

    public void setStudentFatherAlive(boolean studentFatherAlive) {
        this.studentFatherAlive = studentFatherAlive;
    }

    public boolean isStudentMotherAlive() {
        return studentMotherAlive;
    }

    public void setStudentMotherAlive(boolean studentMotherAlive) {
        this.studentMotherAlive = studentMotherAlive;
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

    public int getStudentNumberBrotherStudent() {
        return studentNumberBrotherStudent;
    }

    public void setStudentNumberBrotherStudent(int studentNumberBrotherStudent) {
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
