package patterns.strategy.apply_after;

public class CompositeAvoid implements AvoidAble {
    @Override
    public void avoid(Boss boss) {
        System.out.println(boss.getName() + "가 복합적으로 회피합니다.");
    }
}