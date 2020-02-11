package com.Elm.Tajseer.Repositories;

import com.Elm.Tajseer.Models.Authority;
import com.Elm.Tajseer.Models.User1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface authRepo extends JpaRepository<Authority,Integer> {
    List<Authority> findAll();
}
