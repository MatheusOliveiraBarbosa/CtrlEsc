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
    
    /**
     * Creates a new instance of ResponsibleBean
     */
    public ResponsibleBean() {
        responsible = new Responsible();
    }
      
    /**
     * Method used by the cancel button to clear the data in a form.
     * @return editResponsible
     */
    public String limpResponsible() {
        responsible = new Responsible();
        return editResponsible();
    }
    
    /**
     * Method used by the edit button for editing data in a registration form.
     * @return cadResponsible
     */
    public String editResponsible() {
        return "/cadastre/cadResponsible.xhtml";
    }
    
    /**
     * Method used by the save button for adding a new charge.
     * @return null
     */
    public String addResponsible(){
        
       if (responsible.getId() == null || responsible.getId() == 0) {
            insertResponsible();
        } else {
            updateResponsible();
        }
        limpResponsible();
        return null;
    }
    
    /**
     * Method responsible for inserting a charge. And exposure 
     * confirmation message to the user.
     */
    private void insertResponsible() {
        responsibleFacade.create(responsible);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for editing the form responsible. And exposure 
     * confirmation message to the user.
     */
    private void updateResponsible() {
        responsibleFacade.edit(responsible);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for removal of a guardian.
     */
    public void removeResponsible() {
        responsibleFacade.remove(responsible);
    }
     
    /*
    Getters and Setters
    */
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
