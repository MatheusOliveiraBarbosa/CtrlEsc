package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.qualifiers.TeacherDAO;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Teacher;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Elisângela
 */
@TeacherDAO
public class TeacherDao extends AbstractDao<Teacher> implements TeacherDaoIF{
    
    /**
     * Constructor for the class play this class for the parent class.
     */
    public TeacherDao() {
        super(Teacher.class);
    }

    
    
}
