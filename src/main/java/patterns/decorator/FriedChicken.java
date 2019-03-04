package patterns.decorator;

/**
 * 일반 프라이드 치킨을 의미
 */
public class FriedChicken extends ChickenSet {
    ChickenSet set;

    public FriedChicken() { 
        menuAdd(this.menuList, MenuEnum.FCN);
    }

    public FriedChicken(ChickenSet set) {
        this.set = set;
        menuAdd(set.menuList, MenuEnum.FCN);
    }

    public long calcCost() {
        long temp = 0L;

        if(set == null) {
        } else {
            temp = set.calcCost();
        }
        return temp + 12000L;
    }
    
    public String getDescription() {
        String temp = "";

        if(set == null) {
        } else {
            temp = set.getDescription() + ", ";
        }

        return temp + "프라이드 치킨";
    }
}