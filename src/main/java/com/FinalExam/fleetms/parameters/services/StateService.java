package com.FinalExam.fleetms.parameters.services;

import com.FinalExam.fleetms.parameters.repositories.StateRepository;
import com.FinalExam.fleetms.parameters.models.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;
	
	//Get All States
	public List<State> findAll(){
		return stateRepository.findAll();
	}	
	
	//Get State By Id
	public State findById(int id) {
		return stateRepository.findById(id).orElse(null);
	}	
	
	//Delete State
	public void delete(int id) {
		stateRepository.deleteById(id);
	}
	
	//Update State
	public void save( State state) {
		stateRepository.save(state);
	}
}
