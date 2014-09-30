package br.edu.ifpb.monteiro.ads.ctrlesc.bean;

import br.edu.ifpb.monteiro.ads.ctrlesc.exception.CtrlEscException;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.entities.TwoMonths;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.security.User;
import br.edu.ifpb.monteiro.ads.ctrlesc.service.UserServiceIF;
import br.edu.ifpb.monteiro.ads.ctrlesc.util.jsf.JsfUtil;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.inject.Named;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

@Named(value = "userBean")
@RequestScoped
public class UserBean implements UserBeanIF{
    
    private List<User> items = null;
    static final Logger logger = Logger.getGlobal();;

    @Inject
    private UserServiceIF services;

    @Inject
    private User selected;

        
    protected UserServiceIF getServices() {
        return this.services;
    }

    @Override
    public User getSelected() {
     return this.selected;
    }

    @Override
    public void resetFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create() {
       logger.info("Create acessado"); 
        try {
            
            logger.info("Tentando criar"); 
            this.getServices().create(getSelected());
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("resources/Bundle").getString("ItemCreated"));
            logger.info("Criado"); 
            throw new CtrlEscException(ResourceBundle.getBundle("resources/Bundle").getString("ItemNotCreated")); //Verificar se isso realemente é assim ^^

        } catch (CtrlEscException e) {
            logger.log(Level.INFO, "Erro Bean: {0}", e.getMessage()); 
            JsfUtil.addErrorMessage(e.getLocalizedMessage());
        }
    }

    @Override
    public void destroy() {
        try {

            this.getServices().remove(getSelected());
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("resources/Bundle").getString("ItemDeleted"));
            if (!JsfUtil.isValidationFailed()) {
                setSelected(null); // Remove selection
                items = null;    // Invalidate list of items to trigger re-query.
            }
            throw new CtrlEscException(null); //Verificar se isso realemente é assim ^^

        } catch (CtrlEscException e) {

            JsfUtil.addErrorMessage(e.getLocalizedMessage());
        }
    }

    @Override
    public Object getItem(Long id) {
       return getServices().find(id);
    }

    @Override
    public List getItems() {
         if (items == null) {
            items = getServices().findAll();
        }
        return items;
    }

    @Override
    public List getItemsAvailableSelectMany() {
        return getServices().findAll();
    }

    @Override
    public List getItemsAvailableSelectOne() {
       return getServices().findAll();
    }

    @Override
    public void setSelected(Object selected) {
        this.selected = (User) selected;
    }

    @Override
    public void update() {
        try {

            this.getServices().edit(getSelected());
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("resources/Bundle").getString("ItemUpdated"));
            throw new CtrlEscException(null); //Verificar se isso realemente é assim ^^

        } catch (CtrlEscException e) {

            JsfUtil.addErrorMessage(e.getLocalizedMessage());
        }
    }


    
     @FacesConverter(forClass = User.class)
    public static class UserBeanConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            UserBean controller = (UserBean) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "userBean");
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
            if (object instanceof TwoMonths) {
                User o = (User) object;
                return o.getIdUser();
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), User.class.getName()});
                return null;
            }
        }
        
        
       

           
}
}