package com.sht.filmrescource.controller;

import com.sht.filmrescource.entity.Type;
import com.sht.filmrescource.service.TypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Type)表控制层
 *
 * @author makejava
 * @since 2023-05-11 14:41:23
 */
@RestController
@RequestMapping("type")
public class TypeController {
    /**
     * 服务对象
     */
    @Resource
    private TypeService typeService;

    /**
     * 得到所有类型
     *
     * @return {@link ResponseEntity}<{@link List}<{@link Type}>>
     */
    @GetMapping("/all")
    ResponseEntity<List<Type>> getAllType(){
        return ResponseEntity.ok(typeService.getAllType());
    }

    /**
     * 得到所有类型
     *
     * @return {@link ResponseEntity}<{@link List}<{@link Type}>>
     */
    @GetMapping("/findTypeByTypeId")
    ResponseEntity<Type> findTypeByTypeId(@RequestParam Long typeId){
        return ResponseEntity.ok(typeService.findTypeByTypeId(typeId));
    }

    /**
     * 添加类型
     *
     * @param type 类型
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/addType")
    ResponseEntity<Boolean> addType(@RequestBody Type type){
        return ResponseEntity.ok(typeService.addType(type));
    }

    /**
     * 更新类型
     *
     * @param type 类型
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/updateType")
    ResponseEntity<Boolean> updateType(@RequestBody Type type){
        return ResponseEntity.ok(typeService.updateType(type));
    }

    /**
     * 删除类型
     *
     * @param typeId id类型
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/deleteType")
    ResponseEntity<Boolean> deleteType(@RequestBody Long typeId){
        return ResponseEntity.ok(typeService.deleteType(typeId));
    }
}

