package patterns.strategy.apply_before;

public class GroundBoss extends Boss {
    public GroundBoss() {
        super();
        this.setName("대지 보스");
    }

    @Override
    public void show() {
        System.out.println("날개 없는 거대한 몬스터");
    }
}