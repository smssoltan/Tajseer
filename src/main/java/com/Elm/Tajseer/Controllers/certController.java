package com.Elm.Tajseer.Controllers;

import com.Elm.Tajseer.Models.Certification;
import com.Elm.Tajseer.Services.certService_Implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RestController
public class certController {

    @Autowired
    private certService_Implementation certService_impl;

    @PostMapping("/certification")
    public Certification addCert(@RequestBody Certification cert) { //request body = object
        return certService_impl.addCert(cert);
    }

    @GetMapping("/certification")
    public List<Certification> getAllUsers(){

        return certService_impl.getAllCert();
    }
    @GetMapping("/certification/{id}")
    public Certification getCert(@PathVariable("id") int id){

        return certService_impl.getCert(id);
    }

    @DeleteMapping("/certification/{id}")
    public void deleteCert(@PathVariable("id") int id){
        certService_impl.deleteCert(id);
    }

    @PutMapping("/certification/{id}")
    public Certification updateCert(@RequestBody Certification cert, @PathVariable("id") int id){
        return  certService_impl.updateCert(cert,id);
    }

    @PostMapping("/UploadCertificate")
    public Certification uploadCertificate(@RequestParam("file") MultipartFile file) {
        return certService_impl.uploadCertificate(file);
    }

}
