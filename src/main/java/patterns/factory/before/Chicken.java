package patterns.factory.before;

public abstract class Chicken {
    protected String name;

    public String getName() {
        return this.name;
    }

    public abstract int getPrice();

    public void packing() {
        System.out.println(this.name + " 포장중!!!!");
    }
}