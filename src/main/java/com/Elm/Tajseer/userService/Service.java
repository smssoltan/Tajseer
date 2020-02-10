package com.Elm.Tajseer.userService;

import com.Elm.Tajseer.Model.User1;

import java.util.List;

@org.springframework.stereotype.Service
public interface Service {


    public User1 addUser(User1 aUser1);
    public List<User1> getAllUsers();
    public void deleteUser(int id);
    public User1 getUser(int id);
    public User1 updateUser(User1 aUser1, int id);
}
