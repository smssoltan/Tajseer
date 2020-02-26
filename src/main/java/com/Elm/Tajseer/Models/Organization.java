package com.Elm.Tajseer.Models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity //Organization Entity
@Table(name = "ORGANIZATION")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orgID;

    @Column
    private String Name;

    @Column
    private String Address;

    @Column
    private String contactNum;         //contact number.


    @OneToMany(mappedBy = "orgCertification", cascade = CascadeType.ALL)
    private List<Certification> toBeCertificated = new ArrayList<>(); // a list to be certificated by the organization.


    @OneToMany(targetEntity = User1.class , mappedBy = "usersOrganization", cascade = CascadeType.ALL)
    private Set<User1> usersList;     // List of users that are asking for certification.

    public Organization(){}     //empty constructor.



    public Organization(int orgID, String name, String address, String contactNum) {  //initializing the class's properties.
        this.orgID = orgID;
        this.Name = name;
        this.Address = address;
        this.contactNum = contactNum;
    }

    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public List<Certification> getToBeCertificated() {
        return toBeCertificated;
    }

    public void setToBeCertificated(List<Certification> toBeCertificated) {
        this.toBeCertificated = toBeCertificated;
    }

    public Set<User1> getUsersList() {
        return usersList;
    }

    public void setUsersList(Set<User1> usersList) {
        this.usersList = usersList;
    }
}
