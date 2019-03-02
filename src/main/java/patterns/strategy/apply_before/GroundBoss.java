package patterns.strategy.apply_before;

public class GroundBoss extends Boss {
    public GroundBoss() {
        super();
        this.setName("대지 보스");
    }
    
    @Override
    public void attack() {
    	System.out.println(this.getName() + "가 브레스 공격을 한다.");
    }
    
    @Override
    public void move() {
    	System.out.println(this.getName() + "가 육지 이동을 한다.");
    }
    
    @Override
    public void avoid() {
    	System.out.println(this.getName() + "가 육지 회피를 한다.");
    }
    
    @Override
    public void show() {
        System.out.println("날개 없는 거대한 몬스터");
    }
}