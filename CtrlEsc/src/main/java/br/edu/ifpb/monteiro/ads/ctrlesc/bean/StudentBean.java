package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.Student;
import br.edu.ifpb.monteiro.ads.ctrlesc.service.StudentServiceIF;
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

@Named(value = "studentBean")
@RequestScoped
public class StudentBean extends AbstractBean<Student> implements StudentBeanIF{

    @Inject
    private StudentServiceIF services;

    @Inject
    @br.edu.ifpb.monteiro.ads.ctrlesc.model.qualifiers.Student
    private Student selected;

    
    @Override
    protected ServicesIF getServices() {
        return this.services;
    }

    @Override
    public Student getSelected() {
     return this.selected;
    }

    @Override
    public void resetFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSelected(Student selected) {
        this.selected =  selected;
    }

    
     @FacesConverter(forClass = Student.class)
    public static class StudentBeanConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            StudentBean controller = (StudentBean) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "studentBean");
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
            if (object instanceof Student) {
                Student o = (Student) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Student.class.getName()});
                return null;
            }
        }

           
}
}