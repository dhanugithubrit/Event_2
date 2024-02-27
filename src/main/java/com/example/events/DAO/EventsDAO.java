package com.example.events.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.events.models.Events;

public interface EventsDAO extends JpaRepository<Events, Integer>{

}
