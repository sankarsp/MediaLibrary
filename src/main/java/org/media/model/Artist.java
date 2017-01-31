package org.media.model;

/**
 * Created by shantonu on 1/31/17.
 */
public class Artist {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist(){}
    public Artist(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
