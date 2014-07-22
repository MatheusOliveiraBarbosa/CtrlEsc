package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Entity SchoolPerformance contains atribudos and methods of creating a 
 * school performance.
 * @author E.Wellington
 */

@Entity
@Table (name = "TB_schoolPerformance")
public class SchoolPerformance implements Identifiable<SchoolPerformance>{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column (name = "schoolPerformance_bimonthly_synthesis")
    @Min(value =0)
    @Max(value = 10)
    private double bimonthlySynthesis;
    
    @Column (name = "schoolPerformance_final_teste")
    @Min(value = 0)
    @Max (value = 10)
    private double finalTeste;
    
    @Column (name = "schoolPerformance_final_media")
    @Min(value = 0)
    @Max (value = 10)
    private double finalMedia;
    
    @ManyToOne
    @JoinColumn(name = "schoolPerfomanceStudentClass")
    private StudentClass schoolPerformanceStudentClass;
    
    @ManyToOne
    @JoinColumn(name = "schoolPerformanceStudent")
    private Student schoolPerformanceStudent;
    
    @OneToOne(cascade = CascadeType.ALL, optional = true)
    private TwoMonths schoolPerformanceFirstTwoMonths;
    
    @OneToOne(cascade = CascadeType.ALL, optional = true)
    private TwoMonths schoolPerformanceSecondTwoMonths;
    
    @OneToOne(cascade = CascadeType.ALL, optional = true)
    private TwoMonths schoolPerformanceThirdTwoMonths;
    
    @OneToOne(cascade = CascadeType.ALL, optional = true)
    private TwoMonths schoolPerformanceFourthTwoMonths;

    public SchoolPerformance() {
    }

    public SchoolPerformance(double bimonthlySynthesis, double finalTeste, double finalMedia, StudentClass schoolPerformanceStudentClass, Student schoolPerformanceStudent, TwoMonths schoolPerformanceFirstTwoMonths, TwoMonths schoolPerformanceSecondTwoMonths, TwoMonths schoolPerformanceThirdTwoMonths, TwoMonths schoolPerformanceFourthTwoMonths) {
        this.bimonthlySynthesis = bimonthlySynthesis;
        this.finalTeste = finalTeste;
        this.finalMedia = finalMedia;
        this.schoolPerformanceStudentClass = schoolPerformanceStudentClass;
        this.schoolPerformanceStudent = schoolPerformanceStudent;
        this.schoolPerformanceFirstTwoMonths = schoolPerformanceFirstTwoMonths;
        this.schoolPerformanceSecondTwoMonths = schoolPerformanceSecondTwoMonths;
        this.schoolPerformanceThirdTwoMonths = schoolPerformanceThirdTwoMonths;
        this.schoolPerformanceFourthTwoMonths = schoolPerformanceFourthTwoMonths;
    }

    public double getBimonthlySynthesis() {
        return bimonthlySynthesis;
    }

    public void setBimonthlySynthesis(double bimonthlySynthesis) {
        this.bimonthlySynthesis = bimonthlySynthesis;
    }

    //Get's and Set's 
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

    public StudentClass getSchoolPerformanceStudentClass() {
        return schoolPerformanceStudentClass;
    }

    public void setSchoolPerformanceStudentClass(StudentClass schoolPerformanceStudentClass) {
        this.schoolPerformanceStudentClass = schoolPerformanceStudentClass;
    }

    public Student getSchoolPerformanceStudent() {
        return schoolPerformanceStudent;
    }

    public void setSchoolPerformanceStudent(Student schoolPerformanceStudent) {
        this.schoolPerformanceStudent = schoolPerformanceStudent;
    }

    public TwoMonths getSchoolPerformanceFirstTwoMonths() {
        return schoolPerformanceFirstTwoMonths;
    }

    public void setSchoolPerformanceFirstTwoMonths(TwoMonths schoolPerformanceFirstTwoMonths) {
        this.schoolPerformanceFirstTwoMonths = schoolPerformanceFirstTwoMonths;
    }

    public TwoMonths getSchoolPerformanceSecondTwoMonths() {
        return schoolPerformanceSecondTwoMonths;
    }

    public void setSchoolPerformanceSecondTwoMonths(TwoMonths schoolPerformanceSecondTwoMonths) {
        this.schoolPerformanceSecondTwoMonths = schoolPerformanceSecondTwoMonths;
    }

    public TwoMonths getSchoolPerformanceThirdTwoMonths() {
        return schoolPerformanceThirdTwoMonths;
    }

    public void setSchoolPerformanceThirdTwoMonths(TwoMonths schoolPerformanceThirdTwoMonths) {
        this.schoolPerformanceThirdTwoMonths = schoolPerformanceThirdTwoMonths;
    }

    public TwoMonths getSchoolPerformanceFourthTwoMonths() {
        return schoolPerformanceFourthTwoMonths;
    }

    public void setSchoolPerformanceFourthTwoMonths(TwoMonths schoolPerformanceFourthTwoMonths) {
        this.schoolPerformanceFourthTwoMonths = schoolPerformanceFourthTwoMonths;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id= id;
    }
    
    
    
}
