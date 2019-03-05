package patterns.factory.abstractf;

public class BokNeFriedChicken extends Chicken {
    RawMaFactory rawMaFactory;

    public BokNeFriedChicken(RawMaFactory rawMaFactory) {
        this.name = "볶네 프라이드";
        this.rawMaFactory = rawMaFactory;
    }

    @Override
    public int getPrice() {
        return 15000;
    }
    
    @Override
    public void making(String type) {
        dough = rawMaFactory.createDough();
        meat = rawMaFactory.createMeat();
        oil = rawMaFactory.createOil(type);
    }
}