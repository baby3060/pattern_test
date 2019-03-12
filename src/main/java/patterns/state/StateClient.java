package patterns.state;

public class StateClient {
    public void run() {
        GreenLight light = new GreenLight();

        System.out.println(light);

        light.redOn();

        light.yellowOn();
        System.out.println(light);

        light.redOn();

        System.out.println(light);

        light.redOn();

        light.greenOn();

        System.out.println(light);
    }
}