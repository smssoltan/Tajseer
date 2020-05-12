package com.Elm.Tajseer.Models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity //User Entity
@Table(name = "USER1")
public class User1 {        // couldn't name it just user because of errors that was caused

    @Id         //Prime key column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;         //Prim key for the table User1

    //    @NotNull(message = "First name , Last name is required")
    //@Size(min = 3, max = 20)
    @Column
    private String fullName;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private  String dob;        //date of birth

    @Column
    private  String pNum;      //phone number

    @Column
    //    @Email(message = "Enter a valid email address.")
//    @Pattern(regexp=".+@.+\\.[a-z]+")
//    @NotNull(message = "Email is required")
    private String email;

    @Column
    private String password;

    @Column
    private long natID;

    @Column(name = "Enabled")       // need to look up why we added this from Abdulmohsen's
    private boolean enabled = true;


    // List of added certifications by the user
    @OneToMany(targetEntity =Certification.class, mappedBy = "userCertificates", cascade = CascadeType.ALL)
    private List<Certification> certificationsList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orgID")
    private Organization usersOrganization;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "authName")
    private Authority authority;




    public User1(){}                //empty constructor.


    public User1(int userID, String fullName, String dob, String pNum, String email,
                 String password, long natID, boolean enabled) {
        this.userID = userID;
        this.fullName = fullName;
        this.dob = dob;
        this.pNum = pNum;
        this.email = email;
        this.password = password;
        this.natID = natID;
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

    public List<Certification> getCertificationsList() {
        return certificationsList;
    }

    public void setCertificationsList(List<Certification> certificationsList) {
        this.certificationsList = certificationsList;
    }

    public Organization getUsersOrganization() {
        return usersOrganization;
    }

    public void setUsersOrganization(Organization usersOrganization) {
        this.usersOrganization = usersOrganization;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
