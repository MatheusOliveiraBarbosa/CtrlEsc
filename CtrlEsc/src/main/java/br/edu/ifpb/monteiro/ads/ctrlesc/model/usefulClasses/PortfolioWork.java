package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 * Helper class containing attributes for creating an portfolio work.
 * 
 * @author E.Wellington
 */
@Embeddable
public class PortfolioWork {

    private int numberPortfolioWork;
    
    private String series;
    
    public PortfolioWork(int number, String series) {
        this.numberPortfolioWork = number;
        this.series = series;
    }
    
    public PortfolioWork(){
        
    }
       
    public int getNumberPortfolioWork() {
        return numberPortfolioWork;
    }

    public void setNumberPortfolioWork(int numberPortfolioWork) {
        this.numberPortfolioWork = numberPortfolioWork;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    
     
}
