package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.SchoolPerformanceDaoIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.SchoolPerformance;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class SchoolPerformanceBean implements Serializable {

    @EJB
    private SchoolPerformanceDaoIF schoolPerformanceFacade;
    private List<SchoolPerformance> listSchoolPerformance;
    private SchoolPerformance schoolPerformance;

    /**
     * Creates a new instance of SchoolPerformanceBean
     */
    public SchoolPerformanceBean() {
        schoolPerformance = new SchoolPerformance();
    }

    /**
     * Method used by the cancel button to clear the data in a form.
     * @return editSchoolPerformance
     */
    public String limpSchoolPerformance() {
        schoolPerformance = new SchoolPerformance();       
        return editSchoolPerformance();
    }
    
    /**
     * Method used by the edit button for editing data in a registration form.
     * @return cadSchoolPerformance
     */
    public String editSchoolPerformance() {
        return "/cadastre/cadSchoolPerformance.xhtml";
    }
    
    /**
     * Method used by the save button for adding new data schoolPerformance.
     * @return null
     */
    public String addSchoolPerformance() {
        if (schoolPerformance.getId() == null || schoolPerformance.getId() == 0) {
            insertSchoolPerformance();
        } else {
            updateSchoolPerformance();
        }
        limpSchoolPerformance();
        return null;
    }
    
    /**
     * Method responsible for adding new data schoolPerformance. And exposure 
     * confirmation message to the user
     */
    private void insertSchoolPerformance() {
        schoolPerformanceFacade.create(schoolPerformance);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for editing the form schoolPerformance. And exposure 
     * confirmation message to the user.
     */
    private void updateSchoolPerformance() {
        schoolPerformanceFacade.edit(schoolPerformance);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    /**
     * Method responsible for removing schoolPerformance.
     */
    public void removeSchoolPerformance() {
        schoolPerformanceFacade.remove(schoolPerformance);
    }

    /*
    Getters and Setters
    */
    public SchoolPerformanceDaoIF getSchoolPerformanceFacade() {
        return schoolPerformanceFacade;
    }

    public void setSchoolPerformanceFacade(SchoolPerformanceDaoIF schoolPerformanceFacade) {
        this.schoolPerformanceFacade = schoolPerformanceFacade;
    }

    public List<SchoolPerformance> getListSchoolPerformance() {
        return listSchoolPerformance;
    }

    public void setListSchoolPerformance(List<SchoolPerformance> listSchoolPerformance) {
        this.listSchoolPerformance = listSchoolPerformance;
    }

    public SchoolPerformance getSchoolPerformance() {
        return schoolPerformance;
    }

    public void setSchoolPerformance(SchoolPerformance schoolPerformance) {
        this.schoolPerformance = schoolPerformance;
    }
    
}
