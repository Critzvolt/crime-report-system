package com.crimereportsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.crimereportsystem.entity.Reporter;

public interface ReporterRepository extends JpaRepository<Reporter, Long>{}