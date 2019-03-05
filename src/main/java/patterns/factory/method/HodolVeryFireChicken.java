package patterns.factory.method;

public class HodolVeryFireChicken extends Chicken {
    public HodolVeryFireChicken() {
        this.name = "호돌이 입천장 날아오르네 치킨";
    }

    @Override
    public int getPrice() {
        return 18000;
    }
}