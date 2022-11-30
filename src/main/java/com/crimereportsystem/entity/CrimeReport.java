package com.crimereportsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name = "crime_report")
public class CrimeReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @Column @Getter @Setter private String Reporter;
    @Column @Getter @Setter private String Description;
    @Column @Getter @Setter private Date Time;
    @Column @Getter @Setter private String Place;
}