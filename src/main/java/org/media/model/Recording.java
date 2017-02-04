package org.media.model;

import java.util.Date;

/**
 * Created by shantonu on 2/4/17.
 */
public class Recording {
    private Long id;
    private String title;
    private Date releaseDate;
    private Long artistId;
    private Long labelId;


    public Recording(){}
    public Recording(Long id, String title, Date releaseDate, Long artistId, Long labelId) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.artistId = artistId;
        this.labelId = labelId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }
}
