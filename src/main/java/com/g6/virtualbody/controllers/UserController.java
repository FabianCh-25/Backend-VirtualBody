package com.g6.virtualbody.controllers;



import com.g6.virtualbody.dtos.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import com.g6.virtualbody.entities.Users;
import com.g6.virtualbody.services.IUserService;


import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;


@RestController
//@Secured({"ROLE_ADMIN"})
@RequestMapping("/users")
public class UserController {
    @Autowired
    private PasswordEncoder pwe;
    @Autowired
    private IUserService uService;

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Users());
            model.addAttribute("listaUsuarios", uService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }

    @GetMapping("/listar")
    public List<UserDTO> List(){
        return uService.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insert")
    public void insert(@RequestBody UserDTO dto){
        String bcryptPassword = pwe.encode(dto.getPassword());
        dto.setPassword(bcryptPassword);
        System.out.println(dto.getId());
        ModelMapper m=new ModelMapper();
        Users a=m.map(dto, Users.class);
        System.out.println(a.getId());
        uService.insert(a);
    }

    @GetMapping("/last")
    public UserDTO getLastUser() {
        Users lastUser = uService.last();
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(lastUser, UserDTO.class);
    }

//    @PostMapping("/save")
//    public String saveUser(@Valid Users user, BindingResult result, Model model, SessionStatus status)
//            throws Exception {
//        if (result.hasErrors()) {
//            return "usersecurity/user";
//        } else {
//            String bcryptPassword = bcrypt.encode(user.getPassword());
//            user.setPassword(bcryptPassword);
//            int rpta = uService.insert(user);
//            if (rpta > 0) {
//                model.addAttribute("mensaje", "Ya existe");
//                return "usersecurity/user";
//            } else {
//                model.addAttribute("mensaje", "Se guardó correctamente");
//                status.setComplete();
//            }
//        }
//        model.addAttribute("listaUsuarios", uService.list());
//
//        return "usersecurity/listUser";
//    }

//    @GetMapping("/list")
//    public String listUser(Model model) {
//        try {
//            model.addAttribute("user", new Users());
//            model.addAttribute("listaUsuarios", uService.list());
//        } catch (Exception e) {
//            model.addAttribute("error", e.getMessage());
//        }
//        return "usersecurity/listUser";
//    }

}
