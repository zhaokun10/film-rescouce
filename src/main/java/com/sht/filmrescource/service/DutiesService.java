package com.sht.filmrescource.service;

import com.sht.filmrescource.entity.Duties;

import java.util.List;

/**
 * (Duties)表服务接口
 *
 * @author makejava
 * @since 2023-05-11 14:40:53
 */
public interface DutiesService {

    /**
     * 把所有责任
     *
     * @return {@link List}<{@link Duties}>
     */
    List<Duties> getAllDuties();

    /**
     * 添加任务
     *
     * @param duties 职责
     * @return {@link Boolean}
     */
    Boolean addDuties(Duties duties);

    /**
     * 更新工作
     *
     * @param duties 职责
     * @return {@link Boolean}
     */
    Boolean updateDuties(Duties duties);

    /**
     * 删除任务
     *
     * @param dutiesId 职责id
     * @return {@link Boolean}
     */
    Boolean deleteDuties(Long dutiesId);

    Duties findDutiesByDutiesId(Long dutiesId);
}
