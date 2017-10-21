/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.hobbs.hlfdocmgmntsystem.model.documents;

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
import javax.validation.constraints.Size;

import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

/**
 *
 * @author Wilson Chiviti
 */
@Entity
@Table(name = "quotations")
@NamedQueries({
    @NamedQuery(name = "Quotation.findAll", query = "SELECT q FROM Quotation q")
    , @NamedQuery(name = "Quotation.findByQuotationId", query = "SELECT q FROM Quotation q WHERE q.quotationId = :quotationId")
    , @NamedQuery(name = "Quotation.findByActivityName", query = "SELECT q FROM Quotation q WHERE q.activityName = :activityName")})
public class Quotation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "quotation_id")
    private Integer quotationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "activity_name")
    private String activityName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "quotation")
    private byte[] quotation;
    @JoinColumn(name = "fileo", referencedColumnName = "fileno")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Student fileo;

    public Quotation() {
    }

    public Quotation(Integer quotationId) {
        this.quotationId = quotationId;
    }

    public Quotation(Integer quotationId, String activityName, byte[] quotation) {
        this.quotationId = quotationId;
        this.activityName = activityName;
        this.quotation = quotation;
    }

    public Integer getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Integer quotationId) {
        this.quotationId = quotationId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public byte[] getQuotation() {
        return quotation;
    }

    public void setQuotation(byte[] quotation) {
        this.quotation = quotation;
    }

    public Student getFileo() {
        return fileo;
    }

    public void setFileo(Student fileo) {
        this.fileo = fileo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quotationId != null ? quotationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quotation)) {
            return false;
        }
        Quotation other = (Quotation) object;
        if ((this.quotationId == null && other.quotationId != null) || (this.quotationId != null && !this.quotationId.equals(other.quotationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.Quotation[ quotationId=" + quotationId + " ]";
    }
    
}
