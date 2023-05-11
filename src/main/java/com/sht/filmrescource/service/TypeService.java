package com.sht.filmrescource.service;

import com.sht.filmrescource.entity.Type;

import java.util.List;

/**
 * (Type)表服务接口
 *
 * @author makejava
 * @since 2023-05-11 14:41:23
 */
public interface TypeService {

    /**
     * 得到所有类型
     *
     * @return {@link List}<{@link Type}>
     */
    List<Type> getAllType();

    /**
     * 添加类型
     *
     * @param type 类型
     * @return {@link Boolean}
     */
    Boolean addType(Type type);

    /**
     * 更新类型
     *
     * @param type 类型
     * @return {@link Boolean}
     */
    Boolean updateType(Type type);

    /**
     * 删除类型
     *
     * @param typeId id类型
     * @return {@link Boolean}
     */
    Boolean deleteType(Long typeId);

    Type findTypeByTypeId(Long typeId);
}

