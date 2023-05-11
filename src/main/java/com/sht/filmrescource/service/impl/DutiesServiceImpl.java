package com.sht.filmrescource.service.impl;

import com.sht.filmrescource.entity.Duties;
import com.sht.filmrescource.mapper.DutiesMapper;
import com.sht.filmrescource.service.DutiesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Duties)表服务实现类
 *
 * @author makejava
 * @since 2023-05-11 14:40:53
 */
@Service("dutiesService")
public class DutiesServiceImpl implements DutiesService {
    @Resource
    private DutiesMapper dutiesMapper;

    @Override
    public List<Duties> getAllDuties() {
        return dutiesMapper.getAllDuties();
    }

    @Override
    public Boolean addDuties(Duties duties) {
        return dutiesMapper.addDuties(duties)>0;
    }

    @Override
    public Boolean updateDuties(Duties duties) {
        return dutiesMapper.updateDuties(duties)>0;
    }

    @Override
    public Boolean deleteDuties(Long dutiesId) {
        return dutiesMapper.deleteDuties(dutiesId)>0;
    }

    @Override
    public Duties findDutiesByDutiesId(Long dutiesId) {
        return dutiesMapper.findDutiesByDutiesId(dutiesId);
    }
}
