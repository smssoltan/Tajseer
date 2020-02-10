package com.Elm.Tajseer.Model;

import javax.persistence.*;

@Entity //User Entity
@Table(name = "User1")
public class User1 {

    @Id         //Prime key column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Name")
    private String name;

//    @ManyToOne
//    @JoinColumn(name = "user")    //Will join Class table content in a new table.


    public User1(){}

    public User1(int id, String name) {
        this.id = id;
        this.name=name;
//
        //this.user= user;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }


}
