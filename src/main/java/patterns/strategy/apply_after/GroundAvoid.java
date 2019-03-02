package patterns.strategy.apply_after;

public class GroundAvoid implements AvoidAble {
    @Override
    public void avoid(Boss boss) {
        System.out.println(boss.getName() + "가 땅속으로 회피합니다.");
    }
}