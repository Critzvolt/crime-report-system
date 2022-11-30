package com.crimereportsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @Column @Getter @Setter private String Name;
    @Column @Getter @Setter private String PhoneNumber;
    @Column @Getter @Setter private String Address;
    @Column @Getter @Setter private String Login;
    @Column @Getter @Setter private String Password;
}