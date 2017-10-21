/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model.activity;

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
@Table(name = "activity_initiation_types")
@NamedQueries({
    @NamedQuery(name = "ActivityInitiationType.findAll", query = "SELECT a FROM ActivityInitiationType a")
    , @NamedQuery(name = "ActivityInitiationType.findByInitiationId", query = "SELECT a FROM ActivityInitiationType a WHERE a.initiationId = :initiationId")
    , @NamedQuery(name = "ActivityInitiationType.findByInitiationType", query = "SELECT a FROM ActivityInitiationType a WHERE a.initiationType = :initiationType")})
public class ActivityInitiationType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "initiation_id")
    private Integer initiationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "initiation_type")
    private String initiationType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "initiationId", fetch = FetchType.LAZY)
    private List<ActivityDetail> activityDetailList;

    public ActivityInitiationType() {
    }

    public ActivityInitiationType(Integer initiationId) {
        this.initiationId = initiationId;
    }

    public ActivityInitiationType(Integer initiationId, String initiationType) {
        this.initiationId = initiationId;
        this.initiationType = initiationType;
    }

    public Integer getInitiationId() {
        return initiationId;
    }

    public void setInitiationId(Integer initiationId) {
        this.initiationId = initiationId;
    }

    public String getInitiationType() {
        return initiationType;
    }

    public void setInitiationType(String initiationType) {
        this.initiationType = initiationType;
    }

    public List<ActivityDetail> getActivityDetailList() {
        return activityDetailList;
    }

    public void setActivityDetailList(List<ActivityDetail> activityDetailList) {
        this.activityDetailList = activityDetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (initiationId != null ? initiationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivityInitiationType)) {
            return false;
        }
        ActivityInitiationType other = (ActivityInitiationType) object;
        if ((this.initiationId == null && other.initiationId != null) || (this.initiationId != null && !this.initiationId.equals(other.initiationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.ActivityInitiationType[ initiationId=" + initiationId + " ]";
    }
    
}
