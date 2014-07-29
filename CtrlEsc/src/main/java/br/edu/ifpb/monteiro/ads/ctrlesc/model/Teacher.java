package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Address;
import br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses.Login;
import java.util.ArrayList;
import java.util.GregorianCalendar;
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
@Entity
@Table(name = "TB_teacher")
public class Teacher extends Person {
    
    @Column (name = "teacher_registration", length = 50)   
    private String teacheRegistration;
    
    @ManyToMany
    @JoinTable(name = "TB_teachers_Disciplines", joinColumns = @JoinColumn(name = "id_teacher"), inverseJoinColumns = @JoinColumn(name = "id_discipline"))
    private List<Discipline> teacherListDisciplines;

    @ManyToMany
    @JoinTable(name = "TB_teachers_StudentClasses", joinColumns = @JoinColumn(name = "id_teacher"), inverseJoinColumns = @JoinColumn(name = "id_studentClass"))
    private List<StudentClass> teacherListStudentClasses;

    public Teacher(String teacheRegistration, List<Discipline> teacherListDisciplines, List<StudentClass> teacherListStudentClasses, String personName, String personCpf, GregorianCalendar personDateBirth, Address personAddress, String personBreed, String personRegistration, char personSex, byte[] personPhoto, String personNationality, GregorianCalendar personEntryDate, String personPhoneOne, String perosnPhoneTwo, String personCivilStatus, Login personLogin, String personNameMother, String personNameFather) {
        super(personName, personCpf, personDateBirth, personAddress, personBreed, personRegistration, personSex, personPhoto, personNationality, personEntryDate, personPhoneOne, perosnPhoneTwo, personCivilStatus, personLogin, personNameMother, personNameFather);
        this.teacheRegistration = teacheRegistration;
        this.teacherListDisciplines = teacherListDisciplines;
        this.teacherListStudentClasses = teacherListStudentClasses;
    }

    public Teacher() {
        teacherListDisciplines = new ArrayList<Discipline>();
        teacherListStudentClasses = new ArrayList<StudentClass>();
    }

    //Get's and Set's
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


