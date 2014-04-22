package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author E.Wellington
 */

@Entity
@Table(name = "TB_twoMonths")
public class TwoMonths extends Identifiable{
    
    @Column
    private double exerciseFirst;
    
    @Column
    private double exerciseSecond;
    
    @Column
    private double exerciseThird;
    
    @Column
    private double recuperationFirst;
    
    @Column
    private double recuperationSecond;
    
    @Column
    private double recuperationThird;
    
    @Column
    private int numberTwoMonths;

    public TwoMonths() {
    }

    public TwoMonths(double exerciseFirst, double exerciseSecond, double exerciseThird, double recuperationFirst, double recuperationSecond, double recuperationThird, int numberTwoMonths) {
        this.exerciseFirst = exerciseFirst;
        this.exerciseSecond = exerciseSecond;
        this.exerciseThird = exerciseThird;
        this.recuperationFirst = recuperationFirst;
        this.recuperationSecond = recuperationSecond;
        this.recuperationThird = recuperationThird;
        this.numberTwoMonths = numberTwoMonths;
    }

    public double getExerciseFirst() {
        return exerciseFirst;
    }

    public void setExerciseFirst(double exerciseFirst) {
        this.exerciseFirst = exerciseFirst;
    }

    public double getExerciseSecond() {
        return exerciseSecond;
    }

    public void setExerciseSecond(double exerciseSecond) {
        this.exerciseSecond = exerciseSecond;
    }

    public double getExerciseThird() {
        return exerciseThird;
    }

    public void setExerciseThird(double exerciseThird) {
        this.exerciseThird = exerciseThird;
    }

    public double getRecuperationFirst() {
        return recuperationFirst;
    }

    public void setRecuperationFirst(double recuperationFirst) {
        this.recuperationFirst = recuperationFirst;
    }

    public double getRecuperationSecond() {
        return recuperationSecond;
    }

    public void setRecuperationSecond(double recuperationSecond) {
        this.recuperationSecond = recuperationSecond;
    }

    public double getRecuperationThird() {
        return recuperationThird;
    }

    public void setRecuperationThird(double recuperationThird) {
        this.recuperationThird = recuperationThird;
    }

    public int getNumberTwoMonths() {
        return numberTwoMonths;
    }

    public void setNumberTwoMonths(int numberTwoMonths) {
        this.numberTwoMonths = numberTwoMonths;
    }
    
    
    
}
