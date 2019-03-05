package patterns.factory.before;

public class BokNeFireChicken extends Chicken {
    public BokNeFireChicken() {
        this.name = "볶네 불타오르는 치킨";
    }

    @Override
    public int getPrice() {
        return 16700;
    }
}