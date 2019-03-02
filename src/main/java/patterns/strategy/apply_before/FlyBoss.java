package patterns.strategy.apply_before;

public class FlyBoss extends Boss {
    public FlyBoss() {
        super();
        this.setName("비행 보스");
    }
    
    @Override
    public void attack() {
    	System.out.println(this.getName() + "가 비행 공격을 한다.");
    }
    
    @Override
    public void move() {
    	System.out.println(this.getName() + "가 비행 이동을 한다.");
    }
    
    @Override
    public void avoid() {
    	System.out.println(this.getName() + "가 비행 회피를 한다.");
    }
    
    @Override
    public void show() {
        System.out.println("날개는 있지만, 발이 없는 거대한 몬스터");
    }

}