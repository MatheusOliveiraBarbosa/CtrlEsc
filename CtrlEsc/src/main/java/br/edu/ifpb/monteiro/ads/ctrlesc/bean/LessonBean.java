package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.LessonDaoIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Lesson;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 * @author MarkusPatriota
 */
@Named
@RequestScoped
public class LessonBean implements Serializable {
    
    @EJB
    private LessonDaoIF lessonFacade;
    private List<Lesson> listLesson;
    private Lesson lesson;

    /**
     * Creates a new instance of LessonBean
     */
    public LessonBean() {
        lesson= new Lesson();
    }
    
    /**
     * Method used by the cancel button to clear the data in a form.
     * @return editLesson
     */
    public String limpLesson() {
        lesson = new Lesson();
        return editLesson();
    }
    
    /**
     * Method used by the edit button for editing data in a registration form.
     * @return cadLesson
     */
    public String editLesson() {
        return "/cadastre/cadLesson.xhtml";
    }
    
    /**
     * Method used by the save button for adding a new activity.
     * @return null
     */
    public String addLesson() {
        if (lesson.getId() == null || lesson.getId() == 0) {
            insertLesson();
        } else {
            updateLesson();
        }
        limpLesson();
        return null;
    }
    
    /**
     * Method responsible for the insertion of an activity. And exposure 
     * confirmation message to the user.
     */
    private void insertLesson() {
        lessonFacade.create(lesson);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for editing the form of activity. And exposure 
     * confirmation message to the user.
     */
    private void updateLesson() {
        lessonFacade.edit(lesson);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }
    
    /**
     * Method responsible for removing an activity.
     */
    public void removeLesson() {
        lessonFacade.remove(lesson);
    }

    /*
    Getters and Setters
    */
    public void setLessonFacade(LessonDaoIF lessonFacade) {
        this.lessonFacade = lessonFacade;
    }

    public void setListLesson(List<Lesson> listLesson) {
        this.listLesson = listLesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public LessonDaoIF getLessonFacade() {
        return lessonFacade;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public List<Lesson> getListLesson() {
        listLesson = lessonFacade.findAll();
        return listLesson;
    }
    
}
