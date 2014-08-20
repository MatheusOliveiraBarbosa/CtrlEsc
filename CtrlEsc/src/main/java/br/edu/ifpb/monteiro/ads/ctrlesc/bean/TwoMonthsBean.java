package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.TwoMonthsDaoIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.TwoMonths;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class TwoMonthsBean implements Serializable {

    @EJB
    private TwoMonthsDaoIF twoMonthsFacade;
    private List<TwoMonths> listTwoMonths;
    private TwoMonths twoMonths;

    /**
     * Creates a new instance of TwoMonthsBean
     */
    public TwoMonthsBean() {
        twoMonths = new TwoMonths();
    }

    /**
     * Method used by the cancel button to clear the data in a form.
     * @return editTwoMonths
     */
    public String limpTwoMonths() {
        twoMonths = new TwoMonths();       
        return editTwoMonths();
    }
    
    /**
     * Method used by the edit button for editing data in a registration form.
     * @return cadTwoMonths
     */
    public String editTwoMonths() {
        return "/cadastre/cadTwoMonths.xhtml";
    }
    
    /**
     * Method used by the save button for adding data from two months.
     * @return null
     */
    public String addTwoMonths() {
        if (twoMonths.getId() == null || twoMonths.getId() == 0) {
            insertTwoMonths();
        } else {
            updateTwoMonths();
        }
        limpTwoMonths();
        return null;
    }
    
    /**
     * Method responsible for data entry of two months. And exposure 
     * confirmation message to the user.
     */
    private void insertTwoMonths() {
        try {
        twoMonthsFacade.create(twoMonths);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
        } catch (Throwable e) {
            e.printStackTrace();
            while (e.getCause() != null) {
                e = e.getCause();
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Method responsible for editing the form of two months. And exposure 
     * confirmation message to the user.
     */
    private void updateTwoMonths() {
        twoMonthsFacade.edit(twoMonths);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    /**
     * Method responsible for the removal of a quarter.
     */
    public void removeTwoMonths() {
        twoMonthsFacade.remove(twoMonths);
    }

    /*
    Getters and Setters
    */
    public TwoMonthsDaoIF getTwoMonthsFacade() {
        return twoMonthsFacade;
    }

    public void setTwoMonthsFacade(TwoMonthsDaoIF twoMonthsFacade) {
        this.twoMonthsFacade = twoMonthsFacade;
    }

    public List<TwoMonths> getListTwoMonths() {
        listTwoMonths = twoMonthsFacade.findAll();
        return listTwoMonths;
    }

    public void setListTwoMonths(List<TwoMonths> listTwoMonths) {
        this.listTwoMonths = listTwoMonths;
    }

    public TwoMonths getTwoMonths() {
        return twoMonths;
    }

    public void setTwoMonths(TwoMonths twoMonths) {
        this.twoMonths = twoMonths;
    }

    
}
