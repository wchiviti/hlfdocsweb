/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model.documents;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryInstitution;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "activity_reports")
@NamedQueries({
    @NamedQuery(name = "ActivityReport.findAll", query = "SELECT a FROM ActivityReport a")
    , @NamedQuery(name = "ActivityReport.findByReportId", query = "SELECT a FROM ActivityReport a WHERE a.reportId = :reportId")
    , @NamedQuery(name = "ActivityReport.findByReportNo", query = "SELECT a FROM ActivityReport a WHERE a.reportNo = :reportNo")
    , @NamedQuery(name = "ActivityReport.findByActivityName", query = "SELECT a FROM ActivityReport a WHERE a.activityName = :activityName")
    , @NamedQuery(name = "ActivityReport.findByDateOfActivity", query = "SELECT a FROM ActivityReport a WHERE a.dateOfActivity = :dateOfActivity")
    , @NamedQuery(name = "ActivityReport.findByOrganizer", query = "SELECT a FROM ActivityReport a WHERE a.organizer = :organizer")})
public class ActivityReport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "report_id")
    private Integer reportId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "report_no")
    private String reportNo;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "organizer")
    private String organizer;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "reportdoc")
    private byte[] reportdoc;
    @JoinColumn(name = "fileno", referencedColumnName = "fileno")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Student fileno;
    @JoinColumn(name = "tertiary_code", referencedColumnName = "tertiary_code")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TertiaryInstitution tertiaryCode;

    public ActivityReport() {
    }

    public ActivityReport(Integer reportId) {
        this.reportId = reportId;
    }

    public ActivityReport(Integer reportId, String reportNo, String activityName, Date dateOfActivity, String organizer, byte[] reportdoc) {
        this.reportId = reportId;
        this.reportNo = reportNo;
        this.activityName = activityName;
        this.dateOfActivity = dateOfActivity;
        this.organizer = organizer;
        this.reportdoc = reportdoc;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo;
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

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public byte[] getReportdoc() {
        return reportdoc;
    }

    public void setReportdoc(byte[] reportdoc) {
        this.reportdoc = reportdoc;
    }

    public Student getFileno() {
        return fileno;
    }

    public void setFileno(Student fileno) {
        this.fileno = fileno;
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
        hash += (reportId != null ? reportId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivityReport)) {
            return false;
        }
        ActivityReport other = (ActivityReport) object;
        if ((this.reportId == null && other.reportId != null) || (this.reportId != null && !this.reportId.equals(other.reportId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.ActivityReport[ reportId=" + reportId + " ]";
    }
    
}
