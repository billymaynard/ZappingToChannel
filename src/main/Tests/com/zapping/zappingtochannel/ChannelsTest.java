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
    @Test
    @DisplayName("Canal Destino 30, Canal Actual 10")
    void test3() {
        //Arrange
        Channels setofChannels = new Channels(99);
        Direction newdirection;

        //Act
        newdirection = setofChannels.closestto(10,30);

        //Assert
        assertEquals(20,newdirection.getClicks());
    }
    @Test
    @DisplayName("Canal Destino 99, Canal Actual 2")
    void test4() {
        //Arrange
        Channels setofChannels = new Channels(99);
        Direction newdirection;

        //Act
        newdirection = setofChannels.closestto(2,99);

        //Assert
        assertEquals(2,newdirection.getClicks());
    }
    @Test
    @DisplayName("Canal Destino 63, Canal Actual 5")
    void test5() {
        //Arrange
        Channels setofChannels = new Channels(99);
        Direction newdirection;

        //Act
        newdirection = setofChannels.closestto(5,63);

        //Assert
        assertEquals(41,newdirection.getClicks());
    }
    @Test
    @DisplayName("Canal Destino 5, Canal Actual 63")
    void test6() {
        //Arrange
        Channels setofChannels = new Channels(99);
        Direction newdirection;

        //Act
        newdirection = setofChannels.closestto(63,5);

        //Assert
        assertEquals(41,newdirection.getClicks());
    }
}