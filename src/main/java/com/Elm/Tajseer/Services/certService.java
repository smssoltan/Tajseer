package com.Elm.Tajseer.Services;

import com.Elm.Tajseer.Models.Certification;
import com.Elm.Tajseer.Models.User1;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface certService {

    public Certification addCert(Certification cert);
    public List<Certification> getAllCert();
    public void deleteCert(int id);
    public Certification getCert(int id);
    public Certification updateCert(Certification cert, int id);
    public Certification uploadCertificate(MultipartFile file);

}
