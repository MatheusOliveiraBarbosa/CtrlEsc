package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import java.util.List;

/**
 * Interface for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting.
 * @author MarkusPatriota
 * @param <T>
 */
public interface DaoIF<T> {
    
    /**
     * Persistence method of an entity in the database, return a persisted entity.
     * @param entity 
     */
    public void create(T entity);
    
    /**
     * Update method of the data of an entity in the database, return a 
     * persisted entity updated.
     * @param entity 
     */
    public void edit(T entity);
    
    /**
     * Method of removing a database entity receives as parameter the entity 
     * to be removed.
     * @param entity 
     */
    public void remove(T entity);
            
    /**
     * Method to fetch an entity in the database has an ID parameter.
     * @param id
     * @return 
     */
    public T find(Object id);
    
    /**
     * Method to fetch all the entities in the database, return a list of 
     * the entity.
     * @return 
     */
    public List<T> findAll();
    
    /**
     * Search method kin, receiving as parameter an object.
     * @param range
     * @return 
     */
    public List<T> findRange(int[] range);
    
    /**
     * Method to count the amount of entity, has in return an integer with the
     * amount.
     * @return 
     */
    public int count();
            
}
