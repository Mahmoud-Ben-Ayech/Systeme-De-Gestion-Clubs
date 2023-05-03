package com.gestionClubs.repository;





import org.springframework.data.jpa.repository.JpaRepository;  

import com.gestionClubs.model.Event;



public interface EventRepository extends JpaRepository<Event,Long> {

	Iterable<Event> findByEventName(String eventName);

	//List findByEventName(String eventName);

}
