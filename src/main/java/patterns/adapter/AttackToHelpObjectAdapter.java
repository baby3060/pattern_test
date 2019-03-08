package patterns.adapter;

/**
 * 공격 영웅을 지원으로 위장
 * 객체를 활용한 어댑터
 */
public class AttackToHelpObjectAdapter implements HelpAble {
    AttackAble attackAble;

    public AttackToHelpObjectAdapter(AttackAble attackAble) {
        this.attackAble = attackAble;
    }

    public void help() {
        System.out.println("도와주는 척.");
        attackAble.attack();
    }
} 