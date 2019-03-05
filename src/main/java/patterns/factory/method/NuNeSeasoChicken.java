package patterns.factory.method;

public class NuNeSeasoChicken extends Chicken {
    public NuNeSeasoChicken() {
        this.name = "너네 양념치킨";
    }

    @Override
    public int getPrice() {
        return 16000;
    }
}