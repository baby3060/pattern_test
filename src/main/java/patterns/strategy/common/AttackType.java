package patterns.strategy.common;

/**
 * 공격 형태를 저장할 클래스
 * 1 : 일반 공격
 * 2 : 돌진 공격
 * 3 : 브레스 공격
 * 4 : 잡기 공격
 * 5 : 장판 공격
 * 6 : 비행 공격
 */
public enum AttackType {
	
	NORMAL(1, "NORMAL"),
    BODYCHECK(2, "BODYCHECK"),
    BLESS(3, "BLESS"),
    SLAP(4, "SLAP"),
    GROUND(5, "GROUND"),
    FLYATTACK(6, "FLYATTACK");
	
	private int typeId;
    private String typeStr;
    
    AttackType(int typeId, String typeStr) {
        this.typeId = typeId;
        this.typeStr = typeStr;
    }

    public String getTypeStr() {
    	return this.typeStr;
    }

}