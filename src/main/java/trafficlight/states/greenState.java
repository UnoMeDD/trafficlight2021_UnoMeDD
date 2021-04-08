package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

import java.awt.*;

public class greenState implements State{

    private TrafficLightColor green = TrafficLightColor.GREEN;

    @Override
    public void nextState(TrafficLightCtrl greenToYellow) {
        greenToYellow.setPreviousState(greenToYellow.getGreenState());
        greenToYellow.setCurrentState(greenToYellow.getYellowState());
    }

    @Override
    public TrafficLightColor getState() {
        return green;
    }
}
