/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model.parameters;

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

import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityImage;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityVideo;
import tech.hobbs.hlfdocmgmntsystem.model.documents.ActivityReport;
import tech.hobbs.hlfdocmgmntsystem.model.student.TertiaryStudent;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "tertiary_institutions")
@NamedQueries({
    @NamedQuery(name = "TertiaryInstitution.findAll", query = "SELECT t FROM TertiaryInstitution t")
    , @NamedQuery(name = "TertiaryInstitution.findByTertiaryCode", query = "SELECT t FROM TertiaryInstitution t WHERE t.tertiaryCode = :tertiaryCode")
    , @NamedQuery(name = "TertiaryInstitution.findByTertiaryName", query = "SELECT t FROM TertiaryInstitution t WHERE t.tertiaryName = :tertiaryName")})
public class TertiaryInstitution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tertiary_code")
    private String tertiaryCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "tertiary_name")
    private String tertiaryName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tertiaryCode", fetch = FetchType.LAZY)
    private List<ActivityImage> activityImageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tertiaryCode", fetch = FetchType.LAZY)
    private List<TertiaryStudent> tertiaryStudentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tertiaryCode", fetch = FetchType.LAZY)
    private List<ActivityVideo> activityVideoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tertiaryCode", fetch = FetchType.LAZY)
    private List<Activity> activityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tertiaryCode", fetch = FetchType.LAZY)
    private List<ActivityReport> activityReportList;

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

    public List<ActivityImage> getActivityImageList() {
        return activityImageList;
    }

    public void setActivityImageList(List<ActivityImage> activityImageList) {
        this.activityImageList = activityImageList;
    }

    public List<TertiaryStudent> getTertiaryStudentList() {
        return tertiaryStudentList;
    }

    public void setTertiaryStudentList(List<TertiaryStudent> tertiaryStudentList) {
        this.tertiaryStudentList = tertiaryStudentList;
    }

    public List<ActivityVideo> getActivityVideoList() {
        return activityVideoList;
    }

    public void setActivityVideoList(List<ActivityVideo> activityVideoList) {
        this.activityVideoList = activityVideoList;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    public List<ActivityReport> getActivityReportList() {
        return activityReportList;
    }

    public void setActivityReportList(List<ActivityReport> activityReportList) {
        this.activityReportList = activityReportList;
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
        return "tech.hobbs.hlfdocmgmntsystem.model.TertiaryInstitution[ tertiaryCode=" + tertiaryCode + " ]";
    }
    
}
