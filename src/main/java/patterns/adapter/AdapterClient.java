package patterns.adapter;

/**
 * 구현하는 인터페이스(추상 클래스)를 둔갑
 */
public class AdapterClient {
    public void run() {
        /**
         * 공격자를 지원가로 속임
         * Target : Main에서 필요한 객체타입(HelpAble), Adaptee(바꿔야 하는 타입) : AttackAble
         */
        AttackAble originalAttacker = new OriginalAttacker();
        HelpAble fakeHelper = new AttackToHelpObjectAdapter(originalAttacker);

        fakeHelper.help();

        System.out.println( "fakeHelper는 공격자? " + (fakeHelper instanceof AttackAble));
        

        /**
         * 지원가를 공격자로 속임
         */
        HelpAble helper = new DisguiseHelper();
        AttackAble fakeAttacker = new HelpToAttackObjectAdapter(helper);
        fakeAttacker.attack();

        System.out.println( "fakeAttacker는 지원가? " + (fakeAttacker instanceof HelpAble));

        /**
         * 원래 공격자였다가, 지원가로 바꿔버렸는데, 그것을 다시 공격가로 바꾸면?
         * AttackAble => HelpAble => AttackAble?
         */
        AttackAble attacker = new HelpToAttackObjectAdapter(fakeHelper);

        attacker.attack();

        System.out.println("attacker는 지원가? " + (attacker instanceof HelpAble) + ", attacker는 공격자?" + (attacker instanceof AttackAble));

        HelpAble classHelper = new AttackerToHelpClassAdapter();
        classHelper.help();

        System.out.println("classHelper는 지원가? " + (classHelper instanceof HelpAble) + ", classHelper는 공격자?" + (classHelper instanceof AttackAble));

        AttackAble originalAttacker2 =  new AttackerToHelpClassAdapter();
        originalAttacker2.attack();

        System.out.println("originalAttacker2는 지원가? " + (originalAttacker2 instanceof HelpAble) + ", originalAttacker2는 공격자?" + (classHelper instanceof AttackAble));
    }
}