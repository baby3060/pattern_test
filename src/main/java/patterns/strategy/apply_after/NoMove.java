package patterns.strategy.apply_after;

public class NoMove implements MoveAble {
    @Override
    public void move(Boss boss) {
        System.out.println(boss.getName() + "은 움직일 수 없습니다.");
    }
}