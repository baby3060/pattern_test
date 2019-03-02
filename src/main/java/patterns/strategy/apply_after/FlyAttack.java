package patterns.strategy.apply_after;

public class FlyAttack implements AttackAble {
    @Override
    public void attack(Boss boss) {
        System.out.println(boss.getName() + "가 비행공격합니다.");
    }
}