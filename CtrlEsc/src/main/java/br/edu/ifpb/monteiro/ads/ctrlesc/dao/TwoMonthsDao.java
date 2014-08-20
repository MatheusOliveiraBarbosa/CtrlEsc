package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.TwoMonths;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Elisângela
 */
@Stateless
public class TwoMonthsDao extends AbstractDao<TwoMonths> implements TwoMonthsDaoIF{
    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager em;

    /**
     * Constructor for the class play this class for the parent class.
     */
    public TwoMonthsDao() {
        super(TwoMonths.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
