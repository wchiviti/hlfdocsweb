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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "progress_reports")
@NamedQueries({
    @NamedQuery(name = "ProgressReport.findAll", query = "SELECT p FROM ProgressReport p")
    , @NamedQuery(name = "ProgressReport.findByReportId", query = "SELECT p FROM ProgressReport p WHERE p.reportId = :reportId")
    , @NamedQuery(name = "ProgressReport.findByYear", query = "SELECT p FROM ProgressReport p WHERE p.year = :year")})
public class ProgressReport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "report_id")
    private Integer reportId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "progress_report")
    private byte[] progressReport;
    @Basic(optional = false)
    @NotNull
    @Column(name = "year")
    private int year;
    @JoinColumn(name = "fileno", referencedColumnName = "fileno")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Student fileno;
    @JoinColumn(name = "level_id", referencedColumnName = "level_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TertiaryLevel levelId;

    public ProgressReport() {
    }

    public ProgressReport(Integer reportId) {
        this.reportId = reportId;
    }

    public ProgressReport(Integer reportId, byte[] progressReport, int year) {
        this.reportId = reportId;
        this.progressReport = progressReport;
        this.year = year;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public byte[] getProgressReport() {
        return progressReport;
    }

    public void setProgressReport(byte[] progressReport) {
        this.progressReport = progressReport;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student getFileno() {
        return fileno;
    }

    public void setFileno(Student fileno) {
        this.fileno = fileno;
    }

    public TertiaryLevel getLevelId() {
        return levelId;
    }

    public void setLevelId(TertiaryLevel levelId) {
        this.levelId = levelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reportId != null ? reportId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgressReport)) {
            return false;
        }
        ProgressReport other = (ProgressReport) object;
        if ((this.reportId == null && other.reportId != null) || (this.reportId != null && !this.reportId.equals(other.reportId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.ProgressReport[ reportId=" + reportId + " ]";
    }
    
}
