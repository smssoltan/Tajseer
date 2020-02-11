package com.Elm.Tajseer.Models;
import javax.persistence.*;

@Entity //Organization Entity
@Table(name = "ORGANIZATION")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column
    private String Name;

    @Column
    private String Address;

    @Column
    private int contactNum;         //contact number.



    public Organization(){}     //empty constructor.



    public Organization(int ID, String name, String address, int contactNum) {  //initializing the class's properties.
        this.ID = ID;
        Name = name;
        Address = address;
        this.contactNum = contactNum;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getContactNum() {
        return contactNum;
    }

    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }
}
