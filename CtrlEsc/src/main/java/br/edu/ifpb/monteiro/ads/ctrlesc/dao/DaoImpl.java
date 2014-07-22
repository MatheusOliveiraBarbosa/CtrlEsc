package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Identifiable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Matheus
 * @param <T>
 */
public class DaoImpl<T> implements GenericDAO<Identifiable> {

    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager entityManager;

    /**
     * Persistence method of an entity in the database, return a persisted entity.
     * 
     * @param entity 
     */
    @Override
    public void save(Identifiable entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public Identifiable<Identifiable> getById(Class<Identifiable> classe, Long id) {
        return entityManager.find(classe, id);
    }

    /**
     * Update method of the data of an entity in the database, return a 
     * persisted entity updated.
     * 
     * @param entity
     * @return 
     */
    @Override
    public Identifiable<Identifiable> update(Identifiable entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.refresh(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

        return entity;
    }
    /**
     * Method of removing a database entity receives as parameter the entity 
     * to be removed.
     * @param entity 
     */
    @Override
    public void delete(Identifiable entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

}
