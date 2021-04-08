package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

import java.awt.*;

public class getStatesFactory {

    public State getState(String color){
        if(color.equals("green")){
            return new greenState();
        }
        else if(color.equals("yellow")){
            return new yellowState();
        }
        else if(color.equals("red")){
            return new redState();
        }
        else{
            return new offState();
        }
    }
}
