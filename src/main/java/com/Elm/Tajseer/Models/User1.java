package com.Elm.Tajseer.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity //User Entity
@Table(name = "USER1")
public class User1 {        // couldn't name it just user because of errors that was caused

    @Id         //Prime key column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userID;         //Prim key for the table User1

    @Column
    private String fullName;

    @Column
    private  String dob;        //date of birth

    @Column
    private  String pNum;      //phone number

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private long natID;

    @Column(name = "Enabled")       // need to look up why we added this from Abdulmohsen's
    private boolean enabled = true;


    // List of added certifications by the user
    @OneToMany(targetEntity =Certification.class, mappedBy = "userCertificates", cascade = CascadeType.ALL)
    private Set<Certification> certificationsList;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orgID")
    private Organization usersOrganization;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "authority")
    private Authority usersAuthority;




    public User1(){}                //empty constructor.


    public User1(int userID, String fullName, String dob, String pNum, String email,
                 String password, long natID, Set<Certification> certificationsList,
                 Organization usersOrganization, Authority usersAuthority, boolean enabled) {
        this.userID = userID;
        this.fullName = fullName;
        this.dob = dob;
        this.pNum = pNum;
        this.email = email;
        this.password = password;
        this.natID = natID;
        this.certificationsList = certificationsList;
        this.usersOrganization = usersOrganization;
        this.usersAuthority = usersAuthority;
        this.enabled = enabled;
    }



    //setters & getters

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getpNum() {
        return pNum;
    }

    public void setpNum(String pNum) {
        this.pNum = pNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getNatID() {
        return natID;
    }

    public void setNatID(long natID) {
        this.natID = natID;
    }

    public Set<Certification> getCertificationsList() {
        return certificationsList;
    }

    public void setCertificationsList(Set<Certification> certificationsList) {
        this.certificationsList = certificationsList;
    }

    public Organization getUsersOrganization() {
        return usersOrganization;
    }

    public void setUsersOrganization(Organization usersOrganization) {
        this.usersOrganization = usersOrganization;
    }

    public Authority getUsersAuthority() {
        return usersAuthority;
    }

    public void setUsersAuthority(Authority usersAuthority) {
        this.usersAuthority = usersAuthority;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
