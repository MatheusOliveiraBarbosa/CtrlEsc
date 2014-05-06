package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author E.Wellington
 */
public interface Identifiable<T> extends Serializable{
    
    public Long getId();

    public void setId(Long id);
}
