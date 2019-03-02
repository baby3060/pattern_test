package patterns.strategy.apply_after;

public class NoAttack implements AttackAble {
    @Override
    public void attack(Boss boss) {
        System.out.println(boss.getName() + "는 공격하지 않습니다.");
    }
}