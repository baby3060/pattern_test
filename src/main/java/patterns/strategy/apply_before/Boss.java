package patterns.strategy.apply_before;

public abstract class Boss {
    private String name;

    public void attack() {
        System.out.println(this.name + "가 플레이어를 공격");
    }

    public void move() {
        System.out.println(this.name + "가 움직입니다.");
    }
    
    public void avoid() {
    	System.out.println(this.name + "가 회피한다.");
    }
    
    public String getName() {
    	return this.name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    
    public abstract void show();
}