/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wilsonc
 */
@Entity
@Table(name = "activities")
@NamedQueries({
    @NamedQuery(name = "Activities.findAll", query = "SELECT a FROM Activities a")
    , @NamedQuery(name = "Activities.findByActivityNo", query = "SELECT a FROM Activities a WHERE a.activityNo = :activityNo")
    , @NamedQuery(name = "Activities.findByActivityId", query = "SELECT a FROM Activities a WHERE a.activityId = :activityId")
    , @NamedQuery(name = "Activities.findByOrgarnizer", query = "SELECT a FROM Activities a WHERE a.orgarnizer = :orgarnizer")
    , @NamedQuery(name = "Activities.findByActivityName", query = "SELECT a FROM Activities a WHERE a.activityName = :activityName")
    , @NamedQuery(name = "Activities.findByDateOfActivity", query = "SELECT a FROM Activities a WHERE a.dateOfActivity = :dateOfActivity")})
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "activity_no")
    private int activityNo;
    @Id
    @Basic(optional = false)
    @Column(name = "activity_id")
    private String activityId;
    @Basic(optional = false)
    @Column(name = "orgarnizer")
    private String orgarnizer;
    @Basic(optional = false)
    @Column(name = "activity_name")
    private String activityName;
    @Basic(optional = false)
    @Column(name = "date_of_activity")
    @Temporal(TemporalType.DATE)
    private Date dateOfActivity;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "activityId", fetch = FetchType.LAZY)
    private List<ActivityDetails> activityDetailsList;
    @JoinColumn(name = "tertiary_code", referencedColumnName = "tertiary_code")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TertiaryInstitution tertiaryCode;

    public Activity() {
    }

    public Activity(String activityId) {
        this.activityId = activityId;
    }

    public Activity(String activityId, int activityNo, String orgarnizer, String activityName, Date dateOfActivity) {
        this.activityId = activityId;
        this.activityNo = activityNo;
        this.orgarnizer = orgarnizer;
        this.activityName = activityName;
        this.dateOfActivity = dateOfActivity;
    }

    public int getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(int activityNo) {
        this.activityNo = activityNo;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getOrgarnizer() {
        return orgarnizer;
    }

    public void setOrgarnizer(String orgarnizer) {
        this.orgarnizer = orgarnizer;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Date getDateOfActivity() {
        return dateOfActivity;
    }

    public void setDateOfActivity(Date dateOfActivity) {
        this.dateOfActivity = dateOfActivity;
    }

    public List<ActivityDetails> getActivityDetailsList() {
        return activityDetailsList;
    }

    public void setActivityDetailsList(List<ActivityDetails> activityDetailsList) {
        this.activityDetailsList = activityDetailsList;
    }

    public TertiaryInstitution getTertiaryCode() {
        return tertiaryCode;
    }

    public void setTertiaryCode(TertiaryInstitution tertiaryCode) {
        this.tertiaryCode = tertiaryCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activityId != null ? activityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activity)) {
            return false;
        }
        Activity other = (Activity) object;
        if ((this.activityId == null && other.activityId != null) || (this.activityId != null && !this.activityId.equals(other.activityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.Activities[ activityId=" + activityId + " ]";
    }
    
}
