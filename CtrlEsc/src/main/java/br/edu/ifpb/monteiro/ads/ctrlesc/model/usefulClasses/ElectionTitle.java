package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 * Helper class containing attributes for creating an election title.
 * 
 * @author E.Wellington
 */

@Embeddable
public class ElectionTitle {

    private int number;
    
    private int section;
    
    private int zone;
    
    private String stateEmitter;
    
    public ElectionTitle(int number, int section, int zone, String stateEmitter) {
        this.number = number;
        this.section = section;
        this.zone = zone;
        this.stateEmitter = stateEmitter;
    }
    
    public ElectionTitle(){
        
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getStateEmitter() {
        return stateEmitter;
    }

    public void setStateEmitter(String stateEmitter) {
        this.stateEmitter = stateEmitter;
    }
     
}
