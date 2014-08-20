package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Lesson;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Elisângela
 */
@Stateless
public class LessonDao extends AbstractDao<Lesson> implements LessonDaoIF{
    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager em;

    /**
     * Constructor for the class play this class for the parent class.
     */
    public LessonDao() {
        super(Lesson.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
