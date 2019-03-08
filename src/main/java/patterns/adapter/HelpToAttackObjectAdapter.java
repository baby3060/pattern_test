package patterns.adapter;

/**
 * 지원 영웅을 공격으로 위장
 * 객체를 활용한 어댑터
 */
public class HelpToAttackObjectAdapter implements AttackAble {
    HelpAble helpAble;

    public HelpToAttackObjectAdapter(HelpAble helpAble) {
        this.helpAble = helpAble;
    }

    public void attack() {
        System.out.println("공격~~");
        helpAble.help();
    }
} 