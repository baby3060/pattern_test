package patterns.strategy.apply_before;

public class GentleBoss extends Boss {
    public GentleBoss() {
        super();
        this.setName("착한 보스");
    }

    @Override
    public void attack() {
        System.out.println("착한 보스는 캐릭터의 콤보를 시험하기 위해 존재하므로, 공격할 수 없다.");
    }

    @Override
    public void show() {
        System.out.println("얼굴만 무섭고, 조그맣다.");
    }
}