package patterns.strategy.apply_after;

public class GroundMove implements MoveAble {
    @Override
    public void move(Boss boss) {
        System.out.println(boss.getName() + "가 지상에서 횡열로 이동하였습니다.");
    }
}