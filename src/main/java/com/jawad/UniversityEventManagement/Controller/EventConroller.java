package com.jawad.UniversityEventManagement.Controller;

import com.jawad.UniversityEventManagement.Service.EventService;
import com.jawad.UniversityEventManagement.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "event")
public class EventConroller {

    @Autowired
    EventService eventService;

    @PostMapping(value = "/")
    public String addEvent(@RequestBody Event event){
        return eventService.addEventToDb(event);
    }
    @PutMapping(value = "/")
    public String updateEvent(@RequestBody Event event){
        return eventService.updateEvent(event);
    }
    @DeleteMapping(value = "/id/{id}")
    public String deleteEventById(@PathVariable Integer id){
        return eventService.deleteEventById(id);
    }
    @GetMapping(value = "/date/{date}")
    public List<Event> getEventsByDate(@PathVariable String date){
        return eventService.getAllEventsByDate(date);
    }
}
