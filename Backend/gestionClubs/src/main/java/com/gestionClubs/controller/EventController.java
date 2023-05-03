package com.gestionClubs.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestionClubs.model.Event;
import com.gestionClubs.repository.EventRepository;

import antlr.collections.List;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EventController {

	@Autowired
	  private EventRepository eventRep;
	
	  @PostMapping("/creation")
	  public ResponseEntity<Event> submitAdd(@RequestBody Event event) {
	    try {
	    	Event _event=eventRep.save(new Event(event.getId(),event.getEventName(),event.getOrganizer(),
		    		event.getPlace(),event.getAttendees(),event.getMaterialsNeeded(),event.getEventDate()));
			return new ResponseEntity<>(_event,HttpStatus.CREATED); 
	    } catch(Exception e) {
	    	return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  
	  @DeleteMapping("/delete/{id}")
		public ResponseEntity<HttpStatus> deleteEvent(@PathVariable("id") long id) {
			try {
				eventRep.deleteById(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	  
	  @PutMapping("/update/{id}")
	  public ResponseEntity<Event> updateEvent(@PathVariable("id") long id,@RequestBody Event event ){
		  java.util.Optional<Event> eventData=eventRep.findById(id);
		  if (eventData.isPresent()) {
			  Event _event=eventData.get();
			  _event.setEventName(event.getEventName());
			  _event.setOrganizer(event.getOrganizer());
			  _event.setPlace(event.getPlace());
			  _event.setAttendees(event.getAttendees());
			  _event.setMaterialsNeeded(event.getMaterialsNeeded());
			  _event.setEventDate(event.getEventDate());
			  return new ResponseEntity<>(eventRep.save(_event),HttpStatus.OK);
		  }
		  else {
			  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }
	  }
	  
	  
		@GetMapping("/events")
		public ResponseEntity<java.util.List<Event>> getAllEvents(@RequestParam(required = false) String eventName) {
			try {
				java.util.List<Event> events = new ArrayList<Event>();

				if (eventName == null)
					eventRep.findAll().forEach(events::add);
				else
					eventRep.findByEventName(eventName).forEach(events::add);

				if (events.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}

				return new ResponseEntity<>(events, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		
		
		
	


	  

		  

	  
}
