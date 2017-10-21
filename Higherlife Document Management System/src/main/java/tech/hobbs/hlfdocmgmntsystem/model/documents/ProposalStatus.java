/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model.documents;

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
import javax.validation.constraints.NotNull;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "proposal_statuses")
@NamedQueries({
    @NamedQuery(name = "ProposalStatus.findAll", query = "SELECT p FROM ProposalStatus p")
    , @NamedQuery(name = "ProposalStatus.findByProposalStatusId", query = "SELECT p FROM ProposalStatus p WHERE p.proposalStatusId = :proposalStatusId")})
public class ProposalStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "proposal_status_id")
    private Integer proposalStatusId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "proposal_status")
    private String proposalStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proposalStatusId", fetch = FetchType.LAZY)
    private List<ActivityProposal> activityProposalList;

    public ProposalStatus() {
    }

    public ProposalStatus(Integer proposalStatusId) {
        this.proposalStatusId = proposalStatusId;
    }

	public Integer getProposalStatusId() {
		return proposalStatusId;
	}

	public void setProposalStatusId(Integer proposalStatusId) {
		this.proposalStatusId = proposalStatusId;
	}

	public String getProposalStatus() {
		return proposalStatus;
	}

	public void setProposalStatus(String proposalStatus) {
		this.proposalStatus = proposalStatus;
	}

	public List<ActivityProposal> getActivityProposalList() {
		return activityProposalList;
	}

	public void setActivityProposalList(List<ActivityProposal> activityProposalList) {
		this.activityProposalList = activityProposalList;
	}

	public ProposalStatus(Integer proposalStatusId, String proposalStatus,
			List<ActivityProposal> activityProposalList) {
		super();
		this.proposalStatusId = proposalStatusId;
		this.proposalStatus = proposalStatus;
		this.activityProposalList = activityProposalList;
	}

    
    
}
