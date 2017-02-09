package org.media.model;

import java.util.Date;

/**
 * Created by shantonu on 2/4/17.
 */
public class Recording {
    private Long ID;
    private String TITLE;
    private Date RELEASE;
    private Long ART_ID;
    private Long LABEL_ID;


    public Recording(){}
    public Recording(Long ID, String title, Date RELEASE, Long ART_ID, Long LABEL_ID) {
        this.ID = ID;
        this.TITLE = title;
        this.RELEASE = RELEASE;
        this.ART_ID = ART_ID;
        this.LABEL_ID = LABEL_ID;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String title) {
        this.TITLE = title;
    }

    public Date getRELEASE() {
        return RELEASE;
    }

    public void setRELEASE(Date RELEASE) {
        this.RELEASE = RELEASE;
    }

    public Long getART_ID() {
        return ART_ID;
    }

    public void setART_ID(Long ART_ID) {
        this.ART_ID = ART_ID;
    }

    public Long getLABEL_ID() {
        return LABEL_ID;
    }

    public void setLABEL_ID(Long LABEL_ID) {
        this.LABEL_ID = LABEL_ID;
    }
}
