package com.crimereportsystem.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.crimereportsystem.entity.ResponderTeam;
import com.crimereportsystem.repository.ResponderTeamRepository;
import com.crimereportsystem.service.ResponderTeamService;

@Service
public class ResponderTeamServiceImpl implements ResponderTeamService{

    private ResponderTeamRepository responderTeamRepository;

    public ResponderTeamServiceImpl(ResponderTeamRepository responderTeamRepository) {
        super();
        this.responderTeamRepository = responderTeamRepository;
    }

    @Override
    public List<ResponderTeam> getAllResponderTeams() {return responderTeamRepository.findAll();}

    @Override
    public ResponderTeam saveResponderTeam(ResponderTeam responderTeam) {return responderTeamRepository.save(responderTeam);}

    @Override
    public ResponderTeam getResponderTeamById(Long id) {return responderTeamRepository.findById(id).get();}

    @Override
    public ResponderTeam updateResponderTeam(ResponderTeam responderTeam) {return responderTeamRepository.save(responderTeam);}

    @Override
    public void deleteResponderTeamById(Long id) {responderTeamRepository.deleteById(id);}

}
