package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Person;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Elisângela
 */
@Stateless
public class PersonDao extends AbstractDao<Person> {
    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonDao() {
        super(Person.class);
    }
    
}
