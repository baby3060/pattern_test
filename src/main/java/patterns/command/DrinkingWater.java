package patterns.command;

import java.util.*;

/**
 * 음료수를 의미하는 Enum
 */
public enum DrinkingWater {

    CIDER(0), COKE(1), FANTA(2), WELCHS(3), SPRITE(4), PEPSI(5);

    private int productId;
    private static Map<Integer, DrinkingWater> map = new HashMap<Integer, DrinkingWater>();

    DrinkingWater(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return this.productId;
    }

    public String toString() {
        String name = "";

        switch(productId) {
            case 0:
                name = "사이다";
                break;
            case 1:
                name = "콜라";
                break;
            case 2:
                name = "판타";
                break;
            case 3:
                name = "웰치스";
                break;
            case 4: 
                name = "스프라이트";
                break;
            case 5:
                name = "펩시";
                break;
            default:
                name = "";
                break;
        }

        return name;
    }

    /**
     * Enum의  경우 valueOf 기본이 매개변수가 String이어서 
     * Map에 저장한 후, Map으로 부터 읽어들어옴
     */
    static {
        for (DrinkingWater water : DrinkingWater.values()) {
            map.put(water.productId, water);
        }
    }

    public static DrinkingWater valueOf(int productId) {
        return map.get(productId);
    }

}