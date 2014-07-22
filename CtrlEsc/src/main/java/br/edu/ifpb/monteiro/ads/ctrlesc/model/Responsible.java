package br.edu.ifpb.monteiro.ads.ctrlesc.model;


import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Address;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 * Entity Responsible contains atribudos and methods of creating a 
 * responsible.
 * 
 * @author E.Wellington
 */

@Entity
@Table(name = "TB_responsible")
public class Responsible implements Identifiable<Responsible> {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @Column(name = "responsible_name",length = 100, nullable = false)
//    private String responsibleName;

    @Column(name = "responsible_level_education",length = 50)
    private String responsibleLevelEducation;

//    @Column(name= "responsible_phone", length = 50)
//    private String responsiblePhone;

    @Column(name = "responsible_profession",length = 50)
    private String responsibleProfession;

    @Embedded
    private Address responsibleAddress;

    @Column (name = "responsible_family_income")
    @Min(value = 0)
    private double responsibleFamilyIncome;
    
//    @Column (name = "responsible_age") 
//    @Min(value = 18)
//    private int responsibleAge;
    
    @Column(name = "responsible_degree_kiniship", length = 50)
    private String responsibleDegreeKinship;

//    @Embedded
//    private Address responsibleBusinessAddress;
    
    @OneToMany (mappedBy = "studentResponsible", targetEntity = Student.class)
    private List<Student> responsibleListStudenst;

    public Responsible() {
    responsibleListStudenst = new ArrayList<Student>();
    
    }

    
    public Responsible(Long id, String responsibleLevelEducation, String responsibleProfession, Address responsibleAddress, double responsibleFamilyIncome, String responsibleDegreeKinship, List<Student> responsibleListStudenst) {
        this.id = id;
        this.responsibleLevelEducation = responsibleLevelEducation;
        this.responsibleProfession = responsibleProfession;
        this.responsibleAddress = responsibleAddress;
        this.responsibleFamilyIncome = responsibleFamilyIncome;
        this.responsibleDegreeKinship = responsibleDegreeKinship;
        this.responsibleListStudenst = responsibleListStudenst;
    }

    //Get's and Set's 
    
//    public String getResponsibleName() {
//        return responsibleName;
//    }
//
//    public void setResponsibleName(String responsibleName) {
//        this.responsibleName = responsibleName;
//    }

    public String getResponsibleLevelEducation() {
        return responsibleLevelEducation;
    }

    public void setResponsibleLevelEducation(String responsibleLevelEducation) {
        this.responsibleLevelEducation = responsibleLevelEducation;
    }

//    public String getResponsiblePhone() {
//        return responsiblePhone;
//    }
//
//    public void setResponsiblePhone(String responsiblePhone) {
//        this.responsiblePhone = responsiblePhone;
//    }

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

//    public int getResponsibleAge() {
//        return responsibleAge;
//    }
//
//    public void setResponsibleAge(int responsibleAge) {
//        this.responsibleAge = responsibleAge;
//    }

    public String getResponsibleDegreeKinship() {
        return responsibleDegreeKinship;
    }

    public void setResponsibleDegreeKinship(String responsibleDegreeKinship) {
        this.responsibleDegreeKinship = responsibleDegreeKinship;
    }

//    public Address getResponsibleBusinessAddress() {
//        return responsibleBusinessAddress;
//    }
//
//    public void setResponsibleBusinessAddress(Address responsibleBusinessAddress) {
//        this.responsibleBusinessAddress = responsibleBusinessAddress;
//    }

    public List<Student> getResponsibleListStudenst() {
        return responsibleListStudenst;
    }

    public void setResponsibleListStudenst(List<Student> responsibleListStudenst) {
        this.responsibleListStudenst = responsibleListStudenst;
    }
     @Override
    public Long getId(){
        return id;
    }
    
    @Override
    public void setId(Long id){
        this.id = id;
    }
    
}
