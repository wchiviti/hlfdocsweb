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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Wilsonc
 */
@Entity
@Table(name = "student_results")
@NamedQueries({
    @NamedQuery(name = "StudentResults.findAll", query = "SELECT s FROM StudentResults s")
    , @NamedQuery(name = "StudentResults.findByResultsId", query = "SELECT s FROM StudentResults s WHERE s.resultsId = :resultsId")})
public class StudentResults implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "results_file")
    private byte[] resultsFile;
    @Id
    @Basic(optional = false)
    @Column(name = "results_id")
    private Integer resultsId;
    @JoinColumn(name = "program_code", referencedColumnName = "program_code")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Program programCode;
    @JoinColumn(name = "decision_id", referencedColumnName = "decision_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ResultsDecision decisionId;
    @JoinColumn(name = "fileno", referencedColumnName = "fileno")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Student fileno;

    public StudentResults() {
    }

    public StudentResults(Integer resultsId) {
        this.resultsId = resultsId;
    }

    public StudentResults(Integer resultsId, byte[] resultsFile) {
        this.resultsId = resultsId;
        this.resultsFile = resultsFile;
    }

    public byte[] getResultsFile() {
        return resultsFile;
    }

    public void setResultsFile(byte[] resultsFile) {
        this.resultsFile = resultsFile;
    }

    public Integer getResultsId() {
        return resultsId;
    }

    public void setResultsId(Integer resultsId) {
        this.resultsId = resultsId;
    }

    public Program getProgramCode() {
        return programCode;
    }

    public void setProgramCode(Program programCode) {
        this.programCode = programCode;
    }

    public ResultsDecision getDecisionId() {
        return decisionId;
    }

    public void setDecisionId(ResultsDecision decisionId) {
        this.decisionId = decisionId;
    }

    public Student getFileno() {
        return fileno;
    }

    public void setFileno(Student fileno) {
        this.fileno = fileno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resultsId != null ? resultsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentResults)) {
            return false;
        }
        StudentResults other = (StudentResults) object;
        if ((this.resultsId == null && other.resultsId != null) || (this.resultsId != null && !this.resultsId.equals(other.resultsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.StudentResults[ resultsId=" + resultsId + " ]";
    }
    
}
