package patterns.adapter;

/**
 * 일반 공격 영웅(Adaptee)을 지원(Target)으로 위장
 * 클래스를 활용한 어댑터
 */
public class AttackerToHelpClassAdapter extends OriginalAttacker implements HelpAble {
    public void help() {
        System.out.println("도와주는 척.");
        this.attack();
    }

    @Override
    public void attack() {
        System.out.println("공격!!!!!!!!!!!!!!!!!!!!!");
    }
}