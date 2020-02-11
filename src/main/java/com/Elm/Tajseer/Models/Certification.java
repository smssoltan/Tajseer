package com.Elm.Tajseer.Models;

import javax.persistence.*;

@Entity //Organization Entity
@Table(name = "CERTIFICATION")
public class Certification {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column
    private String Name;        //title

    @Column
    private String Type;        //Experience or Educational degree.

    @Column
    private String Description;     // To be filled by the user.

    @Column
    private String Date;        // Date of certification. should be null till it got accepted.

    @Column
    private int uID;                 //User ID as foreign key

    @Column
    private String Status;          //Certification status, accepted, rejected, or pending.

    @Column
    private  String Document;           //Type [String] ?

    @Column
    private  int orgID;         //Organization ID

    public Certification(){}        //Empty constructor.

    public Certification(int ID, String name, String type, String description,
                         String date, int uID, String status,
                         String document, int orgID) {  //initializing the class's properties.
        this.ID = ID;
        this.Name = name;
        this.Type = type;
        this.Description = description;
        this.Date = date;
        this.uID = uID;
        this.Status = status;
        this.Document = document;
        this.orgID = orgID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String document) {
        Document = document;
    }

    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }
}
