package patterns.factory.abstractf;

public class HodolFriedChicken extends Chicken {
    RawMaFactory rawMaFactory;

    public HodolFriedChicken(RawMaFactory rawMaFactory) {
        this.name = "호돌이 프라이드 치킨";
        this.rawMaFactory = rawMaFactory;
    }

    @Override
    public int getPrice() {
        return 15300;
    }
    
    @Override
    public void making(String type) {
        dough = rawMaFactory.createDough();
        meat = rawMaFactory.createMeat();
        oil = rawMaFactory.createOil(type);
        source = rawMaFactory.createSource(type);
    }
}