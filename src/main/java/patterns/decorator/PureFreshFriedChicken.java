package patterns.decorator;

/**
 * 순살 프라이드 치킨을 의미
 */
public class PureFreshFriedChicken extends ChickenSet {
    ChickenSet set;

    public PureFreshFriedChicken() { 
        menuAdd(this.menuList, MenuEnum.PFFC);
    }

    public PureFreshFriedChicken(ChickenSet set) {
        this.set = set;
        menuAdd(set.menuList, MenuEnum.PFFC);
    }

    public long calcCost() {
        long temp = 0L;

        if(set == null) {
        } else {
            temp = set.calcCost();
        }
        return temp + 15000L;
    }
    
    public String getDescription() {
        String temp = "";

        if(set == null) {
        } else {
            temp = set.getDescription() + ", ";
        }

        return temp + "순살 프라이드 치킨";
    }
}