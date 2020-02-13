//package com.Elm.Tajseer.Models;
//
//import javax.persistence.*;
//
//@Entity(name = "Shared")
//@Table
//public class Shared {
//
//    @Id
//    @Column() private int sharedID;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "UserID")
//    private User1 userShareds;
//    @Column() private int cID;
//    @Column() private String sharedData;
//    @Column() private String url;
//
//    public Shared(){}
//
//    public Shared(int sharedID, User1 userShareds, int cID, String sharedData, String url) {
//        this.sharedID = sharedID;
//        this.userShareds = userShareds;
//        this.cID = cID;
//        this.sharedData = sharedData;
//        this.url = url;
//    }
//}
