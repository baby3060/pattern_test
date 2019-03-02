package patterns.strategy.apply_after;

public class FlyAvoid implements AvoidAble {
    @Override
    public void avoid(Boss boss) {
        System.out.println(boss.getName() + "가 공중으로 회피합니다.");
    }
}