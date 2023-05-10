package com.sht.filmrescource.service;

import com.sht.filmrescource.entity.Role;

import java.util.List;

/**
 * (Role)表服务接口
 *
 * @author makejava
 * @since 2023-05-06 10:32:53
 */
public interface RoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Role queryById(Long id);

    /**
     * 查询页面
     * 分页查询
     *
     * @return 查询结果
     */
    List<Role> queryByPage();

    /**
     * 新增数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    Role insert(Role role);

    /**
     * 修改数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    Role update(Role role);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    Long findRoleByUserId(Long userId);
}
