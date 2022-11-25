package com.crimereportsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
public class User {
    @Getter @Setter private string Name;
    @Getter @Setter private string PhoneNumber;
    @Getter @Setter private string Address;
    @Getter @Setter private string Login;
    @Getter @Setter private string Password;
}