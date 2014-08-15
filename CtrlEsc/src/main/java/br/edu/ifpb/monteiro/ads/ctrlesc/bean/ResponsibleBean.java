package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.ResponsibleDaoIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Responsible;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 * @author Elisângela
 */
@Named
@RequestScoped
public class ResponsibleBean implements Serializable {

    @EJB
    private ResponsibleDaoIF responsibleFacade;
    private Responsible responsible;
    private List<Responsible> listResponsibles;
    
    public ResponsibleBean() {
        responsible = new Responsible();
    }
      
    public String limpResponsible() {
        responsible = new Responsible();
        return editResponsible();
    }
    
    public String editResponsible() {
        return "/cadastre/cadResponsible.xhtml";
    }
    
    public void addResponsible(){
        
       if (responsible.getId() == null || responsible.getId() == 0) {
            insertResponsible();
        } else {
            updateResponsible();
        }
        limpResponsible();
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
     
     public ResponsibleDaoIF getResponsibleFacade() {
        return responsibleFacade;
    }

    public void setResponsibleFacade(ResponsibleDaoIF responsibleFacade) {
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
}
