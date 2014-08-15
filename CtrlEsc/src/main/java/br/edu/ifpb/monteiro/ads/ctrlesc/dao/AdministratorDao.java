package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Administrator;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MarkusPatriota
 */
@Stateless
public class AdministratorDao extends AbstractDao<Administrator> implements AdministratorDaoIF{
    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager em;


    public AdministratorDao() {
        super(Administrator.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
