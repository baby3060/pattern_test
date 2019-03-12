package patterns.state;

public class GreenState implements State {
    private GreenLight light;

    public GreenState(GreenLight light) {
        this.light = light;
    }

    public void redOn() {
        System.out.println("초록색 불 다음에는 노란불입니다.");
    }
    public void greenOn() {
        System.out.println("이미 초록색 불입니다.");
    }
    public void yellowOn() {
        System.out.println("노란불로 바뀝니다.");
        this.light.setState(this.light.getYellowState());
    }
}