package com.Elm.Tajseer.Repositories;

import com.Elm.Tajseer.Models.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRepo extends JpaRepository<User1,Integer> {
    List<User1> findAll();
}
