package com.crimereportsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "responder_team")
public class ResponderTeam extends Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @Column @Getter @Setter private Station Station;
    @Column @Getter @Setter private String CurrentPlace;
    @Column @Getter @Setter private CrimeReport CurrentJob;
}