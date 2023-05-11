package com.sht.filmrescource.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

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

    private Long countryId;

    private Long DutiesId;

    private Country actorCountry;

    private List<Duties> dutiesList;
}

