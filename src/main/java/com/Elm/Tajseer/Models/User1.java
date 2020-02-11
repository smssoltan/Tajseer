package com.Elm.Tajseer.Models;

import javax.persistence.*;

@Entity //User Entity
@Table(name = "USER1")
public class User1 {        // couldn't name it just user because of errors that was caused

    @Id         //Prime key column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;         //Prim key for the table User1

    @Column(name = "Name")
    private String fullName;

    @Column
    private  String DoB;        //date of birth

    @Column
    private  int Pnum;      //phone number

    @Column
    private String Email;

    @Column
    private int Password;

    @Column
    private int NatID;      //National ID

    @Column
    private int AuthID;     //Authority ID

    @Column
    private  int orgID;         //Organization ID

//    @ManyToOne
//    @JoinColumn(name = "user")    //Will join Class table content in a new table.


    public User1(){}                //empty constructor.

    public User1(int id, String fullName, String DoB, int pnum, String email,
                 int password, int natID, int authID, int orgID) {             //initializing the class's properties.
        this.id = id;
        this.fullName=fullName;
        this.DoB=DoB;
        this.Pnum = pnum;
        this.Email = email;
        this.Password = password;
//
        //this.user= user;
        this.NatID = natID;
        this.AuthID = authID;
        this.orgID = orgID;
    }

    //setters & getters

    public String getFullName() { return fullName; }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }


    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    public int getPnum() {
        return Pnum;
    }

    public void setPnum(int pnum) {
        Pnum = pnum;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        this.Password = password;
    }

    public int getNatID() {
        return NatID;
    }

    public void setNatID(int natID) {
        NatID = natID;
    }

    public int getAuthID() {
        return AuthID;
    }

    public void setAuthID(int authID) {
        AuthID = authID;
    }

    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }
}
