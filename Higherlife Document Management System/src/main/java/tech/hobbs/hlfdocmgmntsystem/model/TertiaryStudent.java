/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Wilsonc
 */
@Entity
@Table(name = "tertiary_students")
@NamedQueries({
    @NamedQuery(name = "TertiaryStudents.findAll", query = "SELECT t FROM TertiaryStudents t")
    , @NamedQuery(name = "TertiaryStudents.findById", query = "SELECT t FROM TertiaryStudents t WHERE t.id = :id")
    , @NamedQuery(name = "TertiaryStudents.findByRegNo", query = "SELECT t FROM TertiaryStudents t WHERE t.regNo = :regNo")
    , @NamedQuery(name = "TertiaryStudents.findByNationalId", query = "SELECT t FROM TertiaryStudents t WHERE t.nationalId = :nationalId")})
public class TertiaryStudent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "reg_no")
    private String regNo;
    @Basic(optional = false)
    @Column(name = "national_id")
    private String nationalId;
    @JoinColumn(name = "intake_id", referencedColumnName = "intake_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private IntakeType intakeId;
    @JoinColumn(name = "program_code", referencedColumnName = "program_code")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Program programCode;
    @JoinColumn(name = "fileno", referencedColumnName = "fileno")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Student fileno;
    @JoinColumn(name = "tertiary_code", referencedColumnName = "tertiary_code")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TertiaryInstitution tertiaryCode;
    @JoinColumn(name = "level_id", referencedColumnName = "level_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TertiaryLevel levelId;

    public TertiaryStudent() {
    }

    public TertiaryStudent(Integer id) {
        this.id = id;
    }

    public TertiaryStudent(Integer id, String regNo, String nationalId) {
        this.id = id;
        this.regNo = regNo;
        this.nationalId = nationalId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public IntakeType getIntakeId() {
        return intakeId;
    }

    public void setIntakeId(IntakeType intakeId) {
        this.intakeId = intakeId;
    }

    public Program getProgramCode() {
        return programCode;
    }

    public void setProgramCode(Program programCode) {
        this.programCode = programCode;
    }

    public Student getFileno() {
        return fileno;
    }

    public void setFileno(Student fileno) {
        this.fileno = fileno;
    }

    public TertiaryInstitution getTertiaryCode() {
        return tertiaryCode;
    }

    public void setTertiaryCode(TertiaryInstitution tertiaryCode) {
        this.tertiaryCode = tertiaryCode;
    }

    public TertiaryLevel getLevelId() {
        return levelId;
    }

    public void setLevelId(TertiaryLevel levelId) {
        this.levelId = levelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TertiaryStudent)) {
            return false;
        }
        TertiaryStudent other = (TertiaryStudent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.TertiaryStudents[ id=" + id + " ]";
    }
    
}
