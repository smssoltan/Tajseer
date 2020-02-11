package com.Elm.Tajseer.Controllers;

import com.Elm.Tajseer.Models.Certification;
import com.Elm.Tajseer.Models.User1;
import com.Elm.Tajseer.Services.certService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class certController {

    @Autowired
    private certService cert_Service;

    @PostMapping("/certification")
    public Certification addCert(@RequestBody Certification cert) { //request body = object
        return cert_Service.addCert(cert);
    }

    @GetMapping("/certification")
    public List<Certification> getAllUsers(){

        return cert_Service.getAllCert();
    }
    @GetMapping("/certification/{id}")
    public Certification getCert(@PathVariable("id") int id){

        return cert_Service.getCert(id);
    }

    @DeleteMapping("/certification/{id}")
    public void deleteCert(@PathVariable("id") int id){
        cert_Service.deleteCert(id);
    }

    @PutMapping("/certification/{id}")
    public Certification updateCert(@RequestBody Certification cert, @PathVariable("id") int id){
        return  cert_Service.updateCert(cert,id);
    }

}
