package patterns.factory.before;

public class BokNeFriedChicken extends Chicken {
    public BokNeFriedChicken() {
        this.name = "볶네 프라이드";
    }

    @Override
    public int getPrice() {
        return 15000;
    }
}