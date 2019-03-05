package patterns.factory.abstractf;

public class NuNeCliChicken extends Chicken {
    RawMaFactory rawMaFactory;

    public NuNeCliChicken(RawMaFactory rawMaFactory) {
        this.name = "너네 크리 치킨";
        this.rawMaFactory = rawMaFactory;
    }

    @Override
    public int getPrice() {
        return 16000;
    }

    @Override
    public void making(String type) {
        dough = rawMaFactory.createDough();
        meat = rawMaFactory.createMeat();
        oil = rawMaFactory.createOil(type);
        source = rawMaFactory.createSource(type);
    }
}