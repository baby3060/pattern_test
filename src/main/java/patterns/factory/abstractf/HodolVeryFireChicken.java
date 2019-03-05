package patterns.factory.abstractf;

public class HodolVeryFireChicken extends Chicken {
    RawMaFactory rawMaFactory;

    public HodolVeryFireChicken(RawMaFactory rawMaFactory) {
        this.name = "호돌이 입천장 날아오르네 치킨";
        this.rawMaFactory = rawMaFactory;
    }

    @Override
    public int getPrice() {
        return 18000;
    }
    
    @Override
    public void making(String type) {
        dough = rawMaFactory.createDough();
        meat = rawMaFactory.createMeat();
        oil = rawMaFactory.createOil(type);
        source = rawMaFactory.createSource(type);
    }
}