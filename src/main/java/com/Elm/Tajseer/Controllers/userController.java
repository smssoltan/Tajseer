package com.Elm.Tajseer.Controllers;

import com.Elm.Tajseer.Models.User1;
import com.Elm.Tajseer.Services.userService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
      //create 2 paths.
public class userController {

    @Autowired
    private userService Serv_imp;

    @PostMapping("/users")
    public User1 addUser(@RequestBody User1 aUser1) { //request body = object
        return Serv_imp.addUser(aUser1);
    }
    @GetMapping("/users")
    public  List<User1> getAllUsers(){

        return Serv_imp.getAllUsers();
    }
    @GetMapping("/users/{id}")
    public User1 getUser(@PathVariable("id") int id){

        return Serv_imp.getUser(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") int id){
        Serv_imp.deleteUser(id);
    }

    @PutMapping("/users/{id}")
    public User1 updateUser(@RequestBody User1 aUser1, @PathVariable("id") int id){
        return  Serv_imp.updateUser(aUser1,id);
    }


}
