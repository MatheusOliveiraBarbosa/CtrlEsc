
package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Login;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Address;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.Basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author E.Wellington
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table (name = "TB_person")
public abstract class Person extends Identifiable {
    
    
    @Column (name = "person_name", length = 100, nullable = false)
    private String personName;
    
    @Column (name = "person_cpf", length = 11, unique = true )
    private String personCpf;
    
    @Column(name = "person_date_birth")
    @Temporal (TemporalType.DATE)
    private GregorianCalendar personDateBirth;
    
    @Column (name = "person_address")
    private Address personAddress;
    
    @Column (name = "person_breed", length = 30)
    private String personBreed;
    
    @Column (name = "person_registration", length = 50)   
    private String personRegistration;
    
    @Column (name ="person_sex", nullable = false )
    private char personSex;
    
    @Column (name = "person_photo")
    @Lob
    private byte[] personPhoto;
    
    @Column (name = "person_nationality",length = 50)
    private String personNationality;
    
    @Column (name = "person_entry_date")
    @Temporal(TemporalType.DATE)
    private GregorianCalendar personEntryDate;
    
    @Column (name = "person_phone_one" , length = 25)
    private String personPhoneOne;
    
    @Column (name = "person_phone_two" , length = 25)
    private String perosnPhoneTwo;
    
    @Column (name = "person_phone_three" , length = 25)
    private String personPhoneThree;
    
    @Column (name = "person_civil_status", length = 15)
    private String personCivilStatus;
    
    @Column (name = "person_login")
    private Login personLogin;
    
    @Column (name="person_name_mother",length = 100)
    private String personNameMother;
    
    @Column (name="person_name_father",length = 100)
    private String personNameFather;

    public Person() {
            
    }

    public Person(String personName, String personCpf, GregorianCalendar personDateBirth, Address personAddress, String personBreed, String personRegistration, char personSex, byte[] personPhoto, String personNationality, GregorianCalendar personEntryDate, String personPhoneOne, String perosnPhoneTwo, String personPhoneThree, String personCivilStatus, Login personLogin, String personNameMother, String personNameFather) {
        this.personName = personName;
        this.personCpf = personCpf;
        this.personDateBirth = personDateBirth;
        this.personAddress = personAddress;
        this.personBreed = personBreed;
        this.personRegistration = personRegistration;
        this.personSex = personSex;
        this.personPhoto = personPhoto;
        this.personNationality = personNationality;
        this.personEntryDate = personEntryDate;
        this.personPhoneOne = personPhoneOne;
        this.perosnPhoneTwo = perosnPhoneTwo;
        this.personPhoneThree = personPhoneThree;
        this.personCivilStatus = personCivilStatus;
        this.personLogin = personLogin;
        this.personNameMother = personNameMother;
        this.personNameFather = personNameFather;
    }
    
    

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

    public GregorianCalendar getPersonDateBirth() {
        return personDateBirth;
    }

    public void setPersonDateBirth(GregorianCalendar personDateBirth) {
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

    public String getPersonRegistration() {
        return personRegistration;
    }

    public void setPersonRegistration(String personRegistration) {
        this.personRegistration = personRegistration;
    }

    public char getPersonSex() {
        return personSex;
    }

    public void setPersonSex(char personSex) {
        this.personSex = personSex;
    }

    public byte[] getPersonPhoto() {
        return personPhoto;
    }

    public void setPersonPhoto(byte[] personPhoto) {
        this.personPhoto = personPhoto;
    }

    public String getPersonNationality() {
        return personNationality;
    }

    public void setPersonNationality(String personNationality) {
        this.personNationality = personNationality;
    }

    public GregorianCalendar getPersonEntryDate() {
        return personEntryDate;
    }

    public void setPersonEntryDate(GregorianCalendar personEntryDate) {
        this.personEntryDate = personEntryDate;
    }

    public String getPersonPhoneOne() {
        return personPhoneOne;
    }

    public void setPersonPhoneOne(String personPhoneOne) {
        this.personPhoneOne = personPhoneOne;
    }

    public String getPerosnPhoneTwo() {
        return perosnPhoneTwo;
    }

    public void setPerosnPhoneTwo(String perosnPhoneTwo) {
        this.perosnPhoneTwo = perosnPhoneTwo;
    }

    public String getPersonPhoneThree() {
        return personPhoneThree;
    }

    public void setPersonPhoneThree(String personPhoneThree) {
        this.personPhoneThree = personPhoneThree;
    }

    public String getPersonCivilStatus() {
        return personCivilStatus;
    }

    public void setPersonCivilStatus(String personCivilStatus) {
        this.personCivilStatus = personCivilStatus;
    }

    public Login getPersonLogin() {
        return personLogin;
    }

    public void setPersonLogin(Login personLogin) {
        this.personLogin = personLogin;
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
    
    
    
    
}
