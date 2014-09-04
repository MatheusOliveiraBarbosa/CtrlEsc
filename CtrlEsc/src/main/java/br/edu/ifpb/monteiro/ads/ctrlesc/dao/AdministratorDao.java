package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.qualifiers.AdministratorDAO;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Administrator;

/**
 * Class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting
 * @author MarkusPatriota
 */
@AdministratorDAO
public class AdministratorDao extends AbstractDao<Administrator> implements AdministratorDaoIF{
   
    public AdministratorDao() {
        super(Administrator.class);
    }
   
}
