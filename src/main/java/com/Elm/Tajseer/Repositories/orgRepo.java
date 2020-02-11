package com.Elm.Tajseer.Repositories;

import com.Elm.Tajseer.Models.Organization;
import com.Elm.Tajseer.Models.User1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface orgRepo extends JpaRepository<Organization,Integer> {
    List<Organization> findAll();
}
