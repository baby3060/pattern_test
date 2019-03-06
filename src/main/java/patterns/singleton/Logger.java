package patterns.singleton;

/**
 * 싱글톤은 객체가 무조건 하나임을 의미함.
 * 싱글톤으로 생각할 만한 클래스는 쓰레드 풀, 커넥션 풀, Factory 패턴에서의 Factory 메소드들, 공통 Logger
 */
public class Logger {
    private Class target;
    private volatile static Logger logger;

    private Logger() {
        this(Logger.class);
    }

    private Logger(Class target) {
        this.target = target;
    }

    public static Logger getLogger(Class target) {
        if( logger == null ) {
            // 쓰레드 동기화 시 => 속도가 느리다.
            /*
            syncronized(Logger.class) {
                logger = new Logger(target);
            }
            */
            logger = new Logger(target);
        }
        return logger;
    }

    public void info(String msg) {
        System.out.println(target.getName() + "[INFO] : " + msg);
    }

    public void debug(String msg) {
        System.out.println(target.getName() + "[DEBUG] : " + msg);
    }

}