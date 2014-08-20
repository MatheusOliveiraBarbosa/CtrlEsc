package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Teacher;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Elisângela
 */
@Stateless
public class TeacherDao extends AbstractDao<Teacher> implements TeacherDaoIF{
    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager em;

    /**
     * Constructor for the class play this class for the parent class.
     */
    public TeacherDao() {
        super(Teacher.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
