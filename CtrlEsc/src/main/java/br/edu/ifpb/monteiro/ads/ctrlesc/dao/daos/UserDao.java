package br.edu.ifpb.monteiro.ads.ctrlesc.dao.daos;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.entities.Identifiable;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.security.User;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * @author Witalo Carlos
 */

public class UserDao implements UserDaoIF{

    static final Logger logger = Logger.getGlobal();
    
    @Inject
    protected EntityManager entityManager;

    /**
     * Method to retrieve the EntityManager
     *
     * @return
     */
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    ;
    
    @Override
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<Identifiable> rt = cq.from(User.class);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

    @Override
    public void create(User entity) {
       logger.info("Passei aqui D");  //Substituir por Logger
        try {
            getEntityManager().persist(entity);
        } catch (Exception e) {
            logger.log(Level.INFO, "Erro no DAO: {0}", e.getMessage()); //Substituir por Logger
        }
    }

    @Override
    public void edit(User entity) {
       getEntityManager().merge(entity);
    }

    @Override
    public User find(Object id) {
        return getEntityManager().find(User.class, id);
    }

    @Override
    public List<User> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(User.class));
        return getEntityManager().createQuery(cq).getResultList();
    }

    @Override
    public List<User> findRange(int[] range) {
       javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(User.class));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    @Override
    public void remove(User entity) {
         getEntityManager().remove(getEntityManager().merge(entity));
    }
   
   
   
   
    
}
