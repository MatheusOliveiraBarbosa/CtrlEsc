package br.edu.ifpb.monteiro.ads.ctrlesc.bean;


import br.edu.ifpb.monteiro.ads.ctrlesc.dao.DisciplineDao;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Discipline;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class DisciplineBean implements Serializable {

    @Inject
    private DisciplineDao disciplineFacade;
    private List<Discipline> listDiscipline;
    private Discipline discipline;

    public DisciplineBean() {
        discipline= new Discipline();
    }

    public String limpDiscipline() {
        discipline = new Discipline();
        return editDiscipline();
    }
    
    public String editDiscipline() {
        return "/cadastre/cadDiscipline.xhtml";
    }
    
    public String addDiscipline() {
        if (discipline.getId() == null || discipline.getId() == 0) {
            insertDiscipline();
        } else {
            updateDiscipline();
        }
        limpDiscipline();
        return null;
    }
    
    private void insertDiscipline() {
        disciplineFacade.create(discipline);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    private void updateDiscipline() {
        disciplineFacade.edit(discipline);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }
    
      public void removeDiscipline() {
        disciplineFacade.remove(discipline);
    }

    public DisciplineDao getDisciplineFacade() {
        return disciplineFacade;
    }

    public void setDisciplineFacade(DisciplineDao disciplineFacade) {
        this.disciplineFacade = disciplineFacade;
    }

    public List<Discipline> getListDiscipline() {
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
