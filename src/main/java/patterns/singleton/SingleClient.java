package patterns.singleton;

public class SingleClient {
    public void run() {
        Logger logger = Logger.getLogger(SingleClient.class);

        logger.info("Hello Info");
        logger.debug("Hello debug");
    }
}