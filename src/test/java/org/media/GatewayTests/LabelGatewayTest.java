package org.media.GatewayTests;

import org.junit.Before;
import org.junit.Test;
import org.media.dal.gateways.LabelGateway;


/**
 * Created by shantonu on 2/25/17.
 */
public class LabelGatewayTest {
    private LabelGateway aLabelGateway;
    @Before
    public void init(){
        aLabelGateway = new LabelGateway();
    }

    @Test
    public void testGetALabelFromDB(){

    }
    @Test
    public void testGetAllLabelFromDB(){}
    @Test
    public void testDeleteALabelFromDB(){}
    @Test
    public void testInsertALabelFromDB(){}
    @Test
    public void testUpdateALabelFromDB(){}
}
