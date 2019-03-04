package patterns.decorator;

/**
 * 일반 양념 치킨을 의미
 */
public class SeasoningChickenNormal extends ChickenSet {
    ChickenSet set;

    public SeasoningChickenNormal() { 
        menuAdd(this.menuList, MenuEnum.SCN);
    }

    public SeasoningChickenNormal(ChickenSet set) {
        this.set = set;
        menuAdd(set.menuList, MenuEnum.SCN);
    }

    public long calcCost() {
        long temp = 0L;

        if(set == null) {
        } else {
            temp = set.calcCost();
        }
        return temp + 14000L;
    }
    
    public String getDescription() {
        String temp = "";

        if(set == null) {
        } else {
            temp = set.getDescription() + ", ";
        }

        return temp + "양념 치킨";
    }
}