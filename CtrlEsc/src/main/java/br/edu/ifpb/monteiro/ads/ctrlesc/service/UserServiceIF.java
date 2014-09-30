/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.service;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.security.User;
import java.util.List;

/**
 *
 * @author WitaloCarlos
 */
public interface UserServiceIF {
    
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
    void create(User entity);

    /**
     * Update method of the data of an entity in the database, return a
     * persisted entity updated.
     *
     * @param entity
     */
    void edit(User entity);

    /**
     * Method to fetch an entity in the database has an ID parameter.
     * @param id
     * @return
     */
    User find(Object id);

    /**
     * Method to fetch all the entities in the database, return a list of
     * the entity.
     * @return
     */
    List<User> findAll();

    /**
     * Search method kin, receiving as parameter an object.
     * @param range
     * @return
     */
    List<User> findRange(int[] range);

    /**
     * Method of removing a database entity receives as parameter the entity
     * to be removed.
     * @param entity
     */
    void remove(User entity);
    
    
}
