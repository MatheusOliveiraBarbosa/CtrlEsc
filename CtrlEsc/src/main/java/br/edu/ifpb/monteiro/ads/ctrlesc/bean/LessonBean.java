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
 *
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
    
    public String limpLesson() {
        lesson = new Lesson();
        return editLesson();
    }
    
    public String editLesson() {
        return "/cadastre/cadLesson.xhtml";
    }
    
    public String addLesson() {
        if (lesson.getId() == null || lesson.getId() == 0) {
            insertLesson();
        } else {
            updateLesson();
        }
        limpLesson();
        return null;
    }
    
    private void insertLesson() {
        lessonFacade.create(lesson);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    private void updateLesson() {
        lessonFacade.edit(lesson);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }
    
    public void removeLesson() {
        lessonFacade.remove(lesson);
    }

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
