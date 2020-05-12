package com.Elm.Tajseer.Services;
import com.Elm.Tajseer.Models.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;


@org.springframework.stereotype.Service
public class userService_Implementation implements userService
{

    @Autowired
    private com.Elm.Tajseer.Repositories.userRepo userRepo;

    @Bean
    private PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }

    @Override
    public User1 addUser(User1 aUser1) {

        aUser1.setPassword(passwordEncoder().encode(aUser1.getPassword()));
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
        aUser1.setUserID(id);
        return userRepo.save(aUser1);
    }
}
