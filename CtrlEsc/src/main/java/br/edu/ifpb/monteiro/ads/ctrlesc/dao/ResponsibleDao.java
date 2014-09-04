package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.qualifiers.ResponsibleDAO;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Responsible;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author Elisângela
 */
@ResponsibleDAO
public class ResponsibleDao extends AbstractDao<Responsible> implements ResponsibleDaoIF{
    
    /**
     * Constructor for the class play this class for the parent class.
     */
    public ResponsibleDao() {
        super(Responsible.class);
    }
    
    
}
