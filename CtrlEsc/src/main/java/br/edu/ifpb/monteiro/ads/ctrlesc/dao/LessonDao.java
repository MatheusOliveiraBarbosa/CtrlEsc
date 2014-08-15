package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Lesson;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Elisângela
 */
@Stateless
public class LessonDao extends AbstractDao<Lesson> implements LessonDaoIF{
    @PersistenceContext(unitName = "CtrlEsc")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    public LessonDao() {
        super(Lesson.class);
    }
    
}
