package com.sht.filmrescource.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Country)实体类
 *
 * @author makejava
 * @since 2023-05-10 08:13:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country implements Serializable {
    private static final long serialVersionUID = 447029231538492284L;
    
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

