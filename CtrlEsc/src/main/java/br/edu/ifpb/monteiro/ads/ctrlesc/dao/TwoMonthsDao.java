package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.TwoMonths;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Elisângela
 */
@Stateless
public class TwoMonthsDao extends AbstractDao<TwoMonths> {
    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    public TwoMonthsDao() {
        super(TwoMonths.class);
    }
    
}
