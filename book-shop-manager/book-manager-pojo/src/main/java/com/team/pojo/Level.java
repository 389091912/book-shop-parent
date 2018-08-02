package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_level")
public class Level implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer section;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return section
     */
    public Integer getSection() {
        return section;
    }

    /**
     * @param section
     */
    public void setSection(Integer section) {
        this.section = section;
    }
}