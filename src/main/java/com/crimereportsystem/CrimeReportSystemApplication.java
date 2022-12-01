package com.crimereportsystem;

import com.crimereportsystem.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrimeReportSystemApplication {

    public CrimeReportSystemApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(CrimeReportSystemApplication.class, args);
    }

    @Autowired private AdminRepository adminRepository;
    @Autowired private CrimeReportRepository crimeReportRepository;
    @Autowired private ReporterRepository reporterRepository;
    @Autowired private ResponderTeamRepository responderTeamRepository;
    @Autowired private StationRepository stationRepository;
}
