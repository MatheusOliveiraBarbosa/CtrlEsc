package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Discipline;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Elisângela
 */
@Stateless
public class DisciplineDao extends AbstractDao<Discipline> implements DisciplineDaoIF{
    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DisciplineDao() {
        super(Discipline.class);
    }
    
}
