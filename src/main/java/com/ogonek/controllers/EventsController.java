package com.ogonek.controllers;

import com.ogonek.repositories.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/events")
public class EventsController {

    @Autowired
    EventsRepository eventsRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Test(){
        return "Солнышко, не плакай :)";
    }

    @RequestMapping(value = "/sun", method = RequestMethod.GET)
    public String Test2(){
        return "Op";
    }
}
