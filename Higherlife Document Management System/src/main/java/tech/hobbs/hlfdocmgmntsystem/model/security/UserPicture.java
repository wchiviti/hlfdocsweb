/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model.security;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "user_pictures")
@NamedQueries({
    @NamedQuery(name = "UserPicture.findAll", query = "SELECT u FROM UserPicture u")
    , @NamedQuery(name = "UserPicture.findByPictureId", query = "SELECT u FROM UserPicture u WHERE u.pictureId = :pictureId")
    , @NamedQuery(name = "UserPicture.findByFileno", query = "SELECT u FROM UserPicture u WHERE u.fileno = :fileno")})
public class UserPicture implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "picture_id")
    private Integer pictureId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "fileno")
    private String fileno;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "user_picture")
    private byte[] userPicture;

    public UserPicture() {
    }

    public UserPicture(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public UserPicture(Integer pictureId, String fileno, byte[] userPicture) {
        this.pictureId = pictureId;
        this.fileno = fileno;
        this.userPicture = userPicture;
    }

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public String getFileno() {
        return fileno;
    }

    public void setFileno(String fileno) {
        this.fileno = fileno;
    }

    public byte[] getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(byte[] userPicture) {
        this.userPicture = userPicture;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pictureId != null ? pictureId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserPicture)) {
            return false;
        }
        UserPicture other = (UserPicture) object;
        if ((this.pictureId == null && other.pictureId != null) || (this.pictureId != null && !this.pictureId.equals(other.pictureId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.UserPicture[ pictureId=" + pictureId + " ]";
    }
    
}
