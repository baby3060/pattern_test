package patterns.decorator;

public class Coke extends SideMenu {
    ChickenSet set;

    public Coke(ChickenSet set) {
        this.set = set;
        menuAdd(set.menuList, MenuEnum.SIDE_COKE);
    }

    public long calcCost() {
        return set.calcCost() + 2000L;
    }
    
    public String getDescription() {
        return set.getDescription() + ", " + "콜라";
    }
}