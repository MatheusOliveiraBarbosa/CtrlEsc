package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 * Helper class containing attributes for creating an portfolio work.
 * 
 * @author E.Wellington
 */
@Embeddable
public class PortfolioWork implements Serializable{

    private Integer numberPortfolioWork;
    
    private String series;
    
    public PortfolioWork(Integer number, String series) {
        this.numberPortfolioWork = number;
        this.series = series;
    }
    
    public PortfolioWork(){
        
    }
       
    public Integer getNumberPortfolioWork() {
        return numberPortfolioWork;
    }

    public void setNumberPortfolioWork(Integer numberPortfolioWork) {
        this.numberPortfolioWork = numberPortfolioWork;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    
     
}
