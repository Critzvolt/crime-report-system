package com.crimereportsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "crime_report")
public class CrimeReport {
    @Getter @Setter private string Reporter;
    @Getter @Setter private string Description;
    @Getter @Setter private Date Time;
    @Getter @Setter private string Place;
}