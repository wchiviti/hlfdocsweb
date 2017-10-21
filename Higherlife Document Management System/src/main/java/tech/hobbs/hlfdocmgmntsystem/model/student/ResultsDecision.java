/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model.student;

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
@Table(name = "results_decisions")
@NamedQueries({
    @NamedQuery(name = "ResultsDecision.findAll", query = "SELECT r FROM ResultsDecision r")
    , @NamedQuery(name = "ResultsDecision.findByDecisionId", query = "SELECT r FROM ResultsDecision r WHERE r.decisionId = :decisionId")
    , @NamedQuery(name = "ResultsDecision.findByResultsDecision", query = "SELECT r FROM ResultsDecision r WHERE r.resultsDecision = :resultsDecision")})
public class ResultsDecision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "decision_id")
    private Integer decisionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "results_decision")
    private String resultsDecision;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "decisionId", fetch = FetchType.LAZY)
    private List<StudentResult> studentResultList;

    public ResultsDecision() {
    }

    public ResultsDecision(Integer decisionId) {
        this.decisionId = decisionId;
    }

    public ResultsDecision(Integer decisionId, String resultsDecision) {
        this.decisionId = decisionId;
        this.resultsDecision = resultsDecision;
    }

    public Integer getDecisionId() {
        return decisionId;
    }

    public void setDecisionId(Integer decisionId) {
        this.decisionId = decisionId;
    }

    public String getResultsDecision() {
        return resultsDecision;
    }

    public void setResultsDecision(String resultsDecision) {
        this.resultsDecision = resultsDecision;
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
        hash += (decisionId != null ? decisionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultsDecision)) {
            return false;
        }
        ResultsDecision other = (ResultsDecision) object;
        if ((this.decisionId == null && other.decisionId != null) || (this.decisionId != null && !this.decisionId.equals(other.decisionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.ResultsDecision[ decisionId=" + decisionId + " ]";
    }
    
}
