package com.crimereportsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter protected Long id;

    @Column @Getter @Setter protected String Name;
    @Column @Getter @Setter protected String PhoneNumber;
    @Column @Getter @Setter protected String Address;
    @Column @Getter @Setter protected String Login;
    @Column @Getter @Setter protected String Password;
}