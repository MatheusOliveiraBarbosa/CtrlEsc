/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.entities.Identifiable;
import java.util.List;

/**
 *
 * @author WitaloCarlos
 * @param <T>
 */
public interface AbstractBeanIF<T extends Identifiable> {

    /**
     * Method used by the edit button for editing data in a registration form.
     *
     */
    void create();

    void destroy();

    Identifiable getItem(Long id);

    List<Identifiable> getItems();

    List<Identifiable> getItemsAvailableSelectMany();

    List<Identifiable> getItemsAvailableSelectOne();

    T getSelected();

    void resetFields();

    void setSelected(T selected);

    void update();
    
}
