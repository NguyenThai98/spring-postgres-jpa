package com.jpa.springpostgres.service;

import com.jpa.springpostgres.domain.Actor;
import com.jpa.springpostgres.exception.InternalServerError;
import com.jpa.springpostgres.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Date: 4/10/2023<br/>
 * Time: 3:19 PM<br/>
 */
@Service
public class ActorService {
    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }
    public List<Actor> getActorList() {
        List<Actor> actorEntities;

        try {
            actorEntities = this.actorRepository.findAll();
        } catch (Exception ex) {
            throw new InternalServerError();
        }

        return actorEntities;
    }

    public Long countActors() {
        Long countAllActor;

        try {
            countAllActor = this.actorRepository.count();
        } catch (Exception ex) {
            throw new InternalServerError();
        }

        return countAllActor;
    }

    public Actor getActor(Long actorId) {
        Actor actor;

        try {
            actor = this.actorRepository.findByActorId(actorId);
        } catch (Exception ex) {
            throw new InternalServerError();
        }

        return actor;
    }
}
