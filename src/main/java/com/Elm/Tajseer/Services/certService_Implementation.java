package com.Elm.Tajseer.Services;

import com.Elm.Tajseer.Models.Certification;
import com.Elm.Tajseer.Models.User1;
import com.Elm.Tajseer.Repositories.certRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
        cert.setCerID(id);
        return certRepo.save(cert);
    }

    @Override
    public Certification uploadCertificate(MultipartFile file) {
        try {
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            Certification certification = new Certification(fileName, file.getContentType(), file.getBytes());
            return certRepo.save(certification);
        }
        catch(IOException e) {
            return null;
        }
    }
}
