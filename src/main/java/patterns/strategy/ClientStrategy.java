package patterns.strategy;

import patterns.strategy.apply_after.*;

public class ClientStrategy {
    public void run() {
        /*
        Boss boss = new FlyBoss();
        
        boss.move();

        boss = new GentleBoss();

        boss.attack();
        */

        Boss boss = new GentleBoss();
        performTemplate(boss);
        
        System.out.println();

        boss = new FlyBoss();
        performTemplate(boss);

        System.out.println();

        boss = new GroundBoss();
        performTemplate(boss);
    }

    private void performTemplate(Boss boss) {
        boss.show();
        boss.performAttack();
        boss.performAvoid();
        boss.performMove();
    }
}
