package com.Elm.Tajseer.Models;

import javax.persistence.*;

@Entity //User Entity
@Table(name = "AUTHORITY")
public class Authority {

    @Id         //Prime key column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;         //Prim key

    @Column
    private int AuthID;         //Authority ID

    @Column
    private String Name;

    @Column
    private String Description;     //Description of what can be done.

    public Authority(){}        //empty Constructor.

    public Authority(int id, int authID, String name, String description) {
        this.id = id;
        this.AuthID = authID;
        this.Name = name;
        this.Description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthID() {
        return AuthID;
    }

    public void setAuthID(int authID) {
        AuthID = authID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
