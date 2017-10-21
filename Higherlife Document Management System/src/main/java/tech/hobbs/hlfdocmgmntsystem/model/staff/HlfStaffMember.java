/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model.staff;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "hlf_staff")
@NamedQueries({
    @NamedQuery(name = "HlfStaffMember.findAll", query = "SELECT h FROM HlfStaffMember h")
    , @NamedQuery(name = "HlfStaffMember.findById", query = "SELECT h FROM HlfStaffMember h WHERE h.id = :id")
    , @NamedQuery(name = "HlfStaffMember.findByFileno", query = "SELECT h FROM HlfStaffMember h WHERE h.fileno = :fileno")
    , @NamedQuery(name = "HlfStaffMember.findByName", query = "SELECT h FROM HlfStaffMember h WHERE h.name = :name")
    , @NamedQuery(name = "HlfStaffMember.findBySurname", query = "SELECT h FROM HlfStaffMember h WHERE h.surname = :surname")
    , @NamedQuery(name = "HlfStaffMember.findByDob", query = "SELECT h FROM HlfStaffMember h WHERE h.dob = :dob")
    , @NamedQuery(name = "HlfStaffMember.findByCellNumber", query = "SELECT h FROM HlfStaffMember h WHERE h.cellNumber = :cellNumber")
    , @NamedQuery(name = "HlfStaffMember.findByEmailAddress", query = "SELECT h FROM HlfStaffMember h WHERE h.emailAddress = :emailAddress")})
public class HlfStaffMember implements Serializable {

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

    public HlfStaffMember() {
    }

    public HlfStaffMember(String fileno) {
        this.fileno = fileno;
    }

    public HlfStaffMember(String fileno, int id, String name, String surname, Date dob) {
        this.fileno = fileno;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fileno != null ? fileno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HlfStaffMember)) {
            return false;
        }
        HlfStaffMember other = (HlfStaffMember) object;
        if ((this.fileno == null && other.fileno != null) || (this.fileno != null && !this.fileno.equals(other.fileno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.HlfStaffMember[ fileno=" + fileno + " ]";
    }
    
}
