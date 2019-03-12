package patterns.state;

public class GreenLight {
    private RedState redState;
    private GreenState greenState;
    private YellowState yellowState;

    private State state;

    public GreenLight() {
        redState = new RedState(this);
        greenState = new GreenState(this);
        yellowState = new YellowState(this);

        state = greenState;
    }

    public void redOn() {
        this.state.redOn();
    }

    public void greenOn() {
        this.state.greenOn();
    }

    public void yellowOn() {
        this.state.yellowOn();
    }

    public State getRedState() {
        return this.redState;
    }

    public State getGreenState() {
        return this.greenState;
    }

    public State getYellowState() {
        return this.yellowState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String toString() {
        String result = "";

        if( state == redState  ) {
            result = "현재 신호는 빨간불입니다.";
        } else if(state == greenState) {
            result = "현재 신호는 초록불입니다.";
        } else {
            result = "현재 신호는 노란불입니다.";
        }

        return result;
    }
}