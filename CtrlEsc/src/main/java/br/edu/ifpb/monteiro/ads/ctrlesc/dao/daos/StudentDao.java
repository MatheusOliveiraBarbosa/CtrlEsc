package br.edu.ifpb.monteiro.ads.ctrlesc.dao.daos;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.qualifiers.StudentDAO;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.entities.Student;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Elisângela
 */
@StudentDAO
public class StudentDao extends AbstractDao<Student> implements StudentDaoIF{
   
   
    /**
     * Constructor for the class play this class for the parent class.
     */
    public StudentDao() {
        super(Student.class);
    }
    
   
    
}
