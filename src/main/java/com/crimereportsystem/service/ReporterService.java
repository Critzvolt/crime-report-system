package com.crimereportsystem.service;
import java.util.List;
import com.crimereportsystem.entity.Reporter;

public interface ReporterService {
    List<Reporter> getAllReporters();
    Reporter saveReporter(Reporter reporter);
    Reporter getReporterById(Long id);
    Reporter updateReporter(Reporter reporter);
    void deleteReporterById(Long id);
}