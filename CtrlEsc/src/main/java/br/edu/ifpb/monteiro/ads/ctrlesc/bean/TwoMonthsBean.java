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

    public TwoMonthsBean() {
        twoMonths = new TwoMonths();
    }

     public String limpTwoMonths() {
        twoMonths = new TwoMonths();       
        return editTwoMonths();
    }
    
    public String editTwoMonths() {
        return "/cadastre/cadTwoMonths.xhtml";
    }
    
    public String addTwoMonths() {
        if (twoMonths.getId() == null || twoMonths.getId() == 0) {
            insertTwoMonths();
        } else {
            updateTwoMonths();
        }
        limpTwoMonths();
        return null;
    }
    
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
    
    private void updateTwoMonths() {
        twoMonthsFacade.edit(twoMonths);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    public void removeTwoMonths() {
        twoMonthsFacade.remove(twoMonths);
    }

    public TwoMonthsDaoIF getTwoMonthsFacade() {
        return twoMonthsFacade;
    }

    public void setTwoMonthsFacade(TwoMonthsDaoIF twoMonthsFacade) {
        this.twoMonthsFacade = twoMonthsFacade;
    }

    public List<TwoMonths> getListTwoMonths() {
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
