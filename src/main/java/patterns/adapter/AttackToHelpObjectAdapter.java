package patterns.adapter;

/**
 * 공격 영웅(Adaptee)을 지원(Target)으로 위장
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