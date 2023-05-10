package com.sht.filmrescource.controller;

import com.sht.filmrescource.entity.Actor;
import com.sht.filmrescource.service.ActorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Actor)表控制层
 *
 * @author makejava
 * @since 2023-05-02 10:26:28
 */
@RestController
@RequestMapping("actor")
public class ActorController {
    /**
     * 服务对象
     */
    @Resource
    private ActorService actorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Actor> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.actorService.queryById(id));
    }

    /**
     * 查询通过id
     *
     * @return {@link ResponseEntity}<{@link List}<{@link Actor}>>
     */
    @GetMapping("/all")
    public ResponseEntity<List<Actor>> queryById() {
        return ResponseEntity.ok(this.actorService.query());
    }

    /**
     * 新增数据
     *
     * @param actor 实体
     * @return 新增结果
     */
    @PostMapping("/insert")
    public ResponseEntity<Actor> add(Actor actor) {
        return ResponseEntity.ok(this.actorService.insert(actor));
    }

    /**
     * 编辑数据
     *
     * @param actor 实体
     * @return 编辑结果
     */
    @PostMapping("/update")
    public ResponseEntity<Actor> edit(Actor actor) {
        return ResponseEntity.ok(this.actorService.update(actor));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.actorService.deleteById(id));
    }

}

