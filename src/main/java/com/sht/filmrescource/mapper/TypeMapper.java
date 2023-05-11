package com.sht.filmrescource.mapper;

import com.sht.filmrescource.entity.Type;

import java.util.List;

/**
 * (Type)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-11 14:41:23
 */
public interface TypeMapper {
    
    List<Type> getAllType();

    Integer addType(Type type);

    Integer updateType(Type type);

    Integer deleteType(Long typeId);

    Type findTypeByTypeId(Long typeId);
}

