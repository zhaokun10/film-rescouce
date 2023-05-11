package com.sht.filmrescource.service.impl;

import com.sht.filmrescource.entity.Country;
import com.sht.filmrescource.mapper.CountryMapper;
import com.sht.filmrescource.service.CountryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Country)表服务实现类
 *
 * @author makejava
 * @since 2023-05-11 14:40:28
 */
@Service("countryService")
public class CountryServiceImpl implements CountryService {
    @Resource
    private CountryMapper countryMapper;

    @Override
    public List<Country> getAllCountry() {
        return countryMapper.getAllCountry();
    }

    @Override
    public Boolean addCountry(Country country) {
        return countryMapper.addCountry(country)>0;
    }

    @Override
    public Boolean updateCountry(Country country) {
        return countryMapper.updateCountry(country)>0;
    }

    @Override
    public Boolean deleteCountry(Long countryId) {
        return countryMapper.deleteCountry(countryId)>0;
    }

    @Override
    public Country findCountryByCountryId(Long countryId) {
        return countryMapper.findCountryByCountryId(countryId);
    }
}
