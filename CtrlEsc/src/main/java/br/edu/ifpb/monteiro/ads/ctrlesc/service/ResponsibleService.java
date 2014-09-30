/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.service;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.daos.ResponsibleDaoIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.dao.qualifiers.ResponsibleDAO;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.entities.Identifiable;
import br.edu.ifpb.monteiro.ads.ctrlesc.util.jpa.Transactional;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author WitaloCarlos
 */
@RequestScoped
public class ResponsibleService implements ResponsibleServiceIF{

    @Inject @ResponsibleDAO
    private ResponsibleDaoIF dao;
    
    @Override
    public int count() {
        return dao.count();
    }

    @Transactional
    @Override
    public void create(Identifiable entity) {
       try{
        this.dao.create(entity);
        }catch (Exception e) {
            System.err.println("Erro no Service: "+e.getMessage()); //Substituir por Logger
        }
    }

    @Override
    public void edit(Identifiable entity) {
        dao.edit(entity);
    }

    @Override
    public Identifiable find(Object id) {
        return dao.find(id);
    }

    @Override
    public List<Identifiable> findAll() {
       return dao.findAll();
    }

    @Override
    public List<Identifiable> findRange(int[] range) {
       return dao.findRange(range);
    }

    @Override
    public void remove(Identifiable entity) {
        dao.remove(entity);
    }
    
}
