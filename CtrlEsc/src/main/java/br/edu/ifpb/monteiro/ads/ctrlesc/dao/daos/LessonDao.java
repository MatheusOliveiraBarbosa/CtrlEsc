package br.edu.ifpb.monteiro.ads.ctrlesc.dao.daos;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.qualifiers.LessonDAO;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.entities.Lesson;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Elisângela
 */
@LessonDAO
public class LessonDao extends AbstractDao<Lesson> implements LessonDaoIF{
  
    /**
     * Constructor for the class play this class for the parent class.
     */
    public LessonDao() {
        super(Lesson.class);
    }
    
  
}
