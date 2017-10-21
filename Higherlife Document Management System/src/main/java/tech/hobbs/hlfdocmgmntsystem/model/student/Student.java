/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model.student;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Profile;

import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityImage;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityVideo;
import tech.hobbs.hlfdocmgmntsystem.model.documents.ActivityProposal;
import tech.hobbs.hlfdocmgmntsystem.model.documents.ActivityReport;
import tech.hobbs.hlfdocmgmntsystem.model.documents.ProgressReport;
import tech.hobbs.hlfdocmgmntsystem.model.documents.Quotation;
import tech.hobbs.hlfdocmgmntsystem.model.security.User;
import tech.hobbs.hlfdocmgmntsystem.model.security.UserProfile;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "students")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")
    , @NamedQuery(name = "Student.findById", query = "SELECT s FROM Student s WHERE s.id = :id")
    , @NamedQuery(name = "Student.findByFileno", query = "SELECT s FROM Student s WHERE s.fileno = :fileno")
    , @NamedQuery(name = "Student.findByName", query = "SELECT s FROM Student s WHERE s.name = :name")
    , @NamedQuery(name = "Student.findBySurname", query = "SELECT s FROM Student s WHERE s.surname = :surname")
    , @NamedQuery(name = "Student.findByDob", query = "SELECT s FROM Student s WHERE s.dob = :dob")
    , @NamedQuery(name = "Student.findByCellNumber", query = "SELECT s FROM Student s WHERE s.cellNumber = :cellNumber")
    , @NamedQuery(name = "Student.findByEmailAddress", query = "SELECT s FROM Student s WHERE s.emailAddress = :emailAddress")
    , @NamedQuery(name = "Student.findByAge", query = "SELECT s FROM Student s WHERE s.age = :age")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "fileno")
    private String fileno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "surname")
    private String surname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Size(max = 50)
    @Column(name = "cell_number")
    private String cellNumber;
    @Size(max = 100)
    @Column(name = "email_address")
    private String emailAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "age")
    private int age;
    @ManyToMany(mappedBy = "studentList", fetch = FetchType.LAZY)
    private List<UserProfile> profileList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<ActivityImage> activityImageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<ProgressReport> progressReportList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<TertiaryStudent> tertiaryStudentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileo", fetch = FetchType.LAZY)
    private List<Quotation> quotationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<ActivityVideo> activityVideoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<ActivityProposal> activityProposalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<StudentResult> studentResultList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<User> userList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<ActivityReport> activityReportList;

    public Student() {
    }

    public Student(String fileno) {
        this.fileno = fileno;
    }

    public Student(String fileno, int id, String name, String surname, Date dob, int age) {
        this.fileno = fileno;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileno() {
        return fileno;
    }

    public void setFileno(String fileno) {
        this.fileno = fileno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<UserProfile> getProfileList() {
        return profileList;
    }

    public void setProfileList(List<UserProfile> profileList) {
        this.profileList = profileList;
    }

    public List<ActivityImage> getActivityImageList() {
        return activityImageList;
    }

    public void setActivityImageList(List<ActivityImage> activityImageList) {
        this.activityImageList = activityImageList;
    }

    public List<ProgressReport> getProgressReportList() {
        return progressReportList;
    }

    public void setProgressReportList(List<ProgressReport> progressReportList) {
        this.progressReportList = progressReportList;
    }

    public List<TertiaryStudent> getTertiaryStudentList() {
        return tertiaryStudentList;
    }

    public void setTertiaryStudentList(List<TertiaryStudent> tertiaryStudentList) {
        this.tertiaryStudentList = tertiaryStudentList;
    }

    public List<Quotation> getQuotationList() {
        return quotationList;
    }

    public void setQuotationList(List<Quotation> quotationList) {
        this.quotationList = quotationList;
    }

    public List<ActivityVideo> getActivityVideoList() {
        return activityVideoList;
    }

    public void setActivityVideoList(List<ActivityVideo> activityVideoList) {
        this.activityVideoList = activityVideoList;
    }

    public List<ActivityProposal> getActivityProposalList() {
        return activityProposalList;
    }

    public void setActivityProposalList(List<ActivityProposal> activityProposalList) {
        this.activityProposalList = activityProposalList;
    }

    public List<StudentResult> getStudentResultList() {
        return studentResultList;
    }

    public void setStudentResultList(List<StudentResult> studentResultList) {
        this.studentResultList = studentResultList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<ActivityReport> getActivityReportList() {
        return activityReportList;
    }

    public void setActivityReportList(List<ActivityReport> activityReportList) {
        this.activityReportList = activityReportList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fileno != null ? fileno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.fileno == null && other.fileno != null) || (this.fileno != null && !this.fileno.equals(other.fileno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.Student[ fileno=" + fileno + " ]";
    }
    
}
