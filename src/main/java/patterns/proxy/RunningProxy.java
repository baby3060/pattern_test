package patterns.proxy;

public class RunningProxy implements RunningAble {
    private RunningAble real;

    public void print(String arg) {
        System.out.println("Call Proxy");
        if( real == null ) {
            real = new RunningReal();
        }
        // 실 객체의 메소드 호출
        real.print(arg);
    }
}