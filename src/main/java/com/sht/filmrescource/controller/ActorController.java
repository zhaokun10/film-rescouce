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
     * 得到所有演员
     *
     * @return {@link ResponseEntity}<{@link List}<{@link Actor}>>
     */
    @GetMapping("/all")
    ResponseEntity<List<Actor>> getAllActor(){
        return ResponseEntity.ok(actorService.getAllActor());
    }

    /**
     * 通过演员id找演员信息
     *
     * @param actorId 演员id
     * @return {@link ResponseEntity}<{@link Actor}>
     */
    @GetMapping("/findActorInfo")
    ResponseEntity<Actor> findActorInfoByActorId(@RequestParam Long actorId){
        return ResponseEntity.ok(actorService.findActorInfoByActorId(actorId));
    }

    /**
     * 添加演员
     *
     * @param actor 演员
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/addActor")
    ResponseEntity<Boolean> addActor(@RequestBody Actor actor){
        return ResponseEntity.ok(actorService.addActor(actor));
    }

    /**
     * 更新演员
     *
     * @param actor 演员
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/updateActor")
    ResponseEntity<Boolean> updateActor(@RequestBody Actor actor) {
        return ResponseEntity.ok(actorService.updateActor(actor));
    }

    /**
     * 删除演员,演员id
     *
     * @param actorId 演员id
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/deleteActor")
    ResponseEntity<Boolean> deleteActorByActorId(@RequestBody Long actorId){
        return ResponseEntity.ok(actorService.deleteActorByActorId(actorId));
    }
}

