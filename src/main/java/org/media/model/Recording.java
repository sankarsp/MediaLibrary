package org.media.model;

import java.util.Date;

/**
 * Created by shantonu on 2/4/17.
 */
public class Recording {
    private Integer ID;
    private String TITLE;
    private Date RELEASE_DATE;
    private Integer ART_ID;
    private Integer LABEL_ID;


    public Recording(){}
    public Recording(Integer ID, String title, Date RELEASE_DATE, Integer ART_ID, Integer LABEL_ID) {
        this.ID = ID;
        this.TITLE = title;
        this.RELEASE_DATE = RELEASE_DATE;
        this.ART_ID = ART_ID;
        this.LABEL_ID = LABEL_ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String title) {
        this.TITLE = title;
    }

    public Date getRELEASE_DATE() {
        return RELEASE_DATE;
    }

    public void setRELEASE_DATE(Date RELEASE_DATE) {
        this.RELEASE_DATE = RELEASE_DATE;
    }

    public Integer getART_ID() {
        return ART_ID;
    }

    public void setART_ID(Integer ART_ID) {
        this.ART_ID = ART_ID;
    }

    public Integer getLABEL_ID() {
        return LABEL_ID;
    }

    public void setLABEL_ID(Integer LABEL_ID) {
        this.LABEL_ID = LABEL_ID;
    }
}
