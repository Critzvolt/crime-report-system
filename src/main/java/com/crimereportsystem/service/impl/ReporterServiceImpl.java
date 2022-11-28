package com.crimereportsystem.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.crimereportsystem.entity.Reporter;
import com.crimereportsystem.repository.ReporterRepository;
import com.crimereportsystem.service.ReporterService;

@Service
public class ReporterServiceImpl implements ReporterService{

    private ReporterRepository reporterRepository;

    public ReporterServiceImpl(ReporterRepository reporterRepository) {
        super();
        this.reporterRepository = reporterRepository;
    }

    @Override
    public List<Reporter> getAllReporters() {return reporterRepository.findAll();}

    @Override
    public Reporter saveReporter(Reporter reporter) {return reporterRepository.save(reporter);}

    @Override
    public Reporter getReporterById(Long id) {return reporterRepository.findById(id).get();}

    @Override
    public Reporter updateReporter(Reporter reporter) {return reporterRepository.save(reporter);}

    @Override
    public void deleteReporterById(Long id) {reporterRepository.deleteById(id);}

}
