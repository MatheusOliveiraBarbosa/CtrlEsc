package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 *
 * @author E.Wellington
 */
@Embeddable
public class PortfolioWork {

    public PortfolioWork(int number, String series) {
        this.number = number;
        this.series = series;
    }
    
    
    
    
    private int number;
    
    private String series;

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
