package com.g6.virtualbody.dtos;

public class CostDTO {
    private String name;
    private String lastname;

    public CostDTO(){

    }

    public CostDTO(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
