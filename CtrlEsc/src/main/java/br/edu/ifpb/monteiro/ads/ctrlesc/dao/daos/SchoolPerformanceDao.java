package br.edu.ifpb.monteiro.ads.ctrlesc.dao.daos;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.qualifiers.SchoolPerformanceDAO;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.entities.SchoolPerformance;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Elisângela
 */
@SchoolPerformanceDAO
public class SchoolPerformanceDao extends AbstractDao<SchoolPerformance> implements SchoolPerformanceDaoIF{

    
    /**
     * Constructor for the class play this class for the parent class.
     */
    public SchoolPerformanceDao() {
        super(SchoolPerformance.class);
    }
    
    
}
