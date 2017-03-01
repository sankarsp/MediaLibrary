package org.media.GatewayTests;

import org.junit.Before;
import org.junit.Test;
import org.media.dal.gateways.ReviewerGateway;

/**
 * Created by shantonu on 2/27/17.
 */
public class ReviewerGatewayTest {
    private ReviewerGateway aReviewerGateway;
    @Before
    public void init(){
        aReviewerGateway = new ReviewerGateway();
    }

    @Test
    public void testGetAReviewerFromDB(){

    }
    @Test
    public void testGetAllReviewerFromDB(){}
    @Test
    public void testDeleteAReviewerFromDB(){}
    @Test
    public void testInsertAReviewerFromDB(){}
    @Test
    public void testUpdateAReviewerFromDB(){}
}

