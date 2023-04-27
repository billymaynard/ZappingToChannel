package com.zapping.zappingtochannel;

import javafx.scene.control.skin.TextInputControlSkin;

import java.util.ArrayList;

public class Channels {
    int numberofchannels;
    public Channels(int numberofchannels){
        this.numberofchannels = numberofchannels;
    }
    public Direction closestto(int currentchannel, int desiredchannel){
        if (desiredchannel==0 || currentchannel == 0 || desiredchannel > numberofchannels || currentchannel > numberofchannels){
            return new Direction(0,false);
        }
        Direction newdirection;
        if (currentchannel==desiredchannel){
            return new Direction(0,false);
        }else{
            int forward;
            int backwards;
            if (desiredchannel<currentchannel){
                forward = numberofchannels-currentchannel+desiredchannel;
                backwards = currentchannel-desiredchannel;
            }else{
                forward = desiredchannel-currentchannel;
                backwards = numberofchannels-desiredchannel+currentchannel;
            }
            if (forward<backwards){
                newdirection = new Direction(forward,true);
            }else{
                newdirection = new Direction(backwards,false);
            }
        }
        return newdirection;
    }
}
class Direction{
    int clicks;
    boolean Direction;
    Direction(int createclicks, boolean createdirection){
        this.clicks=createclicks;
        this.Direction=createdirection;
    }

    public int getClicks() {
        return clicks;
    }

    public String getDirection() {
        if (this.Direction){
            return "Increment";
        }else{
            return "Decrease";
        }
    }
}
