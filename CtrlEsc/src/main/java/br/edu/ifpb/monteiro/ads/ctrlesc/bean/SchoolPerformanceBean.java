package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.SchoolPerformanceDao;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.SchoolPerformance;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class SchoolPerformanceBean implements Serializable {

    @EJB
    @Inject
    private SchoolPerformanceDao schoolPerformanceFacade;
    private List<SchoolPerformance> listSchoolPerformance;
    private SchoolPerformance schoolPerformance;

    public SchoolPerformanceBean() {
        schoolPerformance = new SchoolPerformance();
    }

    public String limpSchoolPerformance() {
        schoolPerformance = new SchoolPerformance();       
        return editSchoolPerformance();
    }
    
    public String editSchoolPerformance() {
        return "/cadastre/cadSchoolPerformance.xhtml";
    }
    
    public String addSchoolPerformance() {
        if (schoolPerformance.getId() == null || schoolPerformance.getId() == 0) {
            insertSchoolPerformance();
        } else {
            updateSchoolPerformance();
        }
        limpSchoolPerformance();
        return null;
    }
    
    private void insertSchoolPerformance() {
        schoolPerformanceFacade.create(schoolPerformance);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    private void updateSchoolPerformance() {
        schoolPerformanceFacade.edit(schoolPerformance);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    public void removeSchoolPerformance() {
        schoolPerformanceFacade.remove(schoolPerformance);
    }

    public SchoolPerformanceDao getSchoolPerformanceFacade() {
        return schoolPerformanceFacade;
    }

    public void setSchoolPerformanceFacade(SchoolPerformanceDao schoolPerformanceFacade) {
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
