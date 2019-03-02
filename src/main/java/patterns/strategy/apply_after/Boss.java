package patterns.strategy.apply_after;

public abstract class Boss {
    private AttackAble attFace;
    private AvoidAble avoidFace;
    private MoveAble moveFace;

    public void setAttackAble(AttackAble attFace) {
        this.attFace = attFace;
    }

    public void setAvoidAble(AvoidAble avoidFace) {
        this.avoidFace = avoidFace;
    }

    public void setMoveAble(MoveAble moveFace) {
        this.moveFace = moveFace;
    }

    public void performAttack() {
        attFace.attack(this);
    }

    public void performAvoid() {
        avoidFace.avoid(this);
    }

    public void performMove() {
        moveFace.move(this);
    }

    private String name;

    public String getName() {
    	return this.name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    
    public abstract void show();
}