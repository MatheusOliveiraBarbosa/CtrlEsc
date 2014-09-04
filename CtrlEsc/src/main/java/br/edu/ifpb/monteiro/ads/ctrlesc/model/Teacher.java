package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Address;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Login;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Entity Teacher contains atribudos and methods of creating a 
 * teacher.
 * 
 * @author Ricardo
 */
@br.edu.ifpb.monteiro.ads.ctrlesc.model.qualifiers.Teacher
@Entity
@Table(name = "TB_teacher")
public class Teacher extends Person {
    
    @Column (name = "teacher_registration", length = 50)   
    private String teacherRegistration;
    
    @ManyToMany
    @JoinTable(name = "TB_teachers_Disciplines", joinColumns = @JoinColumn(name = "id_teacher"), inverseJoinColumns = @JoinColumn(name = "id_discipline"))
    private List<Discipline> teacherListDisciplines;

    @ManyToMany
    @JoinTable(name = "TB_teachers_StudentClasses", joinColumns = @JoinColumn(name = "id_teacher"), inverseJoinColumns = @JoinColumn(name = "id_studentClass"))
    private List<StudentClass> teacherListStudentClasses;

   
    public Teacher() {
        teacherListDisciplines = new ArrayList<Discipline>();
        teacherListStudentClasses = new ArrayList<StudentClass>();
    }

    public Teacher(String teacheRegistration, List<Discipline> teacherListDisciplines, List<StudentClass> teacherListStudentClasses, Long id, String personName, String personCpf, Date personDateBirth, Address personAddress, String personBreed, String personRg, char personSex, byte[] personPhoto, String personNationality, Date personEntryDate, String personPhoneOne, String personPhoneTwo, String personCivilStatus, Login personLogin, String personNameMother, String personNameFather) {
        super(id, personName, personCpf, personDateBirth, personAddress, personBreed, personRg, personSex, personPhoto, personNationality, personEntryDate, personPhoneOne, personPhoneTwo, personCivilStatus, personLogin, personNameMother, personNameFather);
        this.teacherRegistration = teacheRegistration;
        this.teacherListDisciplines = teacherListDisciplines;
        this.teacherListStudentClasses = teacherListStudentClasses;
    }

    //Get's and Set's
    public String getTeacherRegistration() {
        return teacherRegistration;
    }

    public void setTeacherRegistration(String teacherRegistration) {
        this.teacherRegistration = teacherRegistration;
    }

    public List<Discipline> getTeacherListDisciplines() {
        return teacherListDisciplines;
    }

    public void setTeacherListDisciplines(List<Discipline> teacherListDisciplines) {
        this.teacherListDisciplines = teacherListDisciplines;
    }

    public List<StudentClass> getTeacherListStudentClasses() {
        return teacherListStudentClasses;
    }

    public void setTeacherListStudentClasses(List<StudentClass> teacherListStudentClasses) {
        this.teacherListStudentClasses = teacherListStudentClasses;
    }

}


