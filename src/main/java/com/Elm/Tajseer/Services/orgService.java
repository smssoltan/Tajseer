package com.Elm.Tajseer.Services;

import com.Elm.Tajseer.Models.Organization;
import com.Elm.Tajseer.Models.User1;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface orgService {

    public Organization addOrg(Organization org);
    public List<Organization> getAllOrg();
    public void deleteOrg(int id);
    public Organization getOrg(int id);
    public Organization updateOrg(Organization org, int id);
}
