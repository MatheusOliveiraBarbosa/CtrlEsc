package br.edu.ifpb.monteiro.ads.ctrlesc.bean;


import br.edu.ifpb.monteiro.ads.ctrlesc.dao.PersonDao;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.Person;
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
public class PersonBean implements Serializable {

    @EJB
    @Inject
    private PersonDao personFacade;
    private List<Person> listPerson;
    private Person person;

    public PersonBean() {
        person= new Person();
    }

   public String limpPerson() {
        person= new Person();
        return editPerson();
    }
    
    public String editPerson() {
        return "/cadastre/cadTeacher.xhtml";
    }
    
    public String addPerson() {
        if (person.getId() == null || person.getId() == 0) {
            insertPerson();
        } else {
            updatePerson();
        }
        limpPerson();
        return null;
    }
    
    private void insertPerson() {
        personFacade.create(person);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Gravação Efetuada com Sucesso", ""));
    }
    
    private void updatePerson() {
        personFacade.edit(person);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Atualização Efetuada com Sucesso", ""));
    }

    public void removePerson() {
        personFacade.remove(person);
    }

    public PersonDao getPersonFacade() {
        return personFacade;
    }

    public void setPersonFacade(PersonDao personFacade) {
        this.personFacade = personFacade;
    }

    public List<Person> getListPerson() {
        return listPerson;
    }

    public void setListPerson(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
       
}
