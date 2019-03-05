package patterns.factory.abstractf;

public class NuNeSnowChicken extends Chicken {
    RawMaFactory rawMaFactory;

    public NuNeSnowChicken(RawMaFactory rawMaFactory) {
        this.name = "너네 눈 치킨";
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