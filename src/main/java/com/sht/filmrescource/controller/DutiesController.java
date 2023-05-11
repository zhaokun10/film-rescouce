package com.sht.filmrescource.controller;

import com.sht.filmrescource.entity.Duties;
import com.sht.filmrescource.service.DutiesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Duties)表控制层
 *
 * @author makejava
 * @since 2023-05-11 14:40:53
 */
@RestController
@RequestMapping("duties")
public class DutiesController {
    /**
     * 服务对象
     */
    @Resource
    private DutiesService dutiesService;


    /**
     * 把所有责任
     *
     * @return {@link ResponseEntity}<{@link List}<{@link Duties}>>
     */
    @GetMapping("/all")
    ResponseEntity<List<Duties>> getAllDuties(){
        return ResponseEntity.ok(dutiesService.getAllDuties());
    }

    /**
     * 发现职责任务id
     *
     * @param dutiesId 职责id
     * @return {@link ResponseEntity}<{@link Duties}>
     */
    @GetMapping("/findDutiesByDutiesId")
    ResponseEntity<Duties> findDutiesByDutiesId(@RequestParam Long dutiesId){
        return ResponseEntity.ok(dutiesService.findDutiesByDutiesId(dutiesId));
    }
    
    /**
     * 添加任务
     *
     * @param duties 职责
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/addDuties")
    ResponseEntity<Boolean> addDuties(@RequestBody Duties duties){
        return ResponseEntity.ok(dutiesService.addDuties(duties));
    }

    /**
     * 更新工作
     *
     * @param duties 职责
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/updateDuties")
    ResponseEntity<Boolean> updateDuties(@RequestBody Duties duties){
        return ResponseEntity.ok(dutiesService.updateDuties(duties));
    }

    /**
     * 删除任务
     *
     * @param dutiesId 职责id
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/deleteDuties")
    ResponseEntity<Boolean> deleteDuties(@RequestBody Long dutiesId){
        return ResponseEntity.ok(dutiesService.deleteDuties(dutiesId));
    }
}

