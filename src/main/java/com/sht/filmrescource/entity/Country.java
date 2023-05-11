package com.sht.filmrescource.entity;

import java.io.Serializable;

/**
 * (Country)实体类
 *
 * @author makejava
 * @since 2023-05-11 14:40:22
 */
public class Country implements Serializable {
    private static final long serialVersionUID = 478512301043809090L;
    
    private Long id;
    
    private String countryName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}

