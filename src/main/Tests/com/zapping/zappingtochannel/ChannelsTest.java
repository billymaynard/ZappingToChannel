package com.zapping.zappingtochannel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChannelsTest {

    @Test
    @DisplayName("Canal Destino 0")
    void canaldestino0() {
        //Arrange
        Channels setofChannels = new Channels(99);
        Direction newdirection;

        //Act
        newdirection = setofChannels.closestto(0,0);

        //Assert
        assertEquals(0,newdirection.getClicks());
    }
}