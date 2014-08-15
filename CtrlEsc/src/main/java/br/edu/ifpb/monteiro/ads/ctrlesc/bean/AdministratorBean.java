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
import javax.inject.Inject;

@Named
@RequestScoped
public class AdministratorBean implements Serializable {

    @EJB 
    private AdministratorDaoIF administratorFacade;
    private List<Administrator> listAdministrator;
    private Administrator administrator;

    public AdministratorBean() {
        administrator= new Administrator();
    }

    public String limpAdministrator() {
        administrator = new Administrator();
        return editAdministrator();
    }
    
    public String editAdministrator() {
        return "/cadastre/cadAdministrator.xhtml";
    }
    
    public String addAdministrator() {
        if (administrator.getId() == null || administrator.getId() == 0) {
            insertAdministrator();
        } else {
            updateAdministrator();
        }
        limpAdministrator();
        return null;
    }
    
    private void insertAdministrator() {
        administratorFacade.create(administrator);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    private void updateAdministrator() {
        administratorFacade.edit(administrator);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }
    
      public void removeAdministrator() {
        administratorFacade.remove(administrator);
    }

    public AdministratorDaoIF getAdministratorFacade() {
        return administratorFacade;
    }

    public void setAdministratorFacade(AdministratorDaoIF administratorFacade) {
        this.administratorFacade = administratorFacade;
    }

    public List<Administrator> getListAdministrator() {
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
