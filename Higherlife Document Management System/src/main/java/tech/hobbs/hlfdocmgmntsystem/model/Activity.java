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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "activities")
@NamedQueries({
    @NamedQuery(name = "Activity.findAll", query = "SELECT a FROM Activity a")
    , @NamedQuery(name = "Activity.findByActivityNo", query = "SELECT a FROM Activity a WHERE a.activityNo = :activityNo")
    , @NamedQuery(name = "Activity.findByActivityId", query = "SELECT a FROM Activity a WHERE a.activityId = :activityId")
    , @NamedQuery(name = "Activity.findByOrgarnizer", query = "SELECT a FROM Activity a WHERE a.orgarnizer = :orgarnizer")
    , @NamedQuery(name = "Activity.findByActivityName", query = "SELECT a FROM Activity a WHERE a.activityName = :activityName")
    , @NamedQuery(name = "Activity.findByDateOfActivity", query = "SELECT a FROM Activity a WHERE a.dateOfActivity = :dateOfActivity")})
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activity_no")
    private int activityNo;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "activity_id")
    private String activityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "orgarnizer")
    private String orgarnizer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "activity_name")
    private String activityName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_of_activity")
    @Temporal(TemporalType.DATE)
    private Date dateOfActivity;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "activityId", fetch = FetchType.LAZY)
    private List<ActivityDetail> activityDetailList;
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

    public List<ActivityDetail> getActivityDetailList() {
        return activityDetailList;
    }

    public void setActivityDetailList(List<ActivityDetail> activityDetailList) {
        this.activityDetailList = activityDetailList;
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
        return "tech.hobbs.hlfdocmgmntsystem.model.Activity[ activityId=" + activityId + " ]";
    }
    
}
