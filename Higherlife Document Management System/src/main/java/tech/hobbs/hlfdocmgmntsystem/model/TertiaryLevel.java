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
@Table(name = "tertiary_levels")
@NamedQueries({
    @NamedQuery(name = "TertiaryLevels.findAll", query = "SELECT t FROM TertiaryLevels t")
    , @NamedQuery(name = "TertiaryLevels.findByLevelId", query = "SELECT t FROM TertiaryLevels t WHERE t.levelId = :levelId")
    , @NamedQuery(name = "TertiaryLevels.findByLevelName", query = "SELECT t FROM TertiaryLevels t WHERE t.levelName = :levelName")})
public class TertiaryLevel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "level_id")
    private Integer levelId;
    @Basic(optional = false)
    @Column(name = "level_name")
    private String levelName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "levelId", fetch = FetchType.LAZY)
    private List<ProgressReport> progressReportsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "levelId", fetch = FetchType.LAZY)
    private List<TertiaryStudent> tertiaryStudentsList;

    public TertiaryLevel() {
    }

    public TertiaryLevel(Integer levelId) {
        this.levelId = levelId;
    }

    public TertiaryLevel(Integer levelId, String levelName) {
        this.levelId = levelId;
        this.levelName = levelName;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public List<ProgressReport> getProgressReportsList() {
        return progressReportsList;
    }

    public void setProgressReportsList(List<ProgressReport> progressReportsList) {
        this.progressReportsList = progressReportsList;
    }

    public List<TertiaryStudent> getTertiaryStudentsList() {
        return tertiaryStudentsList;
    }

    public void setTertiaryStudentsList(List<TertiaryStudent> tertiaryStudentsList) {
        this.tertiaryStudentsList = tertiaryStudentsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (levelId != null ? levelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TertiaryLevel)) {
            return false;
        }
        TertiaryLevel other = (TertiaryLevel) object;
        if ((this.levelId == null && other.levelId != null) || (this.levelId != null && !this.levelId.equals(other.levelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.TertiaryLevels[ levelId=" + levelId + " ]";
    }
    
}
