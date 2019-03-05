package patterns.factory.method;

public class HodolGalChicken extends Chicken {
    public HodolGalChicken() {
        this.name = "호돌이 갈릭 치킨";
    }

    @Override
    public int getPrice() {
        return 15300;
    }
}