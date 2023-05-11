package com.sht.filmrescource.controller;

import com.sht.filmrescource.entity.Country;
import com.sht.filmrescource.service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Country)表控制层
 *
 * @author makejava
 * @since 2023-05-11 14:40:18
 */
@RestController
@RequestMapping("country")
public class CountryController {
    /**
     * 服务对象
     */
    @Resource
    private CountryService countryService;

    /**
     * 让所有国家
     *
     * @return {@link ResponseEntity}<{@link List}<{@link Country}>>
     */
    @GetMapping("/all")
    ResponseEntity<List<Country>> getAllCountry(){
        return ResponseEntity.ok(countryService.getAllCountry());
    }

    /**
     * 找到各国id
     *
     * @param countryId 国家id
     * @return {@link ResponseEntity}<{@link Country}>
     */
    @GetMapping("/findCountryByCountryId")
    ResponseEntity<Country> findCountryByCountryId(@RequestParam Long countryId){
        return ResponseEntity.ok(countryService.findCountryByCountryId(countryId));
    }
    
    /**
     * 添加国家
     *
     * @param country 国家
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/addCountry")
    ResponseEntity<Boolean> addCountry(@RequestBody Country country){
        return ResponseEntity.ok(countryService.addCountry(country));
    }

    /**
     * 更新国家
     *
     * @param country 国家
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/updateCountry")
    ResponseEntity<Boolean> updateCountry(@RequestBody Country country){
        return ResponseEntity.ok(countryService.updateCountry(country));
    }

    /**
     * 删除国家
     *
     * @param countryId 国家id
     * @return {@link ResponseEntity}<{@link Boolean}>
     */
    @PostMapping("/deleteCountry")
    ResponseEntity<Boolean> deleteCountry(@RequestBody Long countryId){
        return ResponseEntity.ok(countryService.deleteCountry(countryId));
    }
}

