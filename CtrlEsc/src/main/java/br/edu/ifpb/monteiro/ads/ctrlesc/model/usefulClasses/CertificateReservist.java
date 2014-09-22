
package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 * Helper class containing attributes for creating an certificate reservist.
 * @author E.Wellington
 */
@Embeddable
public class CertificateReservist implements Serializable{

    private Integer numberCertificateReservist;
    
    private String category;
    
    private String stateEmitterCertificateReservist;
    
    public CertificateReservist(Integer number, String category, String stateEmitter) {
        this.numberCertificateReservist = number;
        this.category = category;
        this.stateEmitterCertificateReservist = stateEmitter;
    }
    public CertificateReservist(){
        
    }
    
    public Integer getNumberCertificateReservist() {
        return numberCertificateReservist;
    }

    public void setNumberCertificateReservist(Integer numberCertificateReservist) {
        this.numberCertificateReservist = numberCertificateReservist;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStateEmitterCertificateReservist() {
        return stateEmitterCertificateReservist;
    }

    public void setStateEmitterCertificateReservist(String stateEmitterCertificateReservist) {
        this.stateEmitterCertificateReservist = stateEmitterCertificateReservist;
    }
    
}
