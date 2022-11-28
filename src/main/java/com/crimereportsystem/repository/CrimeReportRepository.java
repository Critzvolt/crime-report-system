package com.crimereportsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.crimereportsystem.entity.CrimeReport;

public interface CrimeReportRepository extends JpaRepository<CrimeReport, Long> {}