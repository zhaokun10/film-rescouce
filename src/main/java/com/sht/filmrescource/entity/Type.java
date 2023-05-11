package com.sht.filmrescource.entity;

import java.io.Serializable;

/**
 * (Type)实体类
 *
 * @author makejava
 * @since 2023-05-11 14:41:23
 */
public class Type implements Serializable {
    private static final long serialVersionUID = -15034537844635930L;
    
    private Long id;
    
    private String typeName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}

