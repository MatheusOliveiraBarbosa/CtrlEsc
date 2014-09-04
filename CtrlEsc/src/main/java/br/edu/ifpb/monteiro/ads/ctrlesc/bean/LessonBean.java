package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Lesson;
import br.edu.ifpb.monteiro.ads.ctrlesc.service.LessonServiceIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.service.ServicesIF;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.inject.Named;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

@Named(value = "lessonBean")
@RequestScoped
public class LessonBean extends AbstractBean<Lesson> implements LessonBeanIF{

    @Inject
    private LessonServiceIF services;

    @Inject
    @br.edu.ifpb.monteiro.ads.ctrlesc.model.qualifiers.Lesson
    private Lesson selected;

    
    @Override
    protected ServicesIF getServices() {
        return this.services;
    }

    @Override
    public Lesson getSelected() {
     return this.selected;
    }

    @Override
    public void resetFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSelected(Lesson selected) {
        this.selected =  selected;
    }

    
     @FacesConverter(forClass = Lesson.class)
    public static class AdministratorBeanConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            LessonBean controller = (LessonBean) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "lessonBean");
            return controller.getItem(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Lesson) {
                Lesson o = (Lesson) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Lesson.class.getName()});
                return null;
            }
        }

           
}
}