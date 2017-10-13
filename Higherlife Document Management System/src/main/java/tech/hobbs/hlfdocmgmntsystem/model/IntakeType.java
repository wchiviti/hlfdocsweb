/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Wilsonc
 */
@Entity
@Table(name = "intake_types")
@NamedQueries({
    @NamedQuery(name = "IntakeTypes.findAll", query = "SELECT i FROM IntakeTypes i")
    , @NamedQuery(name = "IntakeTypes.findByIntakeId", query = "SELECT i FROM IntakeTypes i WHERE i.intakeId = :intakeId")
    , @NamedQuery(name = "IntakeTypes.findByIntakeName", query = "SELECT i FROM IntakeTypes i WHERE i.intakeName = :intakeName")})
public class IntakeType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "intake_id")
    private Integer intakeId;
    @Basic(optional = false)
    @Column(name = "intake_name")
    private String intakeName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "intakeId", fetch = FetchType.LAZY)
    private List<TertiaryStudent> tertiaryStudentsList;

    public IntakeType() {
    }

    public IntakeType(Integer intakeId) {
        this.intakeId = intakeId;
    }

    public IntakeType(Integer intakeId, String intakeName) {
        this.intakeId = intakeId;
        this.intakeName = intakeName;
    }

    public Integer getIntakeId() {
        return intakeId;
    }

    public void setIntakeId(Integer intakeId) {
        this.intakeId = intakeId;
    }

    public String getIntakeName() {
        return intakeName;
    }

    public void setIntakeName(String intakeName) {
        this.intakeName = intakeName;
    }

    public List<TertiaryStudent> getTertiaryStudentsList() {
        return tertiaryStudentsList;
    }

    public void setTertiaryStudentsList(List<TertiaryStudent> tertiaryStudentsList) {
        this.tertiaryStudentsList = tertiaryStudentsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (intakeId != null ? intakeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IntakeType)) {
            return false;
        }
        IntakeType other = (IntakeType) object;
        if ((this.intakeId == null && other.intakeId != null) || (this.intakeId != null && !this.intakeId.equals(other.intakeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.IntakeTypes[ intakeId=" + intakeId + " ]";
    }
    
}
