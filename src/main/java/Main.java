/*
 * 항상 실행되는 클래스
 * 각 패턴 패키지의 Client[Pattern명] 클래스를 수행한다.
 */

import patterns.tempmethod.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String... args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        
        logger.info("=================Start===================");

        TempClient client = new TempClient();

        client.run();

        logger.info("=================End===================");
        
    }
}