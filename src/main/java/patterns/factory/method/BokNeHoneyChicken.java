package patterns.factory.method;

public class BokNeHoneyChicken extends Chicken {
    public BokNeHoneyChicken() {
        this.name = "볶네 꿀";
    }

    @Override
    public int getPrice() {
        return 16500;
    }
}