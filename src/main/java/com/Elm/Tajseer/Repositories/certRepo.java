package com.Elm.Tajseer.Repositories;

import com.Elm.Tajseer.Models.Certification;
import com.Elm.Tajseer.Models.User1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface certRepo extends JpaRepository<Certification,Integer> {
    List<Certification> findAll();
}
