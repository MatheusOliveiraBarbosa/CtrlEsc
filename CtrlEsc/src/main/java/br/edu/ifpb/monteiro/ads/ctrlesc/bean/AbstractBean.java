/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.exception.CtrlEscException;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Identifiable;
import br.edu.ifpb.monteiro.ads.ctrlesc.service.ServicesIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.util.jsf.JsfUtil;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author WitaloCarlos
 * @param <T>
 */
public abstract class AbstractBean<T extends Identifiable> implements AbstractBeanIF<T>  {

    private List<Identifiable> items = null;

    public AbstractBean() {
    }


    protected abstract ServicesIF getServices();


    /**
     * Method used by the edit button for editing data in a registration form.
     *
     */
    @Override
    public void create() {
        try {

            this.getServices().create(getSelected());
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("resources/Bundle").getString("ItemCreated"));
            throw new CtrlEscException(ResourceBundle.getBundle("resources/Bundle").getString("ItemNotCreated")); //Verificar se isso realemente é assim ^^

        } catch (CtrlEscException e) {

            JsfUtil.addErrorMessage(e.getLocalizedMessage());
        }
    }

    @Override
    public void update() {
        try {

            this.getServices().edit(getSelected());
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("resources/Bundle").getString("ItemUpdated"));
            throw new CtrlEscException(null); //Verificar se isso realemente é assim ^^

        } catch (CtrlEscException e) {

            JsfUtil.addErrorMessage(e.getLocalizedMessage());
        }
    }

    @Override
    public void destroy() {
        try {

            this.getServices().remove(getSelected());
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("resources/Bundle").getString("ItemDeleted"));
            if (!JsfUtil.isValidationFailed()) {
                setSelected(null); // Remove selection
                items = null;    // Invalidate list of items to trigger re-query.
            }
            throw new CtrlEscException(null); //Verificar se isso realemente é assim ^^

        } catch (CtrlEscException e) {

            JsfUtil.addErrorMessage(e.getLocalizedMessage());
        }

    }

    @Override
    public List<Identifiable> getItems() {
        if (items == null) {
            items = getServices().findAll();
        }
        return items;
    }

    @Override
    public Identifiable getItem(Long id) {
        return getServices().find(id);
    }

    @Override
    public List<Identifiable> getItemsAvailableSelectMany() {
        return getServices().findAll();
    }

    @Override
    public List<Identifiable> getItemsAvailableSelectOne() {
        return getServices().findAll();
    }

}
