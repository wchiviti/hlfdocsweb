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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "programs")
@NamedQueries({
    @NamedQuery(name = "Program.findAll", query = "SELECT p FROM Program p")
    , @NamedQuery(name = "Program.findByProgramCode", query = "SELECT p FROM Program p WHERE p.programCode = :programCode")
    , @NamedQuery(name = "Program.findByProgramName", query = "SELECT p FROM Program p WHERE p.programName = :programName")
    , @NamedQuery(name = "Program.findByProgramLegnth", query = "SELECT p FROM Program p WHERE p.programLegnth = :programLegnth")})
public class Program implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "program_code")
    private String programCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "program_name")
    private String programName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "program_legnth")
    private int programLegnth;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programCode", fetch = FetchType.LAZY)
    private List<TertiaryStudent> tertiaryStudentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programCode", fetch = FetchType.LAZY)
    private List<StudentResult> studentResultList;

    public Program() {
    }

    public Program(String programCode) {
        this.programCode = programCode;
    }

    public Program(String programCode, String programName, int programLegnth) {
        this.programCode = programCode;
        this.programName = programName;
        this.programLegnth = programLegnth;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getProgramLegnth() {
        return programLegnth;
    }

    public void setProgramLegnth(int programLegnth) {
        this.programLegnth = programLegnth;
    }

    public List<TertiaryStudent> getTertiaryStudentList() {
        return tertiaryStudentList;
    }

    public void setTertiaryStudentList(List<TertiaryStudent> tertiaryStudentList) {
        this.tertiaryStudentList = tertiaryStudentList;
    }

    public List<StudentResult> getStudentResultList() {
        return studentResultList;
    }

    public void setStudentResultList(List<StudentResult> studentResultList) {
        this.studentResultList = studentResultList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programCode != null ? programCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Program)) {
            return false;
        }
        Program other = (Program) object;
        if ((this.programCode == null && other.programCode != null) || (this.programCode != null && !this.programCode.equals(other.programCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.Program[ programCode=" + programCode + " ]";
    }
    
}
