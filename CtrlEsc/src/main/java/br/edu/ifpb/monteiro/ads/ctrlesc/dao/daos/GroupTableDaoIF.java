package br.edu.ifpb.monteiro.ads.ctrlesc.dao.daos;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.entities.Identifiable;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.security.GroupTable;
import java.util.List;

/**
 * Interface that extends DaoIF that inherits the methods to persist, delete,
 * update, search by id, search everything, multiple search and counting.
 * @author MarkusPatriota
 */

public interface GroupTableDaoIF{
    
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
    void create(GroupTable entity);

    /**
     * Update method of the data of an entity in the database, return a
     * persisted entity updated.
     *
     * @param entity
     */
    void edit(GroupTable entity);

    /**
     * Method to fetch an entity in the database has an ID parameter.
     * @param id
     * @return
     */
    GroupTable find(Object id);

    /**
     * Method to fetch all the entities in the database, return a list of
     * the entity.
     * @return
     */
    List<GroupTable> findAll();

    /**
     * Search method kin, receiving as parameter an object.
     * @param range
     * @return
     */
    List<GroupTable> findRange(int[] range);

    /**
     * Method of removing a database entity receives as parameter the entity
     * to be removed.
     * @param entity
     */
    void remove(GroupTable entity);
    
    
}
