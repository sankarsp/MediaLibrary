package org.media.model;

/**
 * Created by shantonu on 2/4/17.
 */
public class Reviewer {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reviewer(){}
    public Reviewer(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}