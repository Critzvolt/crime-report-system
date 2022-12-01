package com.crimereportsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "station")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @Column @Getter @Setter private String Address;
    @Column @Getter @Setter private String PhoneNumber;

    public Station(){}
    public Station(Long id, String address, String phoneNumber) {
        super();
        this.id = id;
        this.Address = address;
        this.PhoneNumber = phoneNumber;
    }
}