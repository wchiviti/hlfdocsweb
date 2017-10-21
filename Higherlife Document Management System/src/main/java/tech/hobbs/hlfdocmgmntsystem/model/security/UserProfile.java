package tech.hobbs.hlfdocmgmntsystem.model.security;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import tech.hobbs.hlfdocmgmntsystem.model.Student;

	
@Entity
@Table(name = "groups")
@NamedQueries({
    @NamedQuery(name = "UserProfile.findAll", query = "SELECT p FROM UserProfile p")
    , @NamedQuery(name = "UserProfile.findByGroupId", query = "SELECT p FROM UserProfile p WHERE p.groupId = :groupId")
    , @NamedQuery(name = "UserProfile.findByGroupName", query = "SELECT p FROM UserProfile p WHERE p.groupName = :groupName")})
public class UserProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_id")
    private Integer groupId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "group_name")
    private String groupName;
    
    @JoinTable(name = "user_groups", joinColumns = {
        @JoinColumn(name = "group_id", referencedColumnName = "group_id")}, inverseJoinColumns = {
        @JoinColumn(name = "fileno", referencedColumnName = "fileno")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Student> studentList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profileId", fetch = FetchType.LAZY)
    private List<User> userList;
    
    @Column(name="GROUP_NAME", length=15, unique=true, nullable=false)
	private String type = UserProfileType.USER.getUserProfileType();

    public UserProfile() {
    }

    public UserProfile(Integer groupId) {
        this.groupId = groupId;
    }

    public UserProfile(Integer groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "tech.hobbs.hlfdocmgmntsystem.model.Profile[ groupId=" + groupId + " ]";
    }
    
}
