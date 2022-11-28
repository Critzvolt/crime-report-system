package com.crimereportsystem.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.crimereportsystem.entity.CrimeReport;
import com.crimereportsystem.repository.CrimeReportRepository;
import com.crimereportsystem.service.CrimeReportService;

@Service
public class CrimeReportServiceImpl implements CrimeReportService{

    private CrimeReportRepository crimeReportRepository;

    public CrimeReportServiceImpl(CrimeReportRepository crimeReportRepository) {
        super();
        this.crimeReportRepository = crimeReportRepository;
    }

    @Override
    public List<CrimeReport> getAllCrimeReports() {return crimeReportRepository.findAll();}

    @Override
    public CrimeReport saveCrimeReport(CrimeReport crimeReport) {return crimeReportRepository.save(crimeReport);}

    @Override
    public CrimeReport getCrimeReportById(Long id) {return crimeReportRepository.findById(id).get();}

    @Override
    public CrimeReport updateCrimeReport(CrimeReport crimeReport) {return crimeReportRepository.save(crimeReport);}

    @Override
    public void deleteCrimeReportById(Long id) {crimeReportRepository.deleteById(id);}

}
