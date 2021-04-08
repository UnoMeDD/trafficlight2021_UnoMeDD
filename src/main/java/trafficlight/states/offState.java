package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

import java.awt.*;

public class offState implements State{

    private TrafficLightColor off = TrafficLightColor.OFF;

    @Override
    public void nextState(TrafficLightCtrl offToRed) {
        offToRed.setCurrentState(offToRed.getRedState());
    }

    @Override
    public TrafficLightColor getState() {
        return off;
    }
}
