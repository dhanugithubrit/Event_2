package com.example.events.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.events.DAO.ConferecnceDAO;
import com.example.events.DAO.EventsDAO;
import com.example.events.models.Conference;
import com.example.events.models.Events;
import com.example.events.service.ConferenceService;

@org.springframework.stereotype.Controller
//@RestController
public class Controller {
	@Autowired
	private ConferenceService ser;
	
	@Autowired
	private EventsDAO ed ;

	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addPlans")
	public String getPlans() {
		return "addPlans";
	}
	
	@RequestMapping("/conference")
	public String viewPlans() {
		return "conference";
	}
 	
	
	@RequestMapping("/saveConference")
	public String saveConference(Conference con) {
		
		System.out.println(con.toString());
		ser.saveConf(con);
		return "home";
	}
	

}
