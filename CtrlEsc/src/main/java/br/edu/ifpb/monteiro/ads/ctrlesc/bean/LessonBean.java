package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.dao.DaoIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.dao.LessonDao;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Lesson;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author MarkusPatriota
 */
@Named
@RequestScoped
public class LessonBean implements Serializable {
    
    @Inject
    private LessonDao lessonFacade;
    private Lesson lesson;
    private List<Lesson> listLesson;

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

    public DaoIF getLessonFacade() {
        return lessonFacade;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public List<Lesson> getListLesson() {
        return listLesson;
    }
    
}
