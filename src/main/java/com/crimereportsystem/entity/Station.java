package com.crimereportsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "station")
public class Station {
    @Getter @Setter private string Address;
    @Getter @Setter private string PhoneNumber;
}