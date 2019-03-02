package patterns.strategy.apply_after;

public class BodyAttack implements AttackAble {
    @Override
    public void attack(Boss boss) {
        System.out.println(boss.getName() + "가 몸통공격합니다.");
    }
}