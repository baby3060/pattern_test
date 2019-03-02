package patterns.strategy.apply_before;

public class FlyGroundBoss extends Boss {
    public FlyGroundBoss() {
        super();
        this.setName("대륙양용 보스");
    }

    @Override
    public void show() {
        System.out.println("날개도 있고 발도 있는 거대한 몬스터");
    }
}