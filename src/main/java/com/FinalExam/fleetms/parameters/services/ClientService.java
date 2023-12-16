package com.FinalExam.fleetms.parameters.services;

import com.FinalExam.fleetms.parameters.repositories.ClientRepository;
import com.FinalExam.fleetms.parameters.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	//Get All Clients
	public List<Client> findAll(){
		return clientRepository.findAll();
	}

	//Get Client By Id
	public Client findById(int id) {
		return clientRepository.findById(id).orElse(null);
	}

	//Delete Client
	public void deleteById(int id) {
		clientRepository.deleteById(id);
	}

	//Update Client
	public void save( Client client) {
		clientRepository.save(client);
	}

}
