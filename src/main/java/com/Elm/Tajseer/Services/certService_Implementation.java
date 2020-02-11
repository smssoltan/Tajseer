package com.Elm.Tajseer.Services;

import com.Elm.Tajseer.Models.Certification;
import com.Elm.Tajseer.Models.User1;
import com.Elm.Tajseer.Repositories.certRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class certService_Implementation implements  certService {

    @Autowired
    private certRepo certRepo;

    @Override
    public Certification addCert(Certification cert) {
        return certRepo.save(cert);
    }

    @Override
    public List<Certification> getAllCert() {
        return certRepo.findAll();
    }

    @Override
    public void deleteCert(int id) {
        certRepo.deleteById(id);
    }

    @Override
    public Certification getCert(int id) {
        return certRepo.findById(id).get();
    }

    @Override
    public Certification updateCert(Certification cert, int id) {
        cert.setID(id);
        return certRepo.save(cert);
    }
}
