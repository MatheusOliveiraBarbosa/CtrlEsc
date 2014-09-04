package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.qualifiers.DisciplineDAO;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Discipline;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Elisângela
 */
@DisciplineDAO
public class DisciplineDao extends AbstractDao<Discipline> implements DisciplineDaoIF{
   

    /**
     * Constructor for the class play this class for the parent class.
     */
    public DisciplineDao() {
        super(Discipline.class);
    }
    
  
}
