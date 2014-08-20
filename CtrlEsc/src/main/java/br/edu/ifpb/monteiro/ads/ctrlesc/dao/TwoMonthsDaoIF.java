package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.TwoMonths;
import javax.ejb.Local;

/**
 * Interface that extends DaoIF that inherits the methods to persist, delete,
 * update, search by id, search everything, multiple search and counting.
 * @author MarkusPatriota
 */
@Local
public interface TwoMonthsDaoIF extends DaoIF<TwoMonths>{
    
    
}
