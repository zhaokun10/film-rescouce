package com.sht.filmrescource.service;

import com.sht.filmrescource.entity.Country;

import java.util.List;

/**
 * (Country)表服务接口
 *
 * @author makejava
 * @since 2023-05-11 14:40:28
 */
public interface CountryService {


    /**
     * 让所有国家
     *
     * @return {@link List}<{@link Country}>
     */
    List<Country> getAllCountry();

    /**
     * 添加国家
     *
     * @param country 国家
     * @return {@link Boolean}
     */
    Boolean addCountry(Country country);

    /**
     * 更新国家
     *
     * @param country 国家
     * @return {@link Boolean}
     */
    Boolean updateCountry(Country country);

    /**
     * 删除国家
     *
     * @param countryId 国家id
     * @return {@link Boolean}
     */
    Boolean deleteCountry(Long countryId);

    Country findCountryByCountryId(Long countryId);
}
