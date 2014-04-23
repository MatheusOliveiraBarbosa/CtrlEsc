package br.edu.ifpb.monteiro.ads.ctrlesc.model;


import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Address;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table(name = "TB_responsible")
public class Responsible extends Identifiable {

    @Column(name = "responsible_name",length = 100, nullable = false)
    private String responsibleName;

    @Column(name = "responsible_level_education",length = 50)
    private String responsibleLevelEducation;

    @Column(name= "responsible_phone", length = 50)
    private String responsiblePhone;

    @Column(name = "responsible_profession",length = 50)
    private String responsibleProfession;

    @Column (name = "responsible_address") 
    private Address responsibleAddress;

    @Column (name = "responsible_family_income")
    @Min(value = 0)
    private double responsibleFamilyIncome;
    
    @Column (name = "responsible_age") 
    @Min(value = 18)
    private int responsibleAge;
    
    @Column(name = "responsible_degree_kiniship", length = 50)
    private String responsibleDegreeKinship;

    @Column (name = "responsible_business_address")
    private Address responsibleBusinessAddress;
    
    @OneToMany (mappedBy = "student", targetEntity = Student.class, fetch = FetchType.LAZY)    
    private List<Student> responsibleListStudenst;

    public Responsible() {
    responsibleListStudenst = new ArrayList<Student>();
    
    }

    public Responsible(String responsibleName, String responsibleLevelEducation, String responsiblePhone, String responsibleProfession, Address responsibleAddress, double responsibleFamilyIncome, int responsibleAge, String responsibleDegreeKinship, Address responsibleBusinessAddress, List<Student> responsibleListStudenst) {
        this.responsibleName = responsibleName;
        this.responsibleLevelEducation = responsibleLevelEducation;
        this.responsiblePhone = responsiblePhone;
        this.responsibleProfession = responsibleProfession;
        this.responsibleAddress = responsibleAddress;
        this.responsibleFamilyIncome = responsibleFamilyIncome;
        this.responsibleAge = responsibleAge;
        this.responsibleDegreeKinship = responsibleDegreeKinship;
        this.responsibleBusinessAddress = responsibleBusinessAddress;
        this.responsibleListStudenst = responsibleListStudenst;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getResponsibleLevelEducation() {
        return responsibleLevelEducation;
    }

    public void setResponsibleLevelEducation(String responsibleLevelEducation) {
        this.responsibleLevelEducation = responsibleLevelEducation;
    }

    public String getResponsiblePhone() {
        return responsiblePhone;
    }

    public void setResponsiblePhone(String responsiblePhone) {
        this.responsiblePhone = responsiblePhone;
    }

    public String getResponsibleProfession() {
        return responsibleProfession;
    }

    public void setResponsibleProfession(String responsibleProfession) {
        this.responsibleProfession = responsibleProfession;
    }

    public Address getResponsibleAddress() {
        return responsibleAddress;
    }

    public void setResponsibleAddress(Address responsibleAddress) {
        this.responsibleAddress = responsibleAddress;
    }

    public double getResponsibleFamilyIncome() {
        return responsibleFamilyIncome;
    }

    public void setResponsibleFamilyIncome(double responsibleFamilyIncome) {
        this.responsibleFamilyIncome = responsibleFamilyIncome;
    }

    public int getResponsibleAge() {
        return responsibleAge;
    }

    public void setResponsibleAge(int responsibleAge) {
        this.responsibleAge = responsibleAge;
    }

    public String getResponsibleDegreeKinship() {
        return responsibleDegreeKinship;
    }

    public void setResponsibleDegreeKinship(String responsibleDegreeKinship) {
        this.responsibleDegreeKinship = responsibleDegreeKinship;
    }

    public Address getResponsibleBusinessAddress() {
        return responsibleBusinessAddress;
    }

    public void setResponsibleBusinessAddress(Address responsibleBusinessAddress) {
        this.responsibleBusinessAddress = responsibleBusinessAddress;
    }

    public List<Student> getResponsibleListStudenst() {
        return responsibleListStudenst;
    }

    public void setResponsibleListStudenst(List<Student> responsibleListStudenst) {
        this.responsibleListStudenst = responsibleListStudenst;
    }
    
    
      
    
}
