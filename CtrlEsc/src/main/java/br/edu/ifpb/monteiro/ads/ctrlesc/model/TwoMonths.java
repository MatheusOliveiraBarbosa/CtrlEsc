package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "TB_twoMonths")
public class TwoMonths extends Identifiable {

    @Column(name = "twoMonths_exercise_first")
    @Min(value = 0)
    @Max(value = 10)
    private double twoMonthsExerciseFirst;

    @Column(name = "twoMonths_exercise_second")
    @Min(value = 0)
    @Max(value = 10)
    private double twoMonthsExerciseSecond;

    @Column(name = "twoMonths_exercise_third")
    @Min(value = 0)
    @Max(value = 10)
    private double twoMonthsExerciseThird;

    @Column(name = "twoMonths_recuperation_first")
    @Min(value = 0)
    @Max(value = 10)
    private double twoMonthsRecuperationFirst;

    @Column(name = "twoMonths_recuperation_second")
    @Min(value = 0)
    @Max(value = 10)
    private double twoMonthsRecuperationSecond;

    @Column(name = "twoMonths_recuperation_third")
    @Min(value = 0)
    @Max(value = 10)
    private double twoMonthsRecuperationThird;

    @Column(name = "twoMonths_number_twoMonths")
    @Min(value = 1)
    @Max(value = 4)
    private int twoMonthsNumberTwoMonths;
    
    @OneToOne (mappedBy = "schoolPerformanceFirstTwoMonths", targetEntity = SchoolPerformance.class)
    private SchoolPerformance twoMonthsSchoolPerformance;

    public TwoMonths(double twoMonthsExerciseFirst, double twoMonthsExerciseSecond, double twoMonthsExerciseThird, double twoMonthsRecuperationFirst, double twoMonthsRecuperationSecond, double twoMonthsRecuperationThird, int twoMonthsNumberTwoMonths, SchoolPerformance twoMonthsSchoolPerformance) {
        this.twoMonthsExerciseFirst = twoMonthsExerciseFirst;
        this.twoMonthsExerciseSecond = twoMonthsExerciseSecond;
        this.twoMonthsExerciseThird = twoMonthsExerciseThird;
        this.twoMonthsRecuperationFirst = twoMonthsRecuperationFirst;
        this.twoMonthsRecuperationSecond = twoMonthsRecuperationSecond;
        this.twoMonthsRecuperationThird = twoMonthsRecuperationThird;
        this.twoMonthsNumberTwoMonths = twoMonthsNumberTwoMonths;
        this.twoMonthsSchoolPerformance = twoMonthsSchoolPerformance;
    }

    public TwoMonths() {
    }

    public double getTwoMonthsExerciseFirst() {
        return twoMonthsExerciseFirst;
    }

    public void setTwoMonthsExerciseFirst(double twoMonthsExerciseFirst) {
        this.twoMonthsExerciseFirst = twoMonthsExerciseFirst;
    }

    public double getTwoMonthsExerciseSecond() {
        return twoMonthsExerciseSecond;
    }

    public void setTwoMonthsExerciseSecond(double twoMonthsExerciseSecond) {
        this.twoMonthsExerciseSecond = twoMonthsExerciseSecond;
    }

    public double getTwoMonthsExerciseThird() {
        return twoMonthsExerciseThird;
    }

    public void setTwoMonthsExerciseThird(double twoMonthsExerciseThird) {
        this.twoMonthsExerciseThird = twoMonthsExerciseThird;
    }

    public double getTwoMonthsRecuperationFirst() {
        return twoMonthsRecuperationFirst;
    }

    public void setTwoMonthsRecuperationFirst(double twoMonthsRecuperationFirst) {
        this.twoMonthsRecuperationFirst = twoMonthsRecuperationFirst;
    }

    public double getTwoMonthsRecuperationSecond() {
        return twoMonthsRecuperationSecond;
    }

    public void setTwoMonthsRecuperationSecond(double twoMonthsRecuperationSecond) {
        this.twoMonthsRecuperationSecond = twoMonthsRecuperationSecond;
    }

    public double getTwoMonthsRecuperationThird() {
        return twoMonthsRecuperationThird;
    }

    public void setTwoMonthsRecuperationThird(double twoMonthsRecuperationThird) {
        this.twoMonthsRecuperationThird = twoMonthsRecuperationThird;
    }

    public int getTwoMonthsNumberTwoMonths() {
        return twoMonthsNumberTwoMonths;
    }

    public void setTwoMonthsNumberTwoMonths(int twoMonthsNumberTwoMonths) {
        this.twoMonthsNumberTwoMonths = twoMonthsNumberTwoMonths;
    }

    public SchoolPerformance getTwoMonthsSchoolPerformance() {
        return twoMonthsSchoolPerformance;
    }

    public void setTwoMonthsSchoolPerformance(SchoolPerformance twoMonthsSchoolPerformance) {
        this.twoMonthsSchoolPerformance = twoMonthsSchoolPerformance;
    }
    
    
}
