package patterns.factory.abstractf;

public class BokNeFireChicken extends Chicken {
    RawMaFactory rawMaFactory;

    public BokNeFireChicken(RawMaFactory rawMaFactory) {
        this.name = "볶네 불타오르는 치킨";
        this.rawMaFactory = rawMaFactory;
    }

    @Override
    public int getPrice() {
        return 16700;
    }

    @Override
    public void making(String type) {
        dough = rawMaFactory.createDough();
        meat = rawMaFactory.createMeat();
        oil = rawMaFactory.createOil(type);
        source = rawMaFactory.createSource(type);
    }

}