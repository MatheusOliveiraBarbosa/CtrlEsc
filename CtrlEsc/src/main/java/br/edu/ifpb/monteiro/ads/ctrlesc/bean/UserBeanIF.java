/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import java.util.List;

/**
 *
 * @author WitaloCarlos
 * @param <User>
 */
public interface UserBeanIF<User> {

    /**
     * Method used by the edit button for editing data in a registration form.
     *
     */
    void create();

    void destroy();

    User getItem(Long id);

    List<User> getItems();

    List<User> getItemsAvailableSelectMany();

    List<User> getItemsAvailableSelectOne();

    User getSelected();

    void resetFields();

    void setSelected(User selected);

    void update();
    
}
