package com.g6.virtualbody.servicesimplement;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g6.virtualbody.entities.Role;
import com.g6.virtualbody.repositories.RoleRepository;
import com.g6.virtualbody.services.IRoleService;



@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }
}
