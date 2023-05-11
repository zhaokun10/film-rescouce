package com.sht.filmrescource.service.impl;

import com.sht.filmrescource.entity.Actor;
import com.sht.filmrescource.mapper.ActorMapper;
import com.sht.filmrescource.service.ActorService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Actor)表服务实现类
 *
 * @author makejava
 * @since 2023-05-02 10:26:37
 */
@Service("actorService")
public class ActorServiceImpl implements ActorService {
    @Resource
    private ActorMapper actorMapper;


    /**
     * 得到所有演员
     *
     * @return {@link List}<{@link Actor}>
     */
    @Override
    public List<Actor> getAllActor() {
        return actorMapper.getAllActor();
    }

    /**
     * 找演员信息通过演员id
     *
     * @param actorId 演员id
     * @return {@link Actor}
     */
    @Override
    public Actor findActorInfoByActorId(Long actorId) {
        return actorMapper.findActorInfoByActorId(actorId);
    }

    /**
     * 添加演员
     *
     * @param actor 演员
     * @return {@link Boolean}
     */
    @Override
    public Boolean addActor(Actor actor) {
       actorMapper.addActor(actor);
        System.out.println(actor.getId());
        actor.getDutiesList().forEach(duties -> {
            actorMapper.addActorDuties(actor.getId(), duties.getId());
        });
        return actor.getId()!=null;
    }

    /**
     * 更新演员
     *
     * @param actor 演员
     * @return {@link Boolean}
     */
    @Override
    public Boolean updateActor(Actor actor) {
        actorMapper.deleteActorDuties(actor.getId());
        actor.getDutiesList().forEach(duties -> {
            actorMapper.addActorDuties(actor.getId(), duties.getId());
        });
        return actorMapper.updateActor(actor)>0;
    }

    /**
     * 删除演员,演员id
     *
     * @param actorId 演员id
     * @return {@link Boolean}
     */
    @Override
    public Boolean deleteActorByActorId(Long actorId) {
        actorMapper.deleteActorDuties(actorId);
        return actorMapper.deleteActorByActorId(actorId)>0;
    }
}
