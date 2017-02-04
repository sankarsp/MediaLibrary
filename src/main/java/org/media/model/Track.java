package org.media.model;



/**
 * Created by shantonu on 2/4/17.
 */
public class Track {
    private Long id;
    private String title;
    private String duration;
    private Long genreId;
    private Long artistId;
    private Long recordingId;
    public Track(){}
    public Track(Long id, String title, String duration, Long genreId, Long artistId, Long recordingId) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.genreId = genreId;
        this.artistId = artistId;
        this.recordingId = recordingId;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public Long getRecordingId() {
        return recordingId;
    }

    public void setRecordingId(Long recordingId) {
        this.recordingId = recordingId;
    }
}
