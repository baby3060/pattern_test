package patterns.factory.before;

public class NuNeSnowChicken extends Chicken {
    public NuNeSnowChicken() {
        this.name = "너네 눈 치킨";
    }

    @Override
    public int getPrice() {
        return 18000;
    }
}