package org.media.model;

/**
 * Created by shantonu on 2/4/17.
 */
public class Label {
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

    public Label(){}
    public Label(Long ID, String NAME) {
        this.ID = ID;
        this.NAME = NAME;
    }
}
