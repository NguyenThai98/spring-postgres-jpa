package com.jpa.springpostgres.controller;

import com.jpa.springpostgres.domain.Actor;
import com.jpa.springpostgres.service.ActorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Date: 4/10/2023<br/>
 * Time: 3:22 PM<br/>
 */
@RestController
@RequestMapping("/api/actor")
public class ActorController {
    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }
    @GetMapping()
    public Map<String, List<Actor>> getActors() {
        return Collections.singletonMap("actors", this.actorService.getActorList());
    }

    @GetMapping(value="/{id}")
    public Map<String, Actor> getActor(@PathVariable("id") Long id) {
        return Collections.singletonMap("actor", this.actorService.getActor(id));
    }

    @GetMapping("/count")
    public Map<String, Long> countActors() {
        return Collections.singletonMap("countActors", this.actorService.countActors());
    }
}
