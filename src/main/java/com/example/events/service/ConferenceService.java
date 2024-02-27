package com.example.events.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.events.DAO.ConferecnceDAO;
import com.example.events.models.Conference;

@Service
public class ConferenceService {
	
	@Autowired
	private ConferecnceDAO cd ;

	
	public void saveConf(Conference con) {
		cd.save(con);
	}

}
