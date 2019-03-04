package patterns.decorator;

public class Cider extends SideMenu {
    ChickenSet set;

    public Cider(ChickenSet set) {
        this.set = set;
        menuAdd(set.menuList, MenuEnum.SIDE_CD);
    }

    public long calcCost() {
        return set.calcCost() + 1500L;
    }
    
    public String getDescription() {
        return set.getDescription() + ", " + "사이다";
    }
}