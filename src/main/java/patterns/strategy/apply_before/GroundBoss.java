package patterns.strategy.apply_before;

public class GroundBoss extends Boss {
    public GroundBoss() {
        super();
        this.setName("대지 보스");
    }

    public void fly() {
        System.out.println("대지 보스는 날개가 없어서 날 수 없다.");
    }

    @Override
    public void show() {
        System.out.println("날개 없는 거대한 몬스터");
    }
}