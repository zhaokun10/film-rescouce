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
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Actor queryById(Long id);

    /**
     * 新增数据
     *
     * @param actor 实例对象
     * @return 实例对象
     */
    Actor insert(Actor actor);

    /**
     * 修改数据
     *
     * @param actor 实例对象
     * @return 实例对象
     */
    Actor update(Actor actor);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    List<Actor> query();
}
