
package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 * Helper class containing attributes for creating an certificate reservist.
 * @author E.Wellington
 */
@Embeddable
public class CertificateReservist {

    private int numberCertificateReservist;
    
    private String category;
    
    private String stateEmitterCertificateReservist;
    
    public CertificateReservist(int number, String category, String stateEmitter) {
        this.numberCertificateReservist = number;
        this.category = category;
        this.stateEmitterCertificateReservist = stateEmitter;
    }
    public CertificateReservist(){
        
    }
    
    public int getNumberCertificateReservist() {
        return numberCertificateReservist;
    }

    public void setNumberCertificateReservist(int numberCertificateReservist) {
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
