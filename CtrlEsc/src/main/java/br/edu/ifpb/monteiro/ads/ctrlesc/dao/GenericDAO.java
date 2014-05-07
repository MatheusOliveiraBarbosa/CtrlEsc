/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Identifiable;

/**
 *
 * @author Matheus
 */
public interface GenericDAO<T extends Identifiable> {
    
    void create (Identifiable entity);
    
    Identifiable<T> read();
    
    void update(Identifiable entity);
    
    void delete (Identifiable entity);
    
    
    
    
    
}
