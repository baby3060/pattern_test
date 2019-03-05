package patterns.factory.abstractf;

public class NuNeSeasoChicken extends Chicken {
    RawMaFactory rawMaFactory;

    public NuNeSeasoChicken(RawMaFactory rawMaFactory) {
        this.name = "너네 양념치킨";
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