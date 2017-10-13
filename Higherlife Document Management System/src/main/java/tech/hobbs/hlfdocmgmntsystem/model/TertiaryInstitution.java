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
@Table(name = "tertiary_institutions")
@NamedQueries({
    @NamedQuery(name = "TertiaryInstitutions.findAll", query = "SELECT t FROM TertiaryInstitutions t")
    , @NamedQuery(name = "TertiaryInstitutions.findByTertiaryCode", query = "SELECT t FROM TertiaryInstitutions t WHERE t.tertiaryCode = :tertiaryCode")
    , @NamedQuery(name = "TertiaryInstitutions.findByTertiaryName", query = "SELECT t FROM TertiaryInstitutions t WHERE t.tertiaryName = :tertiaryName")})
public class TertiaryInstitution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "tertiary_code")
    private String tertiaryCode;
    @Basic(optional = false)
    @Column(name = "tertiary_name")
    private String tertiaryName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tertiaryCode", fetch = FetchType.LAZY)
    private List<ActivityImage> activityImagesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tertiaryCode", fetch = FetchType.LAZY)
    private List<ActivityVideo> activityVideosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tertiaryCode", fetch = FetchType.LAZY)
    private List<TertiaryStudent> tertiaryStudentsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tertiaryCode", fetch = FetchType.LAZY)
    private List<Activity> activitiesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tertiaryCode", fetch = FetchType.LAZY)
    private List<ActivityReport> activityReportsList;

    public TertiaryInstitution() {
    }

    public TertiaryInstitution(String tertiaryCode) {
        this.tertiaryCode = tertiaryCode;
    }

    public TertiaryInstitution(String tertiaryCode, String tertiaryName) {
        this.tertiaryCode = tertiaryCode;
        this.tertiaryName = tertiaryName;
    }

    public String getTertiaryCode() {
        return tertiaryCode;
    }

    public void setTertiaryCode(String tertiaryCode) {
        this.tertiaryCode = tertiaryCode;
    }

    public String getTertiaryName() {
        return tertiaryName;
    }

    public void setTertiaryName(String tertiaryName) {
        this.tertiaryName = tertiaryName;
    }

    public List<ActivityImage> getActivityImagesList() {
        return activityImagesList;
    }

    public void setActivityImagesList(List<ActivityImage> activityImagesList) {
        this.activityImagesList = activityImagesList;
    }

    public List<ActivityVideo> getActivityVideosList() {
        return activityVideosList;
    }

    public void setActivityVideosList(List<ActivityVideo> activityVideosList) {
        this.activityVideosList = activityVideosList;
    }

    public List<TertiaryStudent> getTertiaryStudentsList() {
        return tertiaryStudentsList;
    }

    public void setTertiaryStudentsList(List<TertiaryStudent> tertiaryStudentsList) {
        this.tertiaryStudentsList = tertiaryStudentsList;
    }

    public List<Activity> getActivitiesList() {
        return activitiesList;
    }

    public void setActivitiesList(List<Activity> activitiesList) {
        this.activitiesList = activitiesList;
    }

    public List<ActivityReport> getActivityReportsList() {
        return activityReportsList;
    }

    public void setActivityReportsList(List<ActivityReport> activityReportsList) {
        this.activityReportsList = activityReportsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tertiaryCode != null ? tertiaryCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TertiaryInstitution)) {
            return false;
        }
        TertiaryInstitution other = (TertiaryInstitution) object;
        if ((this.tertiaryCode == null && other.tertiaryCode != null) || (this.tertiaryCode != null && !this.tertiaryCode.equals(other.tertiaryCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.TertiaryInstitutions[ tertiaryCode=" + tertiaryCode + " ]";
    }
    
}
