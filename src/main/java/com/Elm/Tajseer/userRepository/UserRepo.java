package com.Elm.Tajseer.userRepository;

import com.Elm.Tajseer.Model.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User1,Integer> {
    List<User1> findAll();
}
