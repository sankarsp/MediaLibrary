package org.media.model;

/**
 * Created by shantonu on 1/31/17.
 */
public class Artist {
    private Long ID;
    private String NAME;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Artist(){}
    public Artist(Long ID, String NAME) {
        this.ID = ID;
        this.NAME = NAME;
    }
}
