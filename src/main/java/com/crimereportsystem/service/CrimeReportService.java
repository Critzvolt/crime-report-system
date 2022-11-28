package com.crimereportsystem.service;
import java.util.List;
import com.crimereportsystem.entity.CrimeReport;

public interface CrimeReportService {
    List<CrimeReport> getAllCrimeReports();
    CrimeReport saveCrimeReport(CrimeReport crimeReport);
    CrimeReport getCrimeReportById(Long id);
    CrimeReport updateCrimeReport(CrimeReport crimeReport);
    void deleteCrimeReportById(Long id);
}