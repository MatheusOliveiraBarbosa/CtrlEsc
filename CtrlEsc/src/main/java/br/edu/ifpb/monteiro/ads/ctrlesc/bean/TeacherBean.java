package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Teacher;
import br.edu.ifpb.monteiro.ads.ctrlesc.service.TeacherServiceIF;
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

@Named(value = "teacherBean")
@RequestScoped
public class TeacherBean extends AbstractBean<Teacher> implements TeacherBeanIF{

    @Inject
    private TeacherServiceIF services;

    @Inject
    @br.edu.ifpb.monteiro.ads.ctrlesc.model.qualifiers.Teacher
    private Teacher selected;

    
    @Override
    protected ServicesIF getServices() {
        return this.services;
    }

    @Override
    public Teacher getSelected() {
     return this.selected;
    }

    @Override
    public void resetFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSelected(Teacher selected) {
        this.selected =  selected;
    }

    
     @FacesConverter(forClass = Teacher.class)
    public static class TeacherBeanConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            TeacherBean controller = (TeacherBean) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "teacherBean");
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
            if (object instanceof Teacher) {
                Teacher o = (Teacher) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Teacher.class.getName()});
                return null;
            }
        }

           
}
}