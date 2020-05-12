package com.Elm.Tajseer.Controllers;

import com.Elm.Tajseer.Models.User1;
import com.Elm.Tajseer.Services.userService_Implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
      //create 2 paths.
public class userController {

    @Autowired
    private userService_Implementation userServ_imp;

    @PostMapping("/users/addUser")
    public User1 addUser(@RequestBody User1 aUser1) { //request body = object
        return userServ_imp.addUser(aUser1);
    }
    @GetMapping("/users")
    public  List<User1> getAllUsers(){

        return userServ_imp.getAllUsers();
    }
    @GetMapping("/users/{id}")
    public User1 getUser(@PathVariable("id") int id){

        return userServ_imp.getUser(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userServ_imp.deleteUser(id);
    }

    @PutMapping("/users/{id}")
    public User1 updateUser(@RequestBody User1 aUser1, @PathVariable("id") int id){
        return  userServ_imp.updateUser(aUser1,id);
    }


}
