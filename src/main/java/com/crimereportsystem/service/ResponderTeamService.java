package com.crimereportsystem.service;
import java.util.List;
import com.crimereportsystem.entity.ResponderTeam;

public interface ResponderTeamService {
    List<ResponderTeam> getAllResponderTeams();
    ResponderTeam saveResponderTeam(ResponderTeam responderTeam);
    ResponderTeam getResponderTeamById(Long id);
    ResponderTeam updateResponderTeam(ResponderTeam responderTeam);
    void deleteResponderTeamById(Long id);
}