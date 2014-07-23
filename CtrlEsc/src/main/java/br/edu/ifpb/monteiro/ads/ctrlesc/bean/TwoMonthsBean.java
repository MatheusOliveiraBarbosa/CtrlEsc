package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.TwoMonths;
import br.edu.ifpb.monteiro.ads.ctrlesc.dao.TwoMonthsDao;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named("twoMonthsController")
@RequestScoped
public class TwoMonthsBean implements Serializable {

    @EJB
    @Inject
    private TwoMonthsDao twoMonthsFacade;
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
    
    public String addStudentClass() {
        if (twoMonths.getId() == null || twoMonths.getId() == 0) {
            insertTwoMonths();
        } else {
            updateTwoMonths();
        }
        limpTwoMonths();
        return null;
    }
    
    private void insertTwoMonths() {
        twoMonthsFacade.create(twoMonths);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    private void updateTwoMonths() {
        twoMonthsFacade.edit(twoMonths);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    public void removeTwoMonths() {
        twoMonthsFacade.remove(twoMonths);
    }

    public TwoMonthsDao getTwoMonthsFacade() {
        return twoMonthsFacade;
    }

    public void setTwoMonthsFacade(TwoMonthsDao twoMonthsFacade) {
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
