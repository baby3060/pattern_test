package patterns.factory.abstractf;

public class HodolGalChicken extends Chicken {
    RawMaFactory rawMaFactory;

    public HodolGalChicken(RawMaFactory rawMaFactory) {
        this.name = "호돌이 갈릭 치킨";
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