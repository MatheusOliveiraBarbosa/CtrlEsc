package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import java.io.Serializable;

/**
 * Identifiable of the entities interface contains only method of recovery 
 * and a method of creation. 
 * 
 * @author E.Wellington
 * @param <T>
 */
public interface Identifiable<T> extends Serializable{
    
    public Long getId();

    public void setId(Long id);
}
