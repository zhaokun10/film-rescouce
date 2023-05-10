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
    private ActorMapper actorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Actor queryById(Long id) {
        return this.actorDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param actor 实例对象
     * @return 实例对象
     */
    @Override
    public Actor insert(Actor actor) {
        this.actorDao.insert(actor);
        return actor;
    }

    /**
     * 修改数据
     *
     * @param actor 实例对象
     * @return 实例对象
     */
    @Override
    public Actor update(Actor actor) {
        this.actorDao.update(actor);
        return this.queryById(actor.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.actorDao.deleteById(id) > 0;
    }

    @Override
    public List<Actor> query() {
        return this.actorDao.queryAllByLimit();
    }
}
