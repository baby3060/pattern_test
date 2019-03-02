package patterns.strategy;

import patterns.strategy.apply_before.*;

public class ClientStrategy {
    public void run() {
        Boss boss = new FlyBoss();
        
        boss.move();

        boss = new GentleBoss();

        boss.attack();
    }
}
