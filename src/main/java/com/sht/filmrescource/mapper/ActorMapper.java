package com.sht.filmrescource.mapper;

import com.sht.filmrescource.entity.Actor;

import java.util.List;

/**
 * (Actor)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-02 10:26:30
 */
public interface ActorMapper {

    List<Actor> getAllActor();

    Actor findActorInfoByActorId(Long actorId);

    Integer addActor(Actor actor);

    Integer updateActor(Actor actor);

    Integer deleteActorByActorId(Long actorId);

    Integer addActorDuties(Long actorId, Long dutiesId);

    Integer deleteActorDuties(Long id);
}

