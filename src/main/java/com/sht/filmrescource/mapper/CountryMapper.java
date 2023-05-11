package com.sht.filmrescource.mapper;

import com.sht.filmrescource.entity.Country;

import java.util.List;

/**
 * (Country)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-11 14:40:19
 */
public interface CountryMapper {


    List<Country> getAllCountry();

    Integer addCountry(Country country);

    Integer updateCountry(Country country);

    Integer deleteCountry(Long countryId);

    Country findCountryByCountryId(Long countryId);
}

