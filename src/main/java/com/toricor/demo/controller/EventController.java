package com.toricor.demo.controller;

import com.toricor.demo.domain.Event;
import com.toricor.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/events")
public class EventController {
    @Autowired
    EventService eventService;

    // イベント全件取得
    @RequestMapping(method = RequestMethod.GET)
    List<Event> getEvents() {
        List<Event> events = eventService.findAll();
        return events;
    }

    // イベント1件取得
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Event getEvent(@PathVariable Integer id) {
        Event event = eventService.findOne(id);
        return event;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    void postEvents(@RequestBody Event event) {
         eventService.create(event);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    void putEvent(@PathVariable Integer id, @RequestBody Event event) {
        event.setId(id);
        eventService.update(event);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteEvent(@PathVariable Integer id) {
        eventService.delete(id);
    }
}
