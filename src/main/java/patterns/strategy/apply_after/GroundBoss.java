package patterns.strategy.apply_after;

public class GroundBoss extends Boss {
    public GroundBoss() {
        super();
        this.setName("대지 보스");
        setAttackAble(new BodyAttack());
        setAvoidAble(new GroundAvoid());
        setMoveAble(new GroundMove());
    }
    
    @Override
    public void show() {
        System.out.println("공룡같이 생긴 거대한 보스");
    }
}