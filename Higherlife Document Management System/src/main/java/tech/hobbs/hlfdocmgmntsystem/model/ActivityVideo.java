/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model;

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

/**
 *
 * @author Wilsonc
 */
@Entity
@Table(name = "activity_videos")
@NamedQueries({
    @NamedQuery(name = "ActivityVideos.findAll", query = "SELECT a FROM ActivityVideos a")
    , @NamedQuery(name = "ActivityVideos.findByVideoId", query = "SELECT a FROM ActivityVideos a WHERE a.videoId = :videoId")
    , @NamedQuery(name = "ActivityVideos.findByActivityName", query = "SELECT a FROM ActivityVideos a WHERE a.activityName = :activityName")
    , @NamedQuery(name = "ActivityVideos.findByDateOfActivity", query = "SELECT a FROM ActivityVideos a WHERE a.dateOfActivity = :dateOfActivity")})
public class ActivityVideo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "video_id")
    private Integer videoId;
    @Basic(optional = false)
    @Column(name = "activity_name")
    private String activityName;
    @Basic(optional = false)
    @Column(name = "date_of_activity")
    @Temporal(TemporalType.DATE)
    private Date dateOfActivity;
    @Basic(optional = false)
    @Lob
    @Column(name = "video")
    private byte[] video;
    @JoinColumn(name = "fileno", referencedColumnName = "fileno")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Student fileno;
    @JoinColumn(name = "tertiary_code", referencedColumnName = "tertiary_code")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TertiaryInstitution tertiaryCode;

    public ActivityVideo() {
    }

    public ActivityVideo(Integer videoId) {
        this.videoId = videoId;
    }

    public ActivityVideo(Integer videoId, String activityName, Date dateOfActivity, byte[] video) {
        this.videoId = videoId;
        this.activityName = activityName;
        this.dateOfActivity = dateOfActivity;
        this.video = video;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
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

    public byte[] getVideo() {
        return video;
    }

    public void setVideo(byte[] video) {
        this.video = video;
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
        hash += (videoId != null ? videoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivityVideo)) {
            return false;
        }
        ActivityVideo other = (ActivityVideo) object;
        if ((this.videoId == null && other.videoId != null) || (this.videoId != null && !this.videoId.equals(other.videoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.ActivityVideos[ videoId=" + videoId + " ]";
    }
    
}
