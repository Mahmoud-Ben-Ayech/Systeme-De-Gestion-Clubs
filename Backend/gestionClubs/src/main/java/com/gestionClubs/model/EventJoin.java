package com.gestionClubs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EventJoin")
public class EventJoin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	private String nomEvent;
	private String emailUser;
	public EventJoin(String nomEvent, String emailUser) {
		super();
		
		this.nomEvent = nomEvent;
		this.emailUser = emailUser;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomEvent() {
		return nomEvent;
	}
	public void setNomEvent(String nomEvent) {
		this.nomEvent = nomEvent;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setemailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	
	}
