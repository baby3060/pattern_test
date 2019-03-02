package patterns.strategy.apply_after;

public class GentleBoss extends Boss {
    public GentleBoss() {
        super();
        this.setName("착한 보스");
        setAttackAble(new NoAttack());
        setAvoidAble(new CompositeAvoid());
        setMoveAble(new NoMove());
    }

    @Override
    public void show() {
        System.out.println("생긴건 무섭지만 여린 보스");
    }

}