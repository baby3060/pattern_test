package patterns.factory.before;

public class HodolFriedChicken extends Chicken {
    public HodolFriedChicken() {
        this.name = "호돌이 프라이드 치킨";
    }

    @Override
    public int getPrice() {
        return 15300;
    }
}