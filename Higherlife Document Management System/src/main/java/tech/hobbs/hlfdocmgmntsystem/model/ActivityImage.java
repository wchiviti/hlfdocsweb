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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "activity_images")
@NamedQueries({
    @NamedQuery(name = "ActivityImage.findAll", query = "SELECT a FROM ActivityImage a")
    , @NamedQuery(name = "ActivityImage.findByImageId", query = "SELECT a FROM ActivityImage a WHERE a.imageId = :imageId")
    , @NamedQuery(name = "ActivityImage.findByActivityName", query = "SELECT a FROM ActivityImage a WHERE a.activityName = :activityName")
    , @NamedQuery(name = "ActivityImage.findByDateOfActivity", query = "SELECT a FROM ActivityImage a WHERE a.dateOfActivity = :dateOfActivity")})
public class ActivityImage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "image_id")
    private Integer imageId;
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
    @Lob
    @Column(name = "image")
    private byte[] image;
    @JoinColumn(name = "fileno", referencedColumnName = "fileno")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Student fileno;
    @JoinColumn(name = "tertiary_code", referencedColumnName = "tertiary_code")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TertiaryInstitution tertiaryCode;

    public ActivityImage() {
    }

    public ActivityImage(Integer imageId) {
        this.imageId = imageId;
    }

    public ActivityImage(Integer imageId, String activityName, Date dateOfActivity, byte[] image) {
        this.imageId = imageId;
        this.activityName = activityName;
        this.dateOfActivity = dateOfActivity;
        this.image = image;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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
        hash += (imageId != null ? imageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivityImage)) {
            return false;
        }
        ActivityImage other = (ActivityImage) object;
        if ((this.imageId == null && other.imageId != null) || (this.imageId != null && !this.imageId.equals(other.imageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.ActivityImage[ imageId=" + imageId + " ]";
    }
    
}
