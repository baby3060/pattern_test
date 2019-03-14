package patterns.proxy;

public class ProxyClient {
    public void run() {
        RunningAble proxy = new RunningProxy();

        proxy.print("Hello Proxy");
    }
}