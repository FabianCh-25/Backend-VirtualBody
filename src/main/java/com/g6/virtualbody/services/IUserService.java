package com.g6.virtualbody.services;


import java.util.List;

import com.g6.virtualbody.entities.Users;


public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();
    Users last();

}
