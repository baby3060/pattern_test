package patterns.strategy.apply_after;

public class FlyBoss extends Boss {
    public FlyBoss() {
        super();
        this.setName("비행 보스");
        setAttackAble(new FlyAttack());
        setAvoidAble(new FlyAvoid());
        setMoveAble(new FlyMove());
    }

    @Override
    public void show() {
        System.out.println("새같이 생긴 보스");
    }
}