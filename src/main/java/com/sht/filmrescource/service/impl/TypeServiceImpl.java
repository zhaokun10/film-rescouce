package com.sht.filmrescource.service.impl;

import com.sht.filmrescource.entity.Type;
import com.sht.filmrescource.mapper.TypeMapper;
import com.sht.filmrescource.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Type)表服务实现类
 *
 * @author makejava
 * @since 2023-05-11 14:41:23
 */
@Service("typeService")
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeMapper typeMapper;


    @Override
    public List<Type> getAllType() {
        return typeMapper.getAllType();
    }

    @Override
    public Boolean addType(Type type) {
        return typeMapper.addType(type)>0;
    }

    @Override
    public Boolean updateType(Type type) {
        return typeMapper.updateType(type)>0;
    }

    @Override
    public Boolean deleteType(Long typeId) {
        return typeMapper.deleteType(typeId)>0;
    }

    @Override
    public Type findTypeByTypeId(Long typeId) {
        return typeMapper.findTypeByTypeId(typeId);
    }
}
