package com.g6.virtualbody.services;



import com.g6.virtualbody.entities.Role;

import java.util.List;



public interface IRoleService {
    public void insert(Role role);

    List<Role> list();

}
