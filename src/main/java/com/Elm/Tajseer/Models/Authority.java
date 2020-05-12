package com.Elm.Tajseer.Models;

import javax.persistence.*;

@Entity //User Entity
@Table(name = "AUTHORITY")
public class Authority {

    @Id         //Prime key column
    private String authName;

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AuthID;         //Authority ID



//    @Column
//    private String Description;     //Description of what can be done.



    public Authority(){}        //empty Constructor.

    public Authority(int authID, String authName) {

        this.AuthID = authID;
        this.authName = authName;
//        this.Description = description;
    }


    public int getAuthID() {
        return AuthID;
    }

    public void setAuthID(int authID) {
        AuthID = authID;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

//    public String getDescription() {
//        return Description;
//    }
//
//    public void setDescription(String description) {
//        Description = description;
//    }


}
