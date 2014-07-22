package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 * Helper class containing attributes for creating an portfolio work.
 * 
 * @author E.Wellington
 */
@Embeddable
public class PortfolioWork {

    private int number;
    
    private String series;
    
    public PortfolioWork(int number, String series) {
        this.number = number;
        this.series = series;
    }
    
    public PortfolioWork(){
        
    }
       
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    
     
}
