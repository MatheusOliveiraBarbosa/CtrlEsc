/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Identifiable;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Matheus
 */
public class DaoImpl {
    
    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager entityManager;
    
        
    
    public void create(Identifiable entity) {
       
        try{
           entityManager.getTransaction().begin();
           entityManager.persist(entity);
           entityManager.getTransaction().commit();
        }catch(EntityExistsException e){
            
            entityManager.getTransaction().rollback();
        }
        
    }

    public Identifiable read() {
       
        return null;
        
    }

    public void update(Identifiable entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Identifiable entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
        
}
