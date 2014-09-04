package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.qualifiers.StudentClassDAO;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.StudentClass;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Elisângela
 */
@StudentClassDAO
public class StudentClassDao extends AbstractDao<StudentClass> implements StudentClassDaoIF{
   
    /**
     * Constructor for the class play this class for the parent class.
     */
    public StudentClassDao() {
        super(StudentClass.class);
    }
    
   
}
