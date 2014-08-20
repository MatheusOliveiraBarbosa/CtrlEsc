package br.edu.ifpb.monteiro.ads.ctrlesc.bean;


import br.edu.ifpb.monteiro.ads.ctrlesc.dao.DisciplineDaoIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Discipline;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class DisciplineBean implements Serializable {

    @EJB
    private DisciplineDaoIF disciplineFacade;
    private List<Discipline> listDiscipline;
    private Discipline discipline;

    /**
     * Creates a new instance of DisciplineBean
     */
    public DisciplineBean() {
        discipline= new Discipline();
    }

    /**
     * Method used by the cancel button to clear the data in a form.
     * @return editDiscipline
     */
    public String limpDiscipline() {
        discipline = new Discipline();
        return editDiscipline();
    }
    
    /**
     * Method used by the edit button for editing data in a registration form.
     * @return cadDiscipline
     */
    public String editDiscipline() {
        return "/cadastre/cadDiscipline.xhtml";
    }
    
    /**
     * Method used by the save button for adding a new discipline.
     * @return null
     */
    public String addDiscipline() {
        if (discipline.getId() == null || discipline.getId() == 0) {
            insertDiscipline();
        } else {
            updateDiscipline();
        }
        limpDiscipline();
        return null;
    }
    
    /**
     * Method responsible for the insertion of a discipline. And exposure 
     * confirmation message to the user.
     */
    private void insertDiscipline() {
        disciplineFacade.create(discipline);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for editing the form of discipline. And exposure 
     * confirmation message to the user.
     */
    private void updateDiscipline() {
        disciplineFacade.edit(discipline);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for removing a discipline.
     */
    public void removeDiscipline() {
        disciplineFacade.remove(discipline);
    }

    /*
      Getters and Setters
      */  
    public DisciplineDaoIF getDisciplineFacade() {
        return disciplineFacade;
    }

    public void setDisciplineFacade(DisciplineDaoIF disciplineFacade) {
        this.disciplineFacade = disciplineFacade;
    }

    public List<Discipline> getListDiscipline() {
        listDiscipline = disciplineFacade.findAll();
        return listDiscipline;
    }

    public void setListDiscipline(List<Discipline> listDiscipline) {
        this.listDiscipline = listDiscipline;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
        
}
