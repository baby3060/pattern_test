package patterns.factory;

import patterns.factory.abstractf.*;

import java.text.NumberFormat;

public class FactoryClient {
    public void run() {
        ChickenFactory factory = new BokNeChickenFactory();

        Chicken chicken = factory.orderChicken("FIRE");

        if(chicken != null) {
            print(chicken);
            System.out.println(chicken);
        }

        chicken = factory.orderChicken("HO");

        if(chicken != null) {
            print(chicken);
            System.out.println(chicken);
        }

        factory = new HodolChickenFactory();

        chicken = factory.orderChicken("GAL");

        if(chicken != null) {
            print(chicken);
            System.out.println(chicken);
        }

        chicken = factory.orderChicken("VF");

        if(chicken != null) {
            print(chicken);
            System.out.println(chicken);
        }

        factory = new NuNeChickenFactory();

        chicken = factory.orderChicken("SEA");

        if(chicken != null) {
            print(chicken);
            System.out.println(chicken);
        }

        chicken = factory.orderChicken("CLI");

        if(chicken != null) {
            print(chicken);
            System.out.println(chicken);
        }


    }

    public void print(Chicken chicken) {
    	NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("주문하신 " + chicken.getName() + "이 나왔습니다. 요금은 " + nf.format(chicken.getPrice()) + "원 입니다.");
    }

}