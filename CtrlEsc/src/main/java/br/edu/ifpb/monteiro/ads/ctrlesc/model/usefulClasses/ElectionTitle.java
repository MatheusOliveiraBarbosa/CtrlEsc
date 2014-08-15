package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 * Helper class containing attributes for creating an election title.
 * 
 * @author E.Wellington
 */

@Embeddable
public class ElectionTitle {

    private Integer numberElectionTitle;
    
    private Integer section;
    
    private Integer zone;
    
    private String stateEmitterElectionTitle;
    
    public ElectionTitle(Integer number, Integer section, Integer zone, String stateEmitter) {
        this.numberElectionTitle = number;
        this.section = section;
        this.zone = zone;
        this.stateEmitterElectionTitle = stateEmitter;
    }
    
    public ElectionTitle(){
        
    }
    
    public Integer getNumberElectionTitle() {
        return numberElectionTitle;
    }

    public void setNumberElectionTitle(Integer numberElectionTitle) {
        this.numberElectionTitle = numberElectionTitle;
    }

    public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }

    public Integer getZone() {
        return zone;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

    public String getStateEmitterElectionTitle() {
        return stateEmitterElectionTitle;
    }

    public void setStateEmitterElectionTitle(String stateEmitterElectionTitle) {
        this.stateEmitterElectionTitle = stateEmitterElectionTitle;
    }
     
}
