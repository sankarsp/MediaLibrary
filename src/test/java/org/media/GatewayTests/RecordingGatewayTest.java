package org.media.GatewayTests;

import org.junit.Before;
import org.junit.Test;
import org.media.dal.gateways.RecordingGateway;

/**
 * Created by shantonu on 2/26/17.
 */
public class RecordingGatewayTest {
    private RecordingGateway aRecordingGateway;
    @Before
    public void init(){
        aRecordingGateway = new RecordingGateway();
    }

    @Test
    public void testGetARecordingFromDB(){

    }
    @Test
    public void testGetAllRecordingFromDB(){}
    @Test
    public void testDeleteARecordingFromDB(){}
    @Test
    public void testInsertARecordingFromDB(){}
    @Test
    public void testUpdateARecordingFromDB(){}
}
