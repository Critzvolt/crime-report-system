package com.crimereportsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.crimereportsystem.entity.Station;

public interface StationRepository extends JpaRepository<Station, Long> {}