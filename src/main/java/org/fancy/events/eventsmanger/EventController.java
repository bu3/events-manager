package org.fancy.events.eventsmanger;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class EventController {

    @GetMapping("/events")
    public List<Event> findEvents() {
        return Arrays.asList(
                new Event(1L, "Cool party", "Dublin"),
                new Event(2L, "Boring event", "Paris"));
    }

}
