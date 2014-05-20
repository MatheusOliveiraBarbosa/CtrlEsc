package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Identifiable;

/**
 * @author Matheus
 * @param <T>
 */
public interface GenericDAO<T extends Identifiable> {
    
    void save (Identifiable entity);
    
    Identifiable<T> getById(Class<T> classe ,Long id);
        
    Identifiable<T> update(Identifiable entity);
    
    void delete(Identifiable entity);
    
    
    
    
    
}
