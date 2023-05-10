package com.sht.filmrescource.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Actor)实体类
 *
 * @author makejava
 * @since 2023-05-02 10:26:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor implements Serializable {
    private static final long serialVersionUID = 601295618224788676L;

    private Long id;

    private String actorName;

    private String actorProfile;

    private Long duties;

    private String actorCountry;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorProfile() {
        return actorProfile;
    }

    public void setActorProfile(String actorProfile) {
        this.actorProfile = actorProfile;
    }

    public Long getDuties() {
        return duties;
    }

    public void setDuties(Long duties) {
        this.duties = duties;
    }

    public String getCountry() {
        return actorCountry;
    }

    public void setCountry(String actorCountry) {
        this.actorCountry = actorCountry;
    }

}

