package org.media.GatewayTests;

import org.junit.Before;
import org.junit.Test;
import org.media.dal.gateways.ReviewGateway;

/**
 * Created by shantonu on 2/27/17.
 */
public class ReviewGatewayTest {

    private ReviewGateway aReviewGateway;
    @Before
    public void init(){
        aReviewGateway = new ReviewGateway();
    }
    @Test
    public void testGetAReviewFromDB(){

    }
    @Test
    public void testGetAllReviewFromDB(){}
    @Test
    public void testDeleteAReviewFromDB(){}
    @Test
    public void testInsertAReviewFromDB(){}
    @Test
    public void testUpdateAReviewFromDB(){}
}
