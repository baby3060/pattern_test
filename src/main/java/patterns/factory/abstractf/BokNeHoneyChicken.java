package patterns.factory.abstractf;

public class BokNeHoneyChicken extends Chicken {
    RawMaFactory rawMaFactory;

    public BokNeHoneyChicken(RawMaFactory rawMaFactory) {
        this.name = "볶네 꿀";
        this.rawMaFactory = rawMaFactory;
    }

    @Override
    public int getPrice() {
        return 16500;
    }
    
    @Override
    public void making(String type) {
        dough = rawMaFactory.createDough();
        meat = rawMaFactory.createMeat();
        oil = rawMaFactory.createOil(type);
        source = rawMaFactory.createSource(type);
    }
}