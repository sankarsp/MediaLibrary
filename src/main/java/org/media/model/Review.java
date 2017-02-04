package org.media.model;

import java.util.Date;

/**
 * Created by shantonu on 2/4/17.
 */
public class Review {
    private Long id;
    private Long reviewerId;
    private Long recordingId;
    private Long rating;
    private String review;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public Long getRecordingId() {
        return recordingId;
    }

    public void setRecordingId(Long recordingId) {
        this.recordingId = recordingId;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    public Review(){}
    public Review(Long id, Long reviewerId, Long recordingId, Long rating, String review) {
        this.id = id;
        this.reviewerId = reviewerId;
        this.recordingId = recordingId;
        this.rating = rating;
        this.review = review;
    }
}
