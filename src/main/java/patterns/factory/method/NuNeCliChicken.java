package patterns.factory.method;

public class NuNeCliChicken extends Chicken {
    public NuNeCliChicken() {
        this.name = "너네 크리 치킨";
    }

    @Override
    public int getPrice() {
        return 16000;
    }
}