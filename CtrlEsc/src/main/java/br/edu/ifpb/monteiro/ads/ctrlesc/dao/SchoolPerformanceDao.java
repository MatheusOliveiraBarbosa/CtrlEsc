package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.SchoolPerformance;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Elisângela
 */
@Stateless
public class SchoolPerformanceDao extends AbstractDao<SchoolPerformance> implements SchoolPerformanceDaoIF{

    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SchoolPerformanceDao() {
        super(SchoolPerformance.class);
    }
    
}
