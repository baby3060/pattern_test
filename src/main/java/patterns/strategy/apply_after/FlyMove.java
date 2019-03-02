package patterns.strategy.apply_after;

public class FlyMove implements MoveAble {
    @Override
    public void move(Boss boss) {
        System.out.println(boss.getName() + "가 공중으로 이동하였습니다.");
    }
}