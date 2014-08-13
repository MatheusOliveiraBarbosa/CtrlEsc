package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 * Helper class containing attributes for creating an election title.
 * 
 * @author E.Wellington
 */

@Embeddable
public class ElectionTitle {

    private int numberElectionTitle;
    
    private int section;
    
    private int zone;
    
    private String stateEmitterElectionTitle;
    
    public ElectionTitle(int number, int section, int zone, String stateEmitter) {
        this.numberElectionTitle = number;
        this.section = section;
        this.zone = zone;
        this.stateEmitterElectionTitle = stateEmitter;
    }
    
    public ElectionTitle(){
        
    }
    
    public int getNumberElectionTitle() {
        return numberElectionTitle;
    }

    public void setNumberElectionTitle(int numberElectionTitle) {
        this.numberElectionTitle = numberElectionTitle;
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

    public String getStateEmitterElectionTitle() {
        return stateEmitterElectionTitle;
    }

    public void setStateEmitterElectionTitle(String stateEmitterElectionTitle) {
        this.stateEmitterElectionTitle = stateEmitterElectionTitle;
    }
     
}
