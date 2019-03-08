package patterns.adapter;

public class OriginalAttacker implements AttackAble {
    public void attack() {
        System.out.println("공격~");
    }
}