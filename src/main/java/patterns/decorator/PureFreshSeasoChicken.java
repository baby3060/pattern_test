package patterns.decorator;

/**
 * 순살 양념 치킨
 */
public class PureFreshSeasoChicken extends ChickenSet {
    ChickenSet set;

    public PureFreshSeasoChicken() { 
        menuAdd(this.menuList, MenuEnum.PFFC);
    }

    public PureFreshSeasoChicken(ChickenSet set) {
        this.set = set;
        menuAdd(set.menuList, MenuEnum.PFSC);
    }

    public long calcCost() {
        long temp = 0L;

        if(set == null) {
        } else {
            temp = set.calcCost();
        }
        return temp + 19000L;
    }
    
    public String getDescription() {
        String temp = "";

        if(set == null) {
        } else {
            temp = set.getDescription() + ", ";
        }

        return temp + "순살 양념 치킨";
    }
}