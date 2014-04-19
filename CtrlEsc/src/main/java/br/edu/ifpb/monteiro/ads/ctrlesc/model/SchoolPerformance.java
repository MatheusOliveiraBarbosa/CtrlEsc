package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author E.Wellington
 */

@Entity
@Table (name = "TB_schoolPerformance")
public class SchoolPerformance extends Identifiable{
    
    private double bimonthlySynthesis;
    
    private double finalTeste;
    
    private double finalMedia;
    
    private StudentClass studentClass;
    
    private Student student;
    
    private TwoMonths firstTwoMonths;
    
    private TwoMonths fsecondTwoMonths;
    
    private TwoMonths thirdTwoMonths;
    
    private TwoMonths fourthTwoMonths;

    public SchoolPerformance() {
    }

    public SchoolPerformance(double bimonthlySynthesis, double finalTeste, double finalMedia, StudentClass studentClass, Student student, TwoMonths firstTwoMonths, TwoMonths fsecondTwoMonths, TwoMonths thirdTwoMonths, TwoMonths fourthTwoMonths) {
        this.bimonthlySynthesis = bimonthlySynthesis;
        this.finalTeste = finalTeste;
        this.finalMedia = finalMedia;
        this.studentClass = studentClass;
        this.student = student;
        this.firstTwoMonths = firstTwoMonths;
        this.fsecondTwoMonths = fsecondTwoMonths;
        this.thirdTwoMonths = thirdTwoMonths;
        this.fourthTwoMonths = fourthTwoMonths;
    }

    public double getBimonthlySynthesis() {
        return bimonthlySynthesis;
    }

    public void setBimonthlySynthesis(double bimonthlySynthesis) {
        this.bimonthlySynthesis = bimonthlySynthesis;
    }

    public double getFinalTeste() {
        return finalTeste;
    }

    public void setFinalTeste(double finalTeste) {
        this.finalTeste = finalTeste;
    }

    public double getFinalMedia() {
        return finalMedia;
    }

    public void setFinalMedia(double finalMedia) {
        this.finalMedia = finalMedia;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public TwoMonths getFirstTwoMonths() {
        return firstTwoMonths;
    }

    public void setFirstTwoMonths(TwoMonths firstTwoMonths) {
        this.firstTwoMonths = firstTwoMonths;
    }

    public TwoMonths getFsecondTwoMonths() {
        return fsecondTwoMonths;
    }

    public void setFsecondTwoMonths(TwoMonths fsecondTwoMonths) {
        this.fsecondTwoMonths = fsecondTwoMonths;
    }

    public TwoMonths getThirdTwoMonths() {
        return thirdTwoMonths;
    }

    public void setThirdTwoMonths(TwoMonths thirdTwoMonths) {
        this.thirdTwoMonths = thirdTwoMonths;
    }

    public TwoMonths getFourthTwoMonths() {
        return fourthTwoMonths;
    }

    public void setFourthTwoMonths(TwoMonths fourthTwoMonths) {
        this.fourthTwoMonths = fourthTwoMonths;
    }
    
    
    
}
