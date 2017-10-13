/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model;

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

/**
 *
 * @author Wilsonc
 */
@Entity
@Table(name = "students")
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s")
    , @NamedQuery(name = "Students.findById", query = "SELECT s FROM Students s WHERE s.id = :id")
    , @NamedQuery(name = "Students.findByFileno", query = "SELECT s FROM Students s WHERE s.fileno = :fileno")
    , @NamedQuery(name = "Students.findByName", query = "SELECT s FROM Students s WHERE s.name = :name")
    , @NamedQuery(name = "Students.findBySurname", query = "SELECT s FROM Students s WHERE s.surname = :surname")
    , @NamedQuery(name = "Students.findByDob", query = "SELECT s FROM Students s WHERE s.dob = :dob")
    , @NamedQuery(name = "Students.findByCellNumber", query = "SELECT s FROM Students s WHERE s.cellNumber = :cellNumber")
    , @NamedQuery(name = "Students.findByEmailAddress", query = "SELECT s FROM Students s WHERE s.emailAddress = :emailAddress")
    , @NamedQuery(name = "Students.findByAge", query = "SELECT s FROM Students s WHERE s.age = :age")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Id
    @Basic(optional = false)
    @Column(name = "fileno")
    private String fileno;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "surname")
    private String surname;
    @Basic(optional = false)
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "cell_number")
    private String cellNumber;
    @Column(name = "email_address")
    private String emailAddress;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;
    @ManyToMany(mappedBy = "studentsList", fetch = FetchType.LAZY)
    private List<Group> groupsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<ActivityImage> activityImagesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<ProgressReport> progressReportsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileo", fetch = FetchType.LAZY)
    private List<Quotation> quotationsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<ActivityVideo> activityVideosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<TertiaryStudent> tertiaryStudentsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<ActivityProposal> activityProposalsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<StudentResults> studentResultsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<User> usersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileno", fetch = FetchType.LAZY)
    private List<ActivityReport> activityReportsList;

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

    public List<Group> getGroupsList() {
        return groupsList;
    }

    public void setGroupsList(List<Group> groupsList) {
        this.groupsList = groupsList;
    }

    public List<ActivityImage> getActivityImagesList() {
        return activityImagesList;
    }

    public void setActivityImagesList(List<ActivityImage> activityImagesList) {
        this.activityImagesList = activityImagesList;
    }

    public List<ProgressReport> getProgressReportsList() {
        return progressReportsList;
    }

    public void setProgressReportsList(List<ProgressReport> progressReportsList) {
        this.progressReportsList = progressReportsList;
    }

    public List<Quotation> getQuotationsList() {
        return quotationsList;
    }

    public void setQuotationsList(List<Quotation> quotationsList) {
        this.quotationsList = quotationsList;
    }

    public List<ActivityVideo> getActivityVideosList() {
        return activityVideosList;
    }

    public void setActivityVideosList(List<ActivityVideo> activityVideosList) {
        this.activityVideosList = activityVideosList;
    }

    public List<TertiaryStudent> getTertiaryStudentsList() {
        return tertiaryStudentsList;
    }

    public void setTertiaryStudentsList(List<TertiaryStudent> tertiaryStudentsList) {
        this.tertiaryStudentsList = tertiaryStudentsList;
    }

    public List<ActivityProposal> getActivityProposalsList() {
        return activityProposalsList;
    }

    public void setActivityProposalsList(List<ActivityProposal> activityProposalsList) {
        this.activityProposalsList = activityProposalsList;
    }

    public List<StudentResults> getStudentResultsList() {
        return studentResultsList;
    }

    public void setStudentResultsList(List<StudentResults> studentResultsList) {
        this.studentResultsList = studentResultsList;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public List<ActivityReport> getActivityReportsList() {
        return activityReportsList;
    }

    public void setActivityReportsList(List<ActivityReport> activityReportsList) {
        this.activityReportsList = activityReportsList;
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
        return "tech.hobbs.hlfdocmgmntsystem.model.Students[ fileno=" + fileno + " ]";
    }
    
}
