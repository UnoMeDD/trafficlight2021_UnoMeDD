package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

import java.awt.*;

public class yellowState implements State{

    private TrafficLightColor yellow = TrafficLightColor.YELLOW;

    @Override
    public void nextState(TrafficLightCtrl yellowToGreenOrRed) {
        if(yellowToGreenOrRed.getPreviousState().equals(yellowToGreenOrRed.getRedState())){
            yellowToGreenOrRed.setCurrentState(yellowToGreenOrRed.getGreenState());
        } else {
            yellowToGreenOrRed.setCurrentState(yellowToGreenOrRed.getRedState());
        }
        yellowToGreenOrRed.setPreviousState(yellowToGreenOrRed.getYellowState());
    }

    @Override
    public TrafficLightColor getState() {
        return yellow;
    }
}
