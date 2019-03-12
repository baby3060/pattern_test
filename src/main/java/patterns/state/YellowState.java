package patterns.state;

public class YellowState implements State {
    private GreenLight light;

    public YellowState(GreenLight light) {
        this.light = light;
    }

    public void redOn() {
        System.out.println("빨간불로 바뀝니다.");
        this.light.setState(this.light.getRedState());
    }
    public void greenOn() {
        System.out.println("노란불 다음에는 빨간불입니다.");
    }
    public void yellowOn() {
        System.out.println("이미 노란색 불입니다.");
    }
}