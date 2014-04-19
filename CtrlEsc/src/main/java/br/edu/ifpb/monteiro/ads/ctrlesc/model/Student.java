package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.BirthRecord;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.CertificateReservist;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.ElectionTitle;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.PortfolioWork;
import java.util.ArrayList;
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

    public Student(int year, int numberBrothersScholarship, CertificateReservist certificateReservist, ElectionTitle electionTitle, BirthRecord birthRecord, boolean fatherAlive, boolean motherAlive, String profession, PortfolioWork portfolioWork, String pensionOrgan, String period, String levelEducation, int numberBrotherStudent, List<SchoolPerformance> listSchoolPerformances, List<Lesson> listLessons, Responsible responsible) {
        this.year = year;
        this.numberBrothersScholarship = numberBrothersScholarship;
        this.certificateReservist = certificateReservist;
        this.electionTitle = electionTitle;
        this.birthRecord = birthRecord;
        this.fatherAlive = fatherAlive;
        this.motherAlive = motherAlive;
        this.profession = profession;
        this.portfolioWork = portfolioWork;
        this.pensionOrgan = pensionOrgan;
        this.period = period;
        this.levelEducation = levelEducation;
        this.numberBrotherStudent = numberBrotherStudent;
        this.listSchoolPerformances = listSchoolPerformances;
        this.listLessons = listLessons;
        this.responsible = responsible;
    }

    public Student() {
        listLessons = new ArrayList<Lesson>();
        listSchoolPerformances = new ArrayList<SchoolPerformance>();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberBrothersScholarship() {
        return numberBrothersScholarship;
    }

    public void setNumberBrothersScholarship(int numberBrothersScholarship) {
        this.numberBrothersScholarship = numberBrothersScholarship;
    }

    public CertificateReservist getCertificateReservist() {
        return certificateReservist;
    }

    public void setCertificateReservist(CertificateReservist certificateReservist) {
        this.certificateReservist = certificateReservist;
    }

    public ElectionTitle getElectionTitle() {
        return electionTitle;
    }

    public void setElectionTitle(ElectionTitle electionTitle) {
        this.electionTitle = electionTitle;
    }

    public BirthRecord getBirthRecord() {
        return birthRecord;
    }

    public void setBirthRecord(BirthRecord birthRecord) {
        this.birthRecord = birthRecord;
    }

    public boolean isFatherAlive() {
        return fatherAlive;
    }

    public void setFatherAlive(boolean fatherAlive) {
        this.fatherAlive = fatherAlive;
    }

    public boolean isMotherAlive() {
        return motherAlive;
    }

    public void setMotherAlive(boolean motherAlive) {
        this.motherAlive = motherAlive;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public PortfolioWork getPortfolioWork() {
        return portfolioWork;
    }

    public void setPortfolioWork(PortfolioWork portfolioWork) {
        this.portfolioWork = portfolioWork;
    }

    public String getPensionOrgan() {
        return pensionOrgan;
    }

    public void setPensionOrgan(String pensionOrgan) {
        this.pensionOrgan = pensionOrgan;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getLevelEducation() {
        return levelEducation;
    }

    public void setLevelEducation(String levelEducation) {
        this.levelEducation = levelEducation;
    }

    public int getNumberBrotherStudent() {
        return numberBrotherStudent;
    }

    public void setNumberBrotherStudent(int numberBrotherStudent) {
        this.numberBrotherStudent = numberBrotherStudent;
    }

    public List<SchoolPerformance> getListSchoolPerformances() {
        return listSchoolPerformances;
    }

    public void setListSchoolPerformances(List<SchoolPerformance> listSchoolPerformances) {
        this.listSchoolPerformances = listSchoolPerformances;
    }

    public List<Lesson> getListLessons() {
        return listLessons;
    }

    public void setListLessons(List<Lesson> listLessons) {
        this.listLessons = listLessons;
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }
 
    
    
}
