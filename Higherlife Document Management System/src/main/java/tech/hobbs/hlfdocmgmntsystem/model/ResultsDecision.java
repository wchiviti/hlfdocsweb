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
@Table(name = "results_decisions")
@NamedQueries({
    @NamedQuery(name = "ResultsDecisions.findAll", query = "SELECT r FROM ResultsDecisions r")
    , @NamedQuery(name = "ResultsDecisions.findByDecisionId", query = "SELECT r FROM ResultsDecisions r WHERE r.decisionId = :decisionId")
    , @NamedQuery(name = "ResultsDecisions.findByResultsDecision", query = "SELECT r FROM ResultsDecisions r WHERE r.resultsDecision = :resultsDecision")})
public class ResultsDecision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "decision_id")
    private Integer decisionId;
    @Basic(optional = false)
    @Column(name = "results_decision")
    private String resultsDecision;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "decisionId", fetch = FetchType.LAZY)
    private List<StudentResults> studentResultsList;

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

    public List<StudentResults> getStudentResultsList() {
        return studentResultsList;
    }

    public void setStudentResultsList(List<StudentResults> studentResultsList) {
        this.studentResultsList = studentResultsList;
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
        return "tech.hobbs.hlfdocmgmntsystem.model.ResultsDecisions[ decisionId=" + decisionId + " ]";
    }
    
}
