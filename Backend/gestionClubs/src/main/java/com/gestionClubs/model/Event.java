package com.gestionClubs.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Event")
public class Event {
	   @Id
	    private long id;
	    
	    @Column(name="eventName")
	    private String eventName;
	    
	    private String organizer;
	    private String place;
	    private int attendees;
	    private String materialsNeeded;
	    private String eventDate;
	    
	    public Event() {
	    }

	    public Event(long id,String eventName, String organizer, String place, int attendees, String materialsNeeded, String eventDate) {
	        this.id=id;
	    	this.eventName = eventName;
	        this.organizer = organizer;
	        this.place = place;
	        this.attendees = attendees;
	        this.materialsNeeded = materialsNeeded;
	        this.eventDate = eventDate;
	    }

	    // Getters and Setters for attributes

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getEventName() {
	        return eventName;
	    }

	    public void setEventName(String eventName) {
	        this.eventName = eventName;
	    }

	    public String getOrganizer() {
	        return organizer;
	    }

	    public void setOrganizer(String organizer) {
	        this.organizer = organizer;
	    }

	    public String getPlace() {
	        return place;
	    }

	    public void setPlace(String place) {
	        this.place = place;
	    }

	    public int getAttendees() {
	        return attendees;
	    }

	    public void setAttendees(int attendees) {
	        this.attendees = attendees;
	    }

	    public String getMaterialsNeeded() {
	        return materialsNeeded;
	    }

	    public void setMaterialsNeeded(String materialsNeeded) {
	        this.materialsNeeded = materialsNeeded;
	    }

	    public String getEventDate() {
	        return eventDate;
	    }

	    public void setEventDate(String eventDate) {
	        this.eventDate = eventDate;
	    }

}
