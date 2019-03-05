package patterns.factory.method;

public class NuNeFriedChicken extends Chicken {
    public NuNeFriedChicken() {
        this.name = "너네 프라이드";
    }

    @Override
    public int getPrice() {
        return 15000;
    }
}