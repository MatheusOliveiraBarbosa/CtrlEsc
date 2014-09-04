package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


/**
 * Entity TwoMonths contains atribudos and methods of creating a 
 * two months.
 *
 * @author Ricardo
 */
@br.edu.ifpb.monteiro.ads.ctrlesc.model.qualifiers.TwoMonths
@Entity
@Table(name = "TB_twoMonths")
public class TwoMonths implements Identifiable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "twoMonths_exercise_first")
    @Min(value = 0)
    @Max(value = 100)
    private Integer twoMonthsExerciseFirst;

    @Column(name = "twoMonths_exercise_second")
    @Min(value = 0)
    @Max(value = 100)
    private Integer twoMonthsExerciseSecond;

    @Column(name = "twoMonths_exercise_third")
    @Min(value = 0)
    @Max(value = 100)
    private Integer twoMonthsExerciseThird;
    
    @Column(name = "twoMonths_exercise_quater")
    @Min(value = 0)
    @Max(value = 100)
    private Integer twoMonthsExerciseQuater;

    @Column(name = "twoMonths_recuperation_first")
    @Min(value = 0)
    @Max(value = 100)
    private Integer twoMonthsRecuperationFirst;

    @Column(name = "twoMonths_recuperation_second")
    @Min(value = 0)
    @Max(value = 100)
    private Integer twoMonthsRecuperationSecond;

    @Column(name = "twoMonths_recuperation_third")
    @Min(value = 0)
    @Max(value = 100)
    private Integer twoMonthsRecuperationThird;
    
    @Column(name = "twoMonths_recuperation_quater")
    @Min(value = 0)
    @Max(value = 100)
    private Integer twoMonthsRecuperationQuater;

    @Column(name = "twoMonths_number_twoMonths")
    @Min(value = 1)
    @Max(value = 4)
    private Integer twoMonthsNumberTwoMonths;
    
//    @OneToOne (mappedBy = "schoolPerformanceFirstTwoMonths", targetEntity = SchoolPerformance.class)
//    private SchoolPerformance twoMonthsSchoolPerformance;
    
    public TwoMonths(Long id, Integer twoMonthsExerciseFirst, Integer twoMonthsExerciseSecond, Integer twoMonthsExerciseThird, Integer twoMonthsExerciseQuater, Integer twoMonthsRecuperationFirst, Integer twoMonthsRecuperationSecond, Integer twoMonthsRecuperationThird, Integer twoMonthsRecuperationQuater, Integer twoMonthsNumberTwoMonths) {
        this.id = id;
        this.twoMonthsExerciseFirst = twoMonthsExerciseFirst;
        this.twoMonthsExerciseSecond = twoMonthsExerciseSecond;
        this.twoMonthsExerciseThird = twoMonthsExerciseThird;
        this.twoMonthsExerciseQuater = twoMonthsExerciseQuater;
        this.twoMonthsRecuperationFirst = twoMonthsRecuperationFirst;
        this.twoMonthsRecuperationSecond = twoMonthsRecuperationSecond;
        this.twoMonthsRecuperationThird = twoMonthsRecuperationThird;
        this.twoMonthsRecuperationQuater = twoMonthsRecuperationQuater;
        this.twoMonthsNumberTwoMonths = twoMonthsNumberTwoMonths;
    }
    
    public TwoMonths() {
    }

    //Get's and Set's 
    public Integer getTwoMonthsExerciseFirst() {
        return twoMonthsExerciseFirst;
    }

    public void setTwoMonthsExerciseFirst(Integer twoMonthsExerciseFirst) {
        this.twoMonthsExerciseFirst = twoMonthsExerciseFirst;
    }

    public Integer getTwoMonthsExerciseSecond() {
        return twoMonthsExerciseSecond;
    }

    public void setTwoMonthsExerciseSecond(Integer twoMonthsExerciseSecond) {
        this.twoMonthsExerciseSecond = twoMonthsExerciseSecond;
    }

    public Integer getTwoMonthsExerciseThird() {
        return twoMonthsExerciseThird;
    }

    public void setTwoMonthsExerciseThird(Integer twoMonthsExerciseThird) {
        this.twoMonthsExerciseThird = twoMonthsExerciseThird;
    }

    public Integer getTwoMonthsExerciseQuater() {
        return twoMonthsExerciseQuater;
    }

    public void setTwoMonthsExerciseQuater(Integer twoMonthsExerciseQuater) {
        this.twoMonthsExerciseQuater = twoMonthsExerciseQuater;
    }

    public Integer getTwoMonthsRecuperationFirst() {
        return twoMonthsRecuperationFirst;
    }

    public void setTwoMonthsRecuperationFirst(Integer twoMonthsRecuperationFirst) {
        this.twoMonthsRecuperationFirst = twoMonthsRecuperationFirst;
    }

    public Integer getTwoMonthsRecuperationSecond() {
        return twoMonthsRecuperationSecond;
    }

    public void setTwoMonthsRecuperationSecond(Integer twoMonthsRecuperationSecond) {
        this.twoMonthsRecuperationSecond = twoMonthsRecuperationSecond;
    }

    public Integer getTwoMonthsRecuperationThird() {
        return twoMonthsRecuperationThird;
    }

    public void setTwoMonthsRecuperationThird(Integer twoMonthsRecuperationThird) {
        this.twoMonthsRecuperationThird = twoMonthsRecuperationThird;
    }

    public Integer getTwoMonthsRecuperationQuater() {
        return twoMonthsRecuperationQuater;
    }

    public void setTwoMonthsRecuperationQuater(Integer twoMonthsRecuperationQuater) {
        this.twoMonthsRecuperationQuater = twoMonthsRecuperationQuater;
    }

    public Integer getTwoMonthsNumberTwoMonths() {
        return twoMonthsNumberTwoMonths;
    }

    public void setTwoMonthsNumberTwoMonths(Integer twoMonthsNumberTwoMonths) {
        this.twoMonthsNumberTwoMonths = twoMonthsNumberTwoMonths;
    }

     @Override
    public Long getId(){
        return id;
    }
    
   
}
