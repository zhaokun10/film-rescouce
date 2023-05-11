package com.sht.filmrescource.entity;

import java.io.Serializable;

/**
 * (Duties)实体类
 *
 * @author makejava
 * @since 2023-05-11 14:40:53
 */
public class Duties implements Serializable {
    private static final long serialVersionUID = -53564545368235546L;
    
    private Long id;
    
    private String dutiesName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDutiesName() {
        return dutiesName;
    }

    public void setDutiesName(String dutiesName) {
        this.dutiesName = dutiesName;
    }

}

