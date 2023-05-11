package com.sht.filmrescource.service;

import com.sht.filmrescource.entity.Actor;

import java.util.List;

/**
 * (Actor)表服务接口
 *
 * @author makejava
 * @since 2023-05-02 10:26:35
 */
public interface ActorService {

    /**
     * 得到所有演员
     *
     * @return {@link List}<{@link Actor}>
     */
    List<Actor> getAllActor();

    /**
     * 找演员信息通过演员id
     *
     * @param actorId 演员id
     * @return {@link Actor}
     */
    Actor findActorInfoByActorId(Long actorId);

    /**
     * 添加演员
     *
     * @param actor 演员
     * @return {@link Boolean}
     */
    Boolean addActor(Actor actor);

    /**
     * 更新演员
     *
     * @param actor 演员
     * @return {@link Boolean}
     */
    Boolean updateActor(Actor actor);

    /**
     * 删除演员,演员id
     *
     * @param actorId 演员id
     * @return {@link Boolean}
     */
    Boolean deleteActorByActorId(Long actorId);
}
