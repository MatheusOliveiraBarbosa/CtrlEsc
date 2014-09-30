package br.edu.ifpb.monteiro.ads.ctrlesc.dao.daos;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.qualifiers.TwoMonthsDAO;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.entities.TwoMonths;

/**
 * @author Elisângela
 */
@TwoMonthsDAO
public class TwoMonthsDao extends AbstractDao<TwoMonths> implements TwoMonthsDaoIF{
   
   
    /**
     * Constructor for the class play this class for the parent class.
     */
    public TwoMonthsDao() {
        super(TwoMonths.class);
    }

   
    
}
