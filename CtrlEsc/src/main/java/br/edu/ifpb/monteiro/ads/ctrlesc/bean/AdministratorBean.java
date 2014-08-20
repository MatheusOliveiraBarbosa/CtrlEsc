package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.AdministratorDaoIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Administrator;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.context.FacesContext;

@Named
@RequestScoped
public class AdministratorBean implements Serializable {

    @EJB 
    private AdministratorDaoIF administratorFacade;
    private List<Administrator> listAdministrator;
    private Administrator administrator;
    
    /**
     * Creates a new instance of AdministratorBean
     */
    public AdministratorBean() {
        administrator= new Administrator();
    }
    
    /**
     * Method used by the cancel button to clear the data in a form.
     * @return editAdministrador
     */
    public String limpAdministrator() {
        administrator = new Administrator();
        return editAdministrator();
    }
    
    /**
     * Method used by the edit button for editing data in a registration form.
     * @return cadAdministrator
     */
    public String editAdministrator() {
        return "/cadastre/cadAdministrator.xhtml";
    }
    /**
     * Method used by the save button for adding a new administrator.
     * @return null
     */
    public String addAdministrator() {
        if (administrator.getId() == null || administrator.getId() == 0) {
            insertAdministrator();
        } else {
            updateAdministrator();
        }
        limpAdministrator();
        return null;
    }
    
    /**
     * Method responsible for adding an administrator. And exposure 
     * confirmation message to the user
     */
    private void insertAdministrator() {
        administratorFacade.create(administrator);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for editing the form administrator. And exposure 
     * confirmation message to the user.
     */
    private void updateAdministrator() {
        administratorFacade.edit(administrator);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for removing an administrator.
     */
    public void removeAdministrator() {
        administratorFacade.remove(administrator);
    }

    /*
      Getters and Setters
      */  
    public AdministratorDaoIF getAdministratorFacade() {
        return administratorFacade;
    }

    public void setAdministratorFacade(AdministratorDaoIF administratorFacade) {
        this.administratorFacade = administratorFacade;
    }

    public List<Administrator> getListAdministrator() {
        listAdministrator = administratorFacade.findAll();
        return listAdministrator;
    }

    public void setListAdministrator(List<Administrator> listAdministrator) {
        this.listAdministrator = listAdministrator;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
           
}
