package br.edu.ifpb.monteiro.ads.ctrlesc.model.entities;


import br.edu.ifpb.monteiro.ads.ctrlesc.model.security.User;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Address;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 * Entity Responsible contains atribudos and methods of creating a 
 * responsible.
 * 
 * @author E.Wellington
 */
@br.edu.ifpb.monteiro.ads.ctrlesc.model.qualifiers.Responsible
@Entity
@Table(name = "TB_responsible")
public class Responsible extends Person{

    @Column(name = "responsible_level_education",length = 50)
    private String responsibleLevelEducation;

    @Column(name = "responsible_profession",length = 50)
    private String responsibleProfession;

    @Column (name = "responsible_family_income")
    @Min(value = 0)
    private Integer responsibleFamilyIncome;
    
    @Column(name = "responsible_degree_kiniship", length = 50)
    private String responsibleDegreeKinship;

    @OneToMany (mappedBy = "studentResponsible", targetEntity = Student.class)
    private List<Student> responsibleListStudenst;

    public Responsible() {
    
    }

    public Responsible(String responsibleLevelEducation, String responsibleProfession, Integer responsibleFamilyIncome, String responsibleDegreeKinship, List<Student> responsibleListStudenst, Long id, String personName, String personCpf, Date personDateBirth, Address personAddress, String personBreed, String personRg, char personSex, byte[] personPhoto, String personNationality, Date personEntryDate, String personPhoneOne, String personPhoneTwo, String personCivilStatus, String personNameMother, String personNameFather) {
        super(id, personName, personCpf, personDateBirth, personAddress, personBreed, personRg, personSex, personNationality, personEntryDate, personPhoneOne, personPhoneTwo, personCivilStatus, personNameMother, personNameFather);
        this.responsibleLevelEducation = responsibleLevelEducation;
        this.responsibleProfession = responsibleProfession;
        this.responsibleFamilyIncome = responsibleFamilyIncome;
        this.responsibleDegreeKinship = responsibleDegreeKinship;
        this.responsibleListStudenst = responsibleListStudenst;
    }
  
    //Get's and Set's 
    public String getResponsibleLevelEducation() {
        return responsibleLevelEducation;
    }

    public void setResponsibleLevelEducation(String responsibleLevelEducation) {
        this.responsibleLevelEducation = responsibleLevelEducation;
    }

    public String getResponsibleProfession() {
        return responsibleProfession;
    }

    public void setResponsibleProfession(String responsibleProfession) {
        this.responsibleProfession = responsibleProfession;
    }

    public Integer getResponsibleFamilyIncome() {
        return responsibleFamilyIncome;
    }

    public void setResponsibleFamilyIncome(Integer responsibleFamilyIncome) {
        this.responsibleFamilyIncome = responsibleFamilyIncome;
    }

    public String getResponsibleDegreeKinship() {
        return responsibleDegreeKinship;
    }

    public void setResponsibleDegreeKinship(String responsibleDegreeKinship) {
        this.responsibleDegreeKinship = responsibleDegreeKinship;
    }

    public List<Student> getResponsibleListStudenst() {
        return responsibleListStudenst;
    }

    public void setResponsibleListStudenst(List<Student> responsibleListStudenst) {
        this.responsibleListStudenst = responsibleListStudenst;
    }
    
}
