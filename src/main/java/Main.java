/*
 * 항상 실행되는 클래스
 * 각 패턴 패키지의 Client[Pattern명] 클래스를 수행한다.
 */

import patterns.decorator.*;

public class Main {
    public static void main(String... args) {
        DecoratorClient client = new DecoratorClient();

        client.run();
    }
}