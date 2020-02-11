package com.Elm.Tajseer.Services;

import com.Elm.Tajseer.Models.Certification;
import com.Elm.Tajseer.Models.Organization;
import com.Elm.Tajseer.Repositories.certRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class orgService_Implementation implements orgService {

    @Autowired
    private com.Elm.Tajseer.Repositories.orgRepo orgRepo;

    @Override
    public Organization addOrg(Organization org) {
        return orgRepo.save(org);
    }

    @Override
    public List<Organization> getAllOrg() {
        return orgRepo.findAll();
    }

    @Override
    public void deleteOrg(int id) {
        orgRepo.deleteById(id);
    }

    @Override
    public Organization getOrg(int id) {
        return orgRepo.findById(id).get();
    }

    @Override
    public Organization updateOrg(Organization org, int id) {
        org.setID(id);
        return orgRepo.save(org);
    }
}
