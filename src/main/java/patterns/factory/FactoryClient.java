package patterns.factory;

import patterns.factory.method.*;

import java.text.NumberFormat;

public class FactoryClient {
    public void run() {
        ChickenFactory factory = new HodolChickenFactory();

        Chicken chicken = factory.orderChicken("GAL");

        if(chicken != null) {
            print(chicken);
        }

        chicken = factory.orderChicken("VF");

        if(chicken != null) {
            print(chicken);
        }

        factory = new BokNeChickenFactory();

        chicken = factory.orderChicken("FR");

        if(chicken != null) {
            print(chicken);
        }
    }

    public void print(Chicken chicken) {
    	NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("주문하신 " + chicken.getName() + "이 나왔습니다. 요금은 " + nf.format(chicken.getPrice()) + "원 입니다.");
    }

}