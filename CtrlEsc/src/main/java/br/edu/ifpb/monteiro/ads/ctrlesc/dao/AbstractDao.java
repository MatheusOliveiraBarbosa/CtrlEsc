package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Identifiable;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Abstract class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting.
 * 
 * @author Elisângela
 * @param <T>
 */
@Default
@Dependent
public class AbstractDao<T extends Identifiable> implements AbstractDaoIF{
    private Class<T> entityClass;

    @Inject
    protected EntityManager entityManager;
    
    /**
     * Method to retrieve the EntityManager 
     * @return 
     */
    protected EntityManager getEntityManager(){
        return entityManager;
    };
    
    /**
     * The class constructor receives with Parliament the entity that will be 
     * persisted in the database
     * 
     * @param entityClass 
     */
    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
    
    public AbstractDao() { }
    
    
    /**
     * Persistence method of an entity in the database, return a persisted entity.
     * @param entity 
     */
    @Override
    public void create(Identifiable entity) {
         System.out.println("Passei aqui D");  //Substituir por Logger
        try {
            getEntityManager().persist(entity);
        } catch (Exception e) {
            System.err.println("Erro no DAO: "+e.getMessage()); //Substituir por Logger
        }
        
    }

    /**
     * Update method of the data of an entity in the database, return a 
     * persisted entity updated.
     * 
     * @param entity 
     */
    @Override
    public void edit(Identifiable entity) {
        getEntityManager().merge(entity);
    }

    /**
     * Method of removing a database entity receives as parameter the entity 
     * to be removed.
     * @param entity 
     */
    @Override
    public void remove(Identifiable entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    /**
     * Method to fetch an entity in the database has an ID parameter.
     * @param id
     * @return 
     */
    @Override
    public Identifiable find(Object id) {
        return getEntityManager().find(entityClass, id);
    }
    
    /**
     * Method to fetch all the entities in the database, return a list of 
     * the entity.
     * @return 
     */
    @Override
    public List<Identifiable> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    /**
     * Search method kin, receiving as parameter an object.
     * @param range
     * @return 
     */
    @Override
    public List<Identifiable> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    /**
     * Method to count the amount of entity, has in return an integer with the
     * amount.
     * @return 
     */
    @Override
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<Identifiable> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
}
