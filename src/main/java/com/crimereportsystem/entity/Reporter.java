package com.crimereportsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reporter")
public class Reporter extends User {

    public Reporter(){}
    public Reporter(Long id, String name, String phoneNumber, String address, String login, String password) {
        this.id = id;
        this.Name = name;
        this.PhoneNumber = phoneNumber;
        this.Address = address;
        this.Login = login;
        this.Password = password;
    }
}