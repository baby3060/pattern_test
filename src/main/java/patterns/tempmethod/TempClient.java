package patterns.tempmethod;

public class TempClient {
    public void run() {
        Bread bread = new MelonBread();
        bread.making();

        System.out.println();

        bread = new Baguette();
        bread.making();
    }
}