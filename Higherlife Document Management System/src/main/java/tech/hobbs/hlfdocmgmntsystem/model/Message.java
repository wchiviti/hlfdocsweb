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
import javax.persistence.Id;
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
@Table(name = "messages")
@NamedQueries({
    @NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m")
    , @NamedQuery(name = "Message.findByMessageId", query = "SELECT m FROM Message m WHERE m.messageId = :messageId")
    , @NamedQuery(name = "Message.findByRecipientFileno", query = "SELECT m FROM Message m WHERE m.recipientFileno = :recipientFileno")
    , @NamedQuery(name = "Message.findBySenderFileno", query = "SELECT m FROM Message m WHERE m.senderFileno = :senderFileno")
    , @NamedQuery(name = "Message.findByMessageSubject", query = "SELECT m FROM Message m WHERE m.messageSubject = :messageSubject")
    , @NamedQuery(name = "Message.findByMessageText", query = "SELECT m FROM Message m WHERE m.messageText = :messageText")
    , @NamedQuery(name = "Message.findByReadStatus", query = "SELECT m FROM Message m WHERE m.readStatus = :readStatus")
    , @NamedQuery(name = "Message.findByTrashed", query = "SELECT m FROM Message m WHERE m.trashed = :trashed")})
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "message_id")
    private Integer messageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "recipient_fileno")
    private String recipientFileno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "sender_fileno")
    private String senderFileno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "message_subject")
    private String messageSubject;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "message_text")
    private String messageText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "read_status")
    private boolean readStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trashed")
    private boolean trashed;

    public Message() {
    }

    public Message(Integer messageId) {
        this.messageId = messageId;
    }

    public Message(Integer messageId, String recipientFileno, String senderFileno, String messageSubject, String messageText, boolean readStatus, boolean trashed) {
        this.messageId = messageId;
        this.recipientFileno = recipientFileno;
        this.senderFileno = senderFileno;
        this.messageSubject = messageSubject;
        this.messageText = messageText;
        this.readStatus = readStatus;
        this.trashed = trashed;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getRecipientFileno() {
        return recipientFileno;
    }

    public void setRecipientFileno(String recipientFileno) {
        this.recipientFileno = recipientFileno;
    }

    public String getSenderFileno() {
        return senderFileno;
    }

    public void setSenderFileno(String senderFileno) {
        this.senderFileno = senderFileno;
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public boolean getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(boolean readStatus) {
        this.readStatus = readStatus;
    }

    public boolean getTrashed() {
        return trashed;
    }

    public void setTrashed(boolean trashed) {
        this.trashed = trashed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messageId != null ? messageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.messageId == null && other.messageId != null) || (this.messageId != null && !this.messageId.equals(other.messageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.Message[ messageId=" + messageId + " ]";
    }
    
}
