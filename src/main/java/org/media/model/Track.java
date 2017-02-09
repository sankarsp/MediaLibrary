package org.media.model;



/**
 * Created by shantonu on 2/4/17.
 */
public class Track {
    private Long ID;
    private String TITLE;
    private String DURATION;
    private Long GENRE_ID;
    private Long ARTIST_ID;
    private Long RECORDING_ID;
    public Track(){}
    public Track(Long ID, String TITLE, String DURATION, Long GENRE_ID, Long ARTIST_ID, Long RECORDING_ID) {
        this.ID = ID;
        this.TITLE = TITLE;
        this.DURATION = DURATION;
        this.GENRE_ID = GENRE_ID;
        this.ARTIST_ID = ARTIST_ID;
        this.RECORDING_ID = RECORDING_ID;
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

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getDURATION() {
        return DURATION;
    }

    public void setDURATION(String DURATION) {
        this.DURATION = DURATION;
    }

    public Long getGENRE_ID() {
        return GENRE_ID;
    }

    public void setGENRE_ID(Long GENRE_ID) {
        this.GENRE_ID = GENRE_ID;
    }

    public Long getARTIST_ID() {
        return ARTIST_ID;
    }

    public void setARTIST_ID(Long ARTIST_ID) {
        this.ARTIST_ID = ARTIST_ID;
    }

    public Long getRECORDING_ID() {
        return RECORDING_ID;
    }

    public void setRECORDING_ID(Long RECORDING_ID) {
        this.RECORDING_ID = RECORDING_ID;
    }
}
