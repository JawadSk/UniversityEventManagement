package com.jawad.UniversityEventManagement.repository;

import com.jawad.UniversityEventManagement.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IEventRepository extends CrudRepository<Event, Integer> {

    public List<Event> findByDate(String date);


}
