package com.Elm.Tajseer.userService;
import com.Elm.Tajseer.Model.User1;
import com.Elm.Tajseer.userRepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@org.springframework.stereotype.Service
public class Service_Implementation implements Service
{

    @Autowired
    private UserRepo userRepo;


    @Override
    public User1 addUser(User1 aUser1) {
        return userRepo.save(aUser1);
    }

    @Override
    public List<User1> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public User1 getUser(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public User1 updateUser(User1 aUser1, int id) {
        aUser1.setID(id);
        return userRepo.save(aUser1);
    }
}
