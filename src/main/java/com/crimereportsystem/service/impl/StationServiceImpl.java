package com.crimereportsystem.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.crimereportsystem.entity.Station;
import com.crimereportsystem.repository.StationRepository;
import com.crimereportsystem.service.StationService;

@Service
public class StationServiceImpl implements StationService{

    private StationRepository stationRepository;

    public StationServiceImpl(StationRepository stationRepository) {
        super();
        this.stationRepository = stationRepository;
    }

    @Override
    public List<Station> getAllStations() {return stationRepository.findAll();}

    @Override
    public Station saveStation(Station station) {return stationRepository.save(station);}

    @Override
    public Station getStationById(Long id) {return stationRepository.findById(id).get();}

    @Override
    public Station updateStation(Station station) {return stationRepository.save(station);}

    @Override
    public void deleteStationById(Long id) {stationRepository.deleteById(id);}

}
