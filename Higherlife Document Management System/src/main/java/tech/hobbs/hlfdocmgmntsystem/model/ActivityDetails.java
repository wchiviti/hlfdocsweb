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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Wilsonc
 */
@Entity
@Table(name = "activity_details")
@NamedQueries({
    @NamedQuery(name = "ActivityDetails.findAll", query = "SELECT a FROM ActivityDetails a")
    , @NamedQuery(name = "ActivityDetails.findByImpartedPeople", query = "SELECT a FROM ActivityDetails a WHERE a.impartedPeople = :impartedPeople")
    , @NamedQuery(name = "ActivityDetails.findByNo", query = "SELECT a FROM ActivityDetails a WHERE a.no = :no")
    , @NamedQuery(name = "ActivityDetails.findByLeadersAttendence", query = "SELECT a FROM ActivityDetails a WHERE a.leadersAttendence = :leadersAttendence")})
public class ActivityDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "imparted_people")
    private int impartedPeople;
    @Id
    @Basic(optional = false)
    @Column(name = "no")
    private Integer no;
    @Basic(optional = false)
    @Column(name = "leaders_attendence")
    private int leadersAttendence;
    @JoinColumn(name = "activity_id", referencedColumnName = "activity_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Activity activityId;
    @JoinColumn(name = "initiation_id", referencedColumnName = "initiation_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ActivityInitiationType initiationId;

    public ActivityDetails() {
    }

    public ActivityDetails(Integer no) {
        this.no = no;
    }

    public ActivityDetails(Integer no, int impartedPeople, int leadersAttendence) {
        this.no = no;
        this.impartedPeople = impartedPeople;
        this.leadersAttendence = leadersAttendence;
    }

    public int getImpartedPeople() {
        return impartedPeople;
    }

    public void setImpartedPeople(int impartedPeople) {
        this.impartedPeople = impartedPeople;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public int getLeadersAttendence() {
        return leadersAttendence;
    }

    public void setLeadersAttendence(int leadersAttendence) {
        this.leadersAttendence = leadersAttendence;
    }

    public Activity getActivityId() {
        return activityId;
    }

    public void setActivityId(Activity activityId) {
        this.activityId = activityId;
    }

    public ActivityInitiationType getInitiationId() {
        return initiationId;
    }

    public void setInitiationId(ActivityInitiationType initiationId) {
        this.initiationId = initiationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (no != null ? no.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivityDetails)) {
            return false;
        }
        ActivityDetails other = (ActivityDetails) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.ActivityDetails[ no=" + no + " ]";
    }
    
}
