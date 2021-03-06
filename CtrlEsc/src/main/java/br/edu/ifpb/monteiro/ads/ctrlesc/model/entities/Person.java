
package br.edu.ifpb.monteiro.ads.ctrlesc.model.entities;

import br.edu.ifpb.monteiro.ads.ctrlesc.util.model.Address;
import java.util.Date;
import javax.inject.Inject;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity Person contains atribudos and methods of creating a 
 * person.
 * @author E.Wellington
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person implements Identifiable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column (name = "person_name", length = 100, nullable = false)
    private String personName;
    
    @Column (name = "person_cpf", length = 15, unique = true )
    private String personCpf;
    
    @Column(name = "person_date_birth")
    @Temporal (TemporalType.DATE)
    private Date personDateBirth;
    
    @Inject
    @Embedded
    private Address personAddress;
    
    @Column (name = "person_breed", length = 30)
    private String personBreed;
    
    @Column (name = "person_rg", length = 12)   
    private String personRg;
    
    @Column (name ="person_sex", nullable = false )
    private char personSex;
    
//    @Column (name = "person_photo")
//    @Lob
//    @Transient
//    private byte[] personPhoto;
//    
    @Column (name = "person_nationality",length = 50)
    private String personNationality;
    
    @Column (name = "person_entry_date")
    @Temporal(TemporalType.DATE)
    private Date personEntryDate;
    
    @Column (name = "person_phone_one" , length = 25)
    private String personPhoneOne;
    
    @Column (name = "person_phone_two" , length = 25)
    private String personPhoneTwo;
    
//    @Column (name = "person_phone_three" , length = 25)
//    private String personPhoneThree;
    
    @Column (name = "person_civil_status", length = 15)
    private String personCivilStatus;
    
    
    @Column (name="person_name_mother",length = 100)
    private String personNameMother;
    
    @Column (name="person_name_father",length = 100)
    private String personNameFather;
    
   

    
    
    
    
    public Person() {
        
    }

    public Person(Long id, String personName, String personCpf, Date personDateBirth, Address personAddress, String personBreed, String personRg, char personSex,  String personNationality, Date personEntryDate, String personPhoneOne, String personPhoneTwo, String personCivilStatus, String personNameMother, String personNameFather) {
        this.id = id;
        this.personName = personName;
        this.personCpf = personCpf;
        this.personDateBirth = personDateBirth;
        this.personAddress = personAddress;
        this.personBreed = personBreed;
        this.personRg = personRg;
        this.personSex = personSex;
        this.personNationality = personNationality;
        this.personEntryDate = personEntryDate;
        this.personPhoneOne = personPhoneOne;
        this.personPhoneTwo = personPhoneTwo;
        this.personCivilStatus = personCivilStatus;
       
        this.personNameMother = personNameMother;
        this.personNameFather = personNameFather;
    }
       
    //Get's and Set's 
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonCpf() {
        return personCpf;
    }

    public void setPersonCpf(String personCpf) {
        this.personCpf = personCpf;
    }

    public Date getPersonDateBirth() {
        return personDateBirth;
    }

    public void setPersonDateBirth(Date personDateBirth) {
        this.personDateBirth = personDateBirth;
    }

    public Address getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(Address personAddress) {
        this.personAddress = personAddress;
    }

    public String getPersonBreed() {
        return personBreed;
    }

    public void setPersonBreed(String personBreed) {
        this.personBreed = personBreed;
    }

    public String getPersonRg() {
        return personRg;
    }

    public void setPersonRg(String personRg) {
        this.personRg = personRg;
    }

    public char getPersonSex() {
        return personSex;
    }

    public void setPersonSex(char personSex) {
        this.personSex = personSex;
    }

   
    public String getPersonNationality() {
        return personNationality;
    }

    public void setPersonNationality(String personNationality) {
        this.personNationality = personNationality;
    }

    public Date getPersonEntryDate() {
        return personEntryDate;
    }

    public void setPersonEntryDate(Date personEntryDate) {
        this.personEntryDate = personEntryDate;
    }

    public String getPersonPhoneOne() {
        return personPhoneOne;
    }

    public void setPersonPhoneOne(String personPhoneOne) {
        this.personPhoneOne = personPhoneOne;
    }

    public String getPersonPhoneTwo() {
        return personPhoneTwo;
    }

    public void setPersonPhoneTwo(String personPhoneTwo) {
        this.personPhoneTwo = personPhoneTwo;
    }

    public String getPersonCivilStatus() {
        return personCivilStatus;
    }

    public void setPersonCivilStatus(String personCivilStatus) {
        this.personCivilStatus = personCivilStatus;
    }

   

    public String getPersonNameMother() {
        return personNameMother;
    }

    public void setPersonNameMother(String personNameMother) {
        this.personNameMother = personNameMother;
    }

    public String getPersonNameFather() {
        return personNameFather;
    }

    public void setPersonNameFather(String personNameFather) {
        this.personNameFather = personNameFather;
    }
    
    @Override
    public Long getId(){
        return id;
    }

  
  
    
   
}
