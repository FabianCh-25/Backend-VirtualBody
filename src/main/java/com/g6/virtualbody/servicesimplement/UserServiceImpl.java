package com.g6.virtualbody.servicesimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g6.virtualbody.entities.Users;
import com.g6.virtualbody.repositories.UserRepository;
import com.g6.virtualbody.services.IUserService;



@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository uR;

    @Override
    public Integer insert(Users user) {
        int rpta = uR.buscarUsername(user.getUsername());
        if (rpta == 0) {
            uR.save(user);
        }
        return rpta;
    }

    @Override
    public List<Users> list() {
        // TODO Auto-generated method stub
        return uR.findAll();
    }

    @Override
    public Users last() {
        return uR.findFirstByOrderByIdDesc();
    }
}
