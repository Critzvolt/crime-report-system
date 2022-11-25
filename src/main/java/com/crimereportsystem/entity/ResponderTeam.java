package com.crimereportsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "responder_team")
public class ResponderTeam extends Admin {
    @Getter @Setter private Station Station;
    @Getter @Setter private string CurrentPlace;
    @Getter @Setter private CrimeReport CurrentJob;
}