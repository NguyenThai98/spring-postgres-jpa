package com.jpa.springpostgres.repository;

import com.jpa.springpostgres.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Date: 4/10/2023<br/>
 * Time: 2:56 PM<br/>
 */
@Repository
public interface ActorRepository extends JpaRepository<Actor,Long>, CrudRepository<Actor, Long> {
    Actor findByActorId(Long id);
}
