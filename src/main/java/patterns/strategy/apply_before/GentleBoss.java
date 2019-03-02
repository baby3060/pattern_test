package patterns.strategy.apply_before;

public class GentleBoss extends Boss {
    public GentleBoss() {
        super();
        this.setName("착한 보스");
    }

    @Override
    public void show() {
        System.out.println("얼굴만 무섭고, 조그맣다.");
    }
}