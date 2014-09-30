/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.service;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.daos.UserDao;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.security.User;
import br.edu.ifpb.monteiro.ads.ctrlesc.util.jpa.Transactional;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author WitaloCarlos
 */
@RequestScoped
public class UserService implements UserServiceIF{

    @Inject 
    private UserDao dao;
    
    @Override
    public int count() {
        return dao.count();
    }

    @Transactional
    @Override
    public void create(User entity) {
       try{
        this.dao.create(entity);
        }catch (Exception e) {
            System.err.println("Erro no Service: "+e.getMessage()); //Substituir por Logger
        }
    }

    @Override
    public void edit(User entity) {
        dao.edit(entity);
    }

    @Override
    public User find(Object id) {
        return dao.find(id);
    }

    @Override
    public List<User> findAll() {
       return dao.findAll();
    }

    @Override
    public List<User> findRange(int[] range) {
       return dao.findRange(range);
    }

    @Override
    public void remove(User entity) {
        dao.remove(entity);
    }
    
}
