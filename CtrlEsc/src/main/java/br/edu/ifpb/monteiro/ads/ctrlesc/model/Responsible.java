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
    private String phone;

    @Column(name = "responsible_profession",length = 50)
    private String profession;

    @Column
    @Basic(fetch = FetchType.LAZY)
    private Address address;

    // see how to make a check (restriction)
    // the value of familyIncome must be greater than 0.
    @Column(length = 50)
    @Basic(fetch = FetchType.LAZY)
    @Min(value = 0)
    private double familyIncome;
    
    @Min(value = 18)
    private int age;
    
    @Column(length = 50)
    private String degreeKinship;

    @Column
    @Basic(fetch = FetchType.LAZY)
    private Address businessAddress;
    
    @Column
    @OneToMany (mappedBy = "student", targetEntity = Student.class, fetch = FetchType.LAZY)    
    private List<Student> listStudenst;

    public Responsible(String name, String levelEducation, String phone, String profession, Address address, double familyIncome, int age, String degreeKinship, Address businessAddress, ArrayList<Student> listStudenst) {
        this.responsibleName = name;
        this.responsibleLevelEducation = levelEducation;
        this.phone = phone;
        this.profession = profession;
        this.address = address;
        this.familyIncome = familyIncome;
        this.age = age;
        this.degreeKinship = degreeKinship;
        this.businessAddress = businessAddress;
        this.listStudenst = listStudenst;
    }

    public Responsible() {
        listStudenst = new ArrayList<Student>();
    }
   
    
}
