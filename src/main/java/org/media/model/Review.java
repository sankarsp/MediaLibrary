package org.media.model;

/**
 * Created by shantonu on 2/4/17.
 */
public class Review {
    private Long ID;
    private Long REVIEWER_ID;
    private Long RECORDING_ID;
    private Long RATING;
    private String REVIEW;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getREVIEWER_ID() {
        return REVIEWER_ID;
    }

    public void setREVIEWER_ID(Long REVIEWER_ID) {
        this.REVIEWER_ID = REVIEWER_ID;
    }

    public Long getRECORDING_ID() {
        return RECORDING_ID;
    }

    public void setRECORDING_ID(Long RECORDING_ID) {
        this.RECORDING_ID = RECORDING_ID;
    }

    public Long getRATING() {
        return RATING;
    }

    public void setRATING(Long RATING) {
        this.RATING = RATING;
    }

    public String getREVIEW() {
        return REVIEW;
    }

    public void setREVIEW(String REVIEW) {
        this.REVIEW = REVIEW;
    }
    public Review(){}
    public Review(Long ID, Long REVIEWER_ID, Long RECORDING_ID, Long RATING, String REVIEW) {
        this.ID = ID;
        this.REVIEWER_ID = REVIEWER_ID;
        this.RECORDING_ID = RECORDING_ID;
        this.RATING = RATING;
        this.REVIEW = REVIEW;
    }
}
