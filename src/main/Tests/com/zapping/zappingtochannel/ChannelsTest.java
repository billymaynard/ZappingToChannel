package com.zapping.zappingtochannel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChannelsTest {

    @Test
    @DisplayName("Canal Destino 0")
    void test1() {
        //Arrange
        Channels setofChannels = new Channels(99);
        Direction newdirection;

        //Act
        newdirection = setofChannels.closestto(0,0);

        //Assert
        assertEquals(0,newdirection.getClicks());
    }
    @Test
    @DisplayName("Canal Destino 2, Canal Actual 1")
    void test2() {
        //Arrange
        Channels setofChannels = new Channels(99);
        Direction newdirection;

        //Act
        newdirection = setofChannels.closestto(1,2);

        //Assert
        assertEquals(1,newdirection.getClicks());
    }
}