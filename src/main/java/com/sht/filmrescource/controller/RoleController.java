package com.sht.filmrescource.controller;

import com.sht.filmrescource.entity.Role;
import com.sht.filmrescource.service.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Role)表控制层
 *
 * @author makejava
 * @since 2023-05-06 10:32:46
 */
@RestController
@RequestMapping("role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Role> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.roleService.queryById(id));
    }

    @PostMapping("find/{id}")
    public ResponseEntity<Long> findRoleByUserId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.roleService.findRoleByUserId(id));
    }

    /**
     * 新增数据
     *
     * @param role 实体
     * @return 新增结果
     */
    @PostMapping("/insert")
    public ResponseEntity<Role> add(Role role) {
        return ResponseEntity.ok(this.roleService.insert(role));
    }

    /**
     * 编辑数据
     *
     * @param role 实体
     * @return 编辑结果
     */
    @PostMapping("/update")
    public ResponseEntity<Role> edit(Role role) {
        return ResponseEntity.ok(this.roleService.update(role));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.roleService.deleteById(id));
    }

}

