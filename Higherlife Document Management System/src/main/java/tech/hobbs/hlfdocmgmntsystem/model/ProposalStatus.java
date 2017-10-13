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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Wilsonc
 */
@Entity
@Table(name = "proposal_statuses")
@NamedQueries({
    @NamedQuery(name = "ProposalStatuses.findAll", query = "SELECT p FROM ProposalStatuses p")
    , @NamedQuery(name = "ProposalStatuses.findByProposalStatusId", query = "SELECT p FROM ProposalStatuses p WHERE p.proposalStatusId = :proposalStatusId")})
public class ProposalStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "proposal_status_id")
    private Integer proposalStatusId;
    @Basic(optional = false)
    @Lob
    @Column(name = "proposal_status")
    private byte[] proposalStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proposalStatusId", fetch = FetchType.LAZY)
    private List<ActivityProposal> activityProposalsList;

    public ProposalStatus() {
    }

    public ProposalStatus(Integer proposalStatusId) {
        this.proposalStatusId = proposalStatusId;
    }

    public ProposalStatus(Integer proposalStatusId, byte[] proposalStatus) {
        this.proposalStatusId = proposalStatusId;
        this.proposalStatus = proposalStatus;
    }

    public Integer getProposalStatusId() {
        return proposalStatusId;
    }

    public void setProposalStatusId(Integer proposalStatusId) {
        this.proposalStatusId = proposalStatusId;
    }

    public byte[] getProposalStatus() {
        return proposalStatus;
    }

    public void setProposalStatus(byte[] proposalStatus) {
        this.proposalStatus = proposalStatus;
    }

    public List<ActivityProposal> getActivityProposalsList() {
        return activityProposalsList;
    }

    public void setActivityProposalsList(List<ActivityProposal> activityProposalsList) {
        this.activityProposalsList = activityProposalsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proposalStatusId != null ? proposalStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProposalStatus)) {
            return false;
        }
        ProposalStatus other = (ProposalStatus) object;
        if ((this.proposalStatusId == null && other.proposalStatusId != null) || (this.proposalStatusId != null && !this.proposalStatusId.equals(other.proposalStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.ProposalStatuses[ proposalStatusId=" + proposalStatusId + " ]";
    }
    
}
