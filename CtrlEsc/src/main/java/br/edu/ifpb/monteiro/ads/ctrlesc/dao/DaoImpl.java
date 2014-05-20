package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Identifiable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Matheus
 * @param <T>
 */
public class DaoImpl<T> implements GenericDAO<Identifiable> {

    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager entityManager;

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
