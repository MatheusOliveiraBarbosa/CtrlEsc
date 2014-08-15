package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Responsible;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Elisângela
 */
@Stateless
public class ResponsibleDao extends AbstractDao<Responsible> implements ResponsibleDaoIF{
    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResponsibleDao() {
        super(Responsible.class);
    }
    
}
