package com.Elm.Tajseer.Models;

import javax.persistence.*;

@Entity //Certification  Entity
@Table(name = "CERTIFICATION")
public class Certification {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cerID;

    @Column
    private String Name;        //title

    @Column
    private String Type;        //Experience or Educational degree.

    @Column
    private String Description;     // To be filled by the user.

    @Column
    private String Date;        // Date of certification. should be null till it got accepted.

    @Column
    private String Status;          //Certification status, accepted, rejected, or pending.

    @Column
    private byte[] certificateDocument;           //Type [String] ?




    @ManyToOne(cascade = CascadeType.ALL)   //many to one relation with the user
    @JoinColumn(name = "UserID")
    private User1 userCertificates;         // a single user asks for one or more certifications to be certificated.

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orgID")
    private Organization orgCertification;      // the organization certification.

    public Certification(){}        //Empty constructor.

    public Certification(int cerID, String name, String type, String description,
                         String date, String status,
                         byte[] certificateDocument, User1 userCertificates, Organization orgCertification) {  //initializing the class's properties.
        this.cerID = cerID;
        this.Name = name;
        this.Type = type;
        this.Description = description;
        this.Date = date;
        this.Status = status;
        this.certificateDocument = certificateDocument;
        this.userCertificates=userCertificates;
        this.orgCertification=orgCertification;
    }

    //for uploadCertificate
    public Certification(String fileName, String contentType, byte[] bytes) {
    }


    public int getCerID() {
        return cerID;
    }

    public void setCerID(int cerID) {
        this.cerID = cerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public byte[] getDocument() {
        return certificateDocument;
    }

    public void setDocument(byte[] document) {
        certificateDocument = document;
    }


    public User1 getUserCertificationsList() {
        return userCertificates;
    }

    public void setUserCertificates(User1 userCertificates) {
        this.userCertificates = userCertificates;
    }

    public Organization getOrgCertification() {
        return orgCertification;
    }

    public void setOrgCertification(Organization orgCertification) {
        this.orgCertification = orgCertification;
    }
}
