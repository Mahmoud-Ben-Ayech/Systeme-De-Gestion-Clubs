package com.gestionClubs.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionClubs.model.EventJoin;
import com.gestionClubs.repository.EventjoinRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EventjoinController {
 
	@Autowired
	private EventjoinRepository eventjoinRep;
	
	 @PostMapping("/createEventjoin")
	  public ResponseEntity<EventJoin> createEventJoin(@RequestBody EventJoin eventjoin) {
	    try {
	    	EventJoin _eventjoin=eventjoinRep.save(new EventJoin(eventjoin.getNomEvent(),eventjoin.getEmailUser()));
			return new ResponseEntity<>(_eventjoin,HttpStatus.CREATED); 
	    } catch(Exception e) {
	    	return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
}
