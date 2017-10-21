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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "tertiary_levels")
@NamedQueries({
    @NamedQuery(name = "TertiaryLevel.findAll", query = "SELECT t FROM TertiaryLevel t")
    , @NamedQuery(name = "TertiaryLevel.findByLevelId", query = "SELECT t FROM TertiaryLevel t WHERE t.levelId = :levelId")
    , @NamedQuery(name = "TertiaryLevel.findByLevelName", query = "SELECT t FROM TertiaryLevel t WHERE t.levelName = :levelName")})
public class TertiaryLevel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "level_id")
    private Integer levelId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "level_name")
    private String levelName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "levelId", fetch = FetchType.LAZY)
    private List<ProgressReport> progressReportList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "levelId", fetch = FetchType.LAZY)
    private List<TertiaryStudent> tertiaryStudentList;

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

    public List<ProgressReport> getProgressReportList() {
        return progressReportList;
    }

    public void setProgressReportList(List<ProgressReport> progressReportList) {
        this.progressReportList = progressReportList;
    }

    public List<TertiaryStudent> getTertiaryStudentList() {
        return tertiaryStudentList;
    }

    public void setTertiaryStudentList(List<TertiaryStudent> tertiaryStudentList) {
        this.tertiaryStudentList = tertiaryStudentList;
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
        return "tech.hobbs.hlfdocmgmntsystem.model.TertiaryLevel[ levelId=" + levelId + " ]";
    }
    
}
