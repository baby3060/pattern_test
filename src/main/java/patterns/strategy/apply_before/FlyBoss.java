package patterns.strategy.apply_before;

public class FlyBoss extends Boss {
    public FlyBoss() {
        super();
        this.setName("비행 보스");
    }

    @Override
    public void show() {
        System.out.println("날개는 있지만, 발이 없는 거대한 몬스터");
    }

}