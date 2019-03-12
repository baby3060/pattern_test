package patterns.state;

public class RedState implements State {
    private GreenLight light;

    public RedState(GreenLight light) {
        this.light = light;
    }

    public void redOn() {
        System.out.println("이미 빨간불입니다.");
    }

    public void greenOn() {
        System.out.println("초록불로 바뀝니다.");
        this.light.setState(this.light.getGreenState());
    }

    public void yellowOn() {
        System.out.println("빨간불 다음에는 초록불입니다.");
    }
}