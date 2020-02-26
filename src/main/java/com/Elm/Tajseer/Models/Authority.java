package com.Elm.Tajseer.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity //User Entity
@Table(name = "AUTHORITY")
public class Authority {

    @Id         //Prime key column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AuthID;         //Authority ID

    @Column
    private String Name;

    @Column
    private String Description;     //Description of what can be done.

    @OneToMany(mappedBy = "usersAuthority", cascade = CascadeType.ALL)
    private List<User1> users = new ArrayList<>();

    public Authority(){}        //empty Constructor.

    public Authority(int authID, String name, String description) {

        this.AuthID = authID;
        this.Name = name;
        this.Description = description;
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

    public List<User1> getUsers() {
        return users;
    }

    public void setUsers(List<User1> users) {
        this.users = users;
    }
}
