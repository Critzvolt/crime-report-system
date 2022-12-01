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

    /*Station*/@Column @Getter @Setter private Long Station;
    @Column @Getter @Setter private String CurrentPlace;
    /*CrimeReport*/@Column @Getter @Setter private Long CurrentJob;

    public ResponderTeam(){}
    public ResponderTeam(Long id, Long station, String currentPlace, Long currentJob) {
        this.id = id;
        this.Station = station;
        this.CurrentPlace = currentPlace;
        this.CurrentJob = currentJob;
    }
}