/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Login;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Address;
import java.util.Date;
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
    
    
    @Column (length = 100, nullable = false)
    private String name;
    
    @Column (name = "cpf", length = 11 )
    private String cpf;
    
    @Column
    @Temporal (TemporalType.DATE)
    @Basic(fetch = FetchType.LAZY)
    private Date dateBirth;
    
    @Column
    @Basic(fetch = FetchType.LAZY)
    private Address address;
    
    @Column
    @Basic(fetch = FetchType.LAZY)
    private String breed;
    
    @Column (length = 50)   
    private String registration;
    
    @Column
    @Basic(fetch = FetchType.LAZY)
    private char sex;
    
    @Column
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] photo;
    
    @Column (length = 50)
    @Basic(fetch = FetchType.LAZY)
    private String nationality;
    
    @Column
    @Basic(fetch = FetchType.LAZY)
    @Temporal(TemporalType.DATE)
    private Date entryDate;
    
    @Column (length = 25)
    @Basic(fetch = FetchType.LAZY)
    private String phoneOne;
    
    @Column (length = 25)
    @Basic(fetch = FetchType.LAZY)
    private String phoneTwo;
    
    @Column (length = 25)
    @Basic(fetch = FetchType.LAZY)
    private String phoneThree;
    
    @Column (length = 15)
    @Basic(fetch = FetchType.LAZY)
    private String civilStatus;
    
    @Column 
    @Basic(fetch = FetchType.LAZY)
    private Login login;
    
    @Column (length = 100)
    @Basic(fetch = FetchType.LAZY)
    private String nameMother;
    
    @Column (length = 100)
    @Basic(fetch = FetchType.LAZY)
    private String nameFather;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getPhoneOne() {
        return phoneOne;
    }

    public void setPhoneOne(String phoneOne) {
        this.phoneOne = phoneOne;
    }

    public String getPhoneTwo() {
        return phoneTwo;
    }

    public void setPhoneTwo(String phoneTwo) {
        this.phoneTwo = phoneTwo;
    }

    public String getPhoneThree() {
        return phoneThree;
    }

    public void setPhoneThree(String phoneThree) {
        this.phoneThree = phoneThree;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getNameMother() {
        return nameMother;
    }

    public void setNameMother(String nameMother) {
        this.nameMother = nameMother;
    }

    public String getNameFather() {
        return nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }
    
    
    
}
