/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model.documents;

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
import javax.validation.constraints.NotNull;

import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "activity_proposals")
@NamedQueries({
    @NamedQuery(name = "ActivityProposal.findAll", query = "SELECT a FROM ActivityProposal a")
    , @NamedQuery(name = "ActivityProposal.findByProposalId", query = "SELECT a FROM ActivityProposal a WHERE a.proposalId = :proposalId")})
public class ActivityProposal implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "proposal_id")
    private Integer proposalId;
    
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "proposalfile")
    private byte[] proposalfile;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "proposal_description")
    private String proposalDescription;
    
    @JoinColumn(name = "proposal_status_id", referencedColumnName = "proposal_status_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ProposalStatus proposalStatusId;
    
    @JoinColumn(name = "fileno", referencedColumnName = "fileno", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Student student;
    
    @Column(name = "fileno")
    private String fileno;

    public ActivityProposal() {
    }

    public ActivityProposal(Integer proposalId) {
        this.proposalId = proposalId;
    }

    public ActivityProposal(Integer proposalId, byte[] proposalfile) {
        this.proposalId = proposalId;
        this.proposalfile = proposalfile;
    }

    public String getProposalDescription() {
		return proposalDescription;
	}

	public void setProposalDescription(String proposalDescription) {
		this.proposalDescription = proposalDescription;
	}

	public Integer getProposalId() {
        return proposalId;
    }

    public void setProposalId(Integer proposalId) {
        this.proposalId = proposalId;
    }

    public byte[] getProposalfile() {
        return proposalfile;
    }

    public void setProposalfile(byte[] proposalfile) {
        this.proposalfile = proposalfile;
    }

    public ProposalStatus getProposalStatusId() {
        return proposalStatusId;
    }

    public void setProposalStatusId(ProposalStatus proposalStatusId) {
        this.proposalStatusId = proposalStatusId;
    }

    public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getFileno() {
		return fileno;
	}

	public void setFileno(String fileno) {
		this.fileno = fileno;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (proposalId != null ? proposalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivityProposal)) {
            return false;
        }
        ActivityProposal other = (ActivityProposal) object;
        if ((this.proposalId == null && other.proposalId != null) || (this.proposalId != null && !this.proposalId.equals(other.proposalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.ActivityProposal[ proposalId=" + proposalId + " ]";
    }
    
}
