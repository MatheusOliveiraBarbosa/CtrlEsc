package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.ResponsibleDao;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Responsible;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.FlowEvent;

/**
 * @author Elisângela
 */
@Named
@SessionScoped
public class ResponsibleBean implements Serializable {

    @EJB
    @Inject
    private ResponsibleDao responsibleFacade;
    private Responsible responsible;
    private List<Responsible> listResponsibles;
    
    private boolean skip;

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

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
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
    
    public void addResponsible(ActionEvent actionEvent) {
       
        
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
 
    public String onFlowProcess(FlowEvent event) {     
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }   
    }  
    
}
