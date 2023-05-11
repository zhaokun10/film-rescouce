package com.sht.filmrescource.mapper;

import com.sht.filmrescource.entity.Duties;

import java.util.List;

/**
 * (Duties)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-11 14:40:53
 */
public interface DutiesMapper {

    List<Duties> getAllDuties();

    Integer addDuties(Duties duties);

    Integer updateDuties(Duties duties);

    Integer deleteDuties(Long dutiesId);

    Duties findDutiesByDutiesId(Long dutiesId);
}

