package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

import java.awt.*;

public class redState implements State{

    private TrafficLightColor red = TrafficLightColor.RED;

    @Override
    public void nextState(TrafficLightCtrl redToYellow) {
        redToYellow.setPreviousState(redToYellow.getRedState());
        redToYellow.setCurrentState(redToYellow.getYellowState());
    }

    @Override
    public TrafficLightColor getState() {
        return red;
    }
}
