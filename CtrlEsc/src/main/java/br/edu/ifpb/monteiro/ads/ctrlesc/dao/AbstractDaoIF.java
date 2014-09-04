/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Identifiable;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author WitaloCarlos
 */
public interface AbstractDaoIF extends Serializable{

    /**
     * Method to count the amount of entity, has in return an integer with the
     * amount.
     * @return
     */
    int count();

    /**
     * Persistence method of an entity in the database, return a persisted entity.
     * @param entity
     */
    void create(Identifiable entity);

    /**
     * Update method of the data of an entity in the database, return a
     * persisted entity updated.
     *
     * @param entity
     */
    void edit(Identifiable entity);

    /**
     * Method to fetch an entity in the database has an ID parameter.
     * @param id
     * @return
     */
    Identifiable find(Object id);

    /**
     * Method to fetch all the entities in the database, return a list of
     * the entity.
     * @return
     */
    List<Identifiable> findAll();

    /**
     * Search method kin, receiving as parameter an object.
     * @param range
     * @return
     */
    List<Identifiable> findRange(int[] range);

    /**
     * Method of removing a database entity receives as parameter the entity
     * to be removed.
     * @param entity
     */
    void remove(Identifiable entity);
    
}
