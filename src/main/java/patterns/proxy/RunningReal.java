package patterns.proxy;

public class RunningReal implements RunningAble {

    public void print(String arg) {
        System.out.println("Call Real " + arg);
    }
}