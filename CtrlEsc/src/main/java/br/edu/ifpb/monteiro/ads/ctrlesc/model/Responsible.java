package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Address;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table(name = "TB_responsible")
public class Responsible extends Identifiable {

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 50)
    @Basic(fetch = FetchType.LAZY)
    private String levelEducation;

    @Column(length = 50)
    @Basic(fetch = FetchType.LAZY)
    private String phone;

    @Column(length = 50)
    @Basic(fetch = FetchType.LAZY)
    private String profession;

    @Column
    @Basic(fetch = FetchType.LAZY)
    private Address address;

    // see how to make a check (restriction)
    // the value of familyIncome must be greater than 0.
    @Column(length = 50)
    @Basic(fetch = FetchType.LAZY)
    private double familyIncome;

    @Column
    @Basic(fetch = FetchType.LAZY)
    private int age;

    @Column(length = 50)
    @Basic(fetch = FetchType.LAZY)
    private String degreeKinship;

    @Column
    @Basic(fetch = FetchType.LAZY)
    private Address businessAddress;
    
    @Column
    @OneToMany (mappedBy = "student", targetEntity = Student.class, fetch = FetchType.LAZY)    
    private ArrayList<Student> listStudenst;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevelEducation() {
        return levelEducation;
    }

    public void setLevelEducation(String levelEducation) {
        this.levelEducation = levelEducation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getFamilyIncome() {
        return familyIncome;
    }

    public void setFamilyIncome(double familyIncome) {
        this.familyIncome = familyIncome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegreeKinship() {
        return degreeKinship;
    }

    public void setDegreeKinship(String degreeKinship) {
        this.degreeKinship = degreeKinship;
    }

    public Address getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(Address businessAddress) {
        this.businessAddress = businessAddress;
    }

    public ArrayList<Student> getListStudenst() {
        return listStudenst;
    }

    public void setListStudenst(ArrayList<Student> listStudenst) {
        this.listStudenst = listStudenst;
    }
    
    
    
}
