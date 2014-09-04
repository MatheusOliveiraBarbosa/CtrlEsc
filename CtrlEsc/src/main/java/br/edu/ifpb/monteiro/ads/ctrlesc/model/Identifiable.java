package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.io.Serializable;
import javax.enterprise.inject.Default;

/**
 * Identifiable of the entities interface contains only method of recovery 
 * and a method of creation. 
 * 
 * @author E.Wellington
 * 
 */
@Default
public interface Identifiable extends Serializable{
    
    public Long getId();

  
}
