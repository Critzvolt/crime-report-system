package com.crimereportsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "reporter")
public class Reporter extends User {
}