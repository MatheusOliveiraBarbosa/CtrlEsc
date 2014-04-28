
package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 *
 * @author E.Wellington
 */
@Embeddable
public class CertificateReservist {

    public CertificateReservist(int number, String category, String stateEmitter) {
        this.number = number;
        this.category = category;
        this.stateEmitter = stateEmitter;
    }
    
    
    private int number;
    
    private String category;
    
    private String stateEmitter;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStateEmitter() {
        return stateEmitter;
    }

    public void setStateEmitter(String stateEmitter) {
        this.stateEmitter = stateEmitter;
    }
    
    
    
}
