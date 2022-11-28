package com.crimereportsystem.service;
import java.util.List;
import com.crimereportsystem.entity.Station;

public interface StationService {
    List<Station> getAllStations();
    Station saveStation(Station station);
    Station getStationById(Long id);
    Station updateStation(Station station);
    void deleteStationById(Long id);
}