/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model;

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

/**
 *
 * @author Wilsonc
 */
@Entity
@Table(name = "hlf_staff")
@NamedQueries({
    @NamedQuery(name = "HlfStaff.findAll", query = "SELECT h FROM HlfStaff h")
    , @NamedQuery(name = "HlfStaff.findById", query = "SELECT h FROM HlfStaff h WHERE h.id = :id")
    , @NamedQuery(name = "HlfStaff.findByFileno", query = "SELECT h FROM HlfStaff h WHERE h.fileno = :fileno")
    , @NamedQuery(name = "HlfStaff.findByName", query = "SELECT h FROM HlfStaff h WHERE h.name = :name")
    , @NamedQuery(name = "HlfStaff.findBySurname", query = "SELECT h FROM HlfStaff h WHERE h.surname = :surname")
    , @NamedQuery(name = "HlfStaff.findByDob", query = "SELECT h FROM HlfStaff h WHERE h.dob = :dob")
    , @NamedQuery(name = "HlfStaff.findByCellNumber", query = "SELECT h FROM HlfStaff h WHERE h.cellNumber = :cellNumber")
    , @NamedQuery(name = "HlfStaff.findByEmailAddress", query = "SELECT h FROM HlfStaff h WHERE h.emailAddress = :emailAddress")})
public class HlfStaff implements Serializable {

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

    public HlfStaff() {
    }

    public HlfStaff(String fileno) {
        this.fileno = fileno;
    }

    public HlfStaff(String fileno, int id, String name, String surname, Date dob) {
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
        if (!(object instanceof HlfStaff)) {
            return false;
        }
        HlfStaff other = (HlfStaff) object;
        if ((this.fileno == null && other.fileno != null) || (this.fileno != null && !this.fileno.equals(other.fileno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.HlfStaff[ fileno=" + fileno + " ]";
    }
    
}
