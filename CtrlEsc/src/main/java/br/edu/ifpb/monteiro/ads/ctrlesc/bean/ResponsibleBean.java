package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.ResponsibleDao;
import br.edu.ifpb.monteiro.ads.ctrlesc.exception.CtrlEscException;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Responsible;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Elisângela
 */
@ManagedBean
@RequestScoped
public class ResponsibleBean implements Serializable {

    @EJB
    //@Inject
    private ResponsibleDao responsibleFacade;
    private Responsible responsible;
    private List<Responsible> listResponsibles;
    
    public ResponsibleBean() {
        responsible = new Responsible();
    }

    public ResponsibleDao getResponsibleFacade() {
        return responsibleFacade;
    }

    public void setResponsibleFacade(ResponsibleDao responsibleFacade) {
        this.responsibleFacade = responsibleFacade;
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }
    
    public List<Responsible> getListResponsibles() {
        listResponsibles = responsibleFacade.findAll();
        return listResponsibles;
    }
    
    public String limpResponsible() {
        responsible = new Responsible();
        return editResponsible();
    }
    
    public String editResponsible() {
        return "/cadastre/cadResponsible.xhtml";
    }
    
    public String addResponsible() throws CtrlEscException{
        
       if (responsible.getId() == null || responsible.getId() == 0) {
            insertResponsible();
        } else {
            updateResponsible();
        }        
        return "";
    }
    
    private void insertResponsible() {
        responsibleFacade.create(responsible);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    private void updateResponsible() {
        responsibleFacade.edit(responsible);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }
    
    public void removeResponsible() {
        responsibleFacade.remove(responsible);
    }
 
}
