package patterns.factory;

import patterns.factory.before.*;

import java.text.NumberFormat;

public class FactoryClient {
    public void run() {
        ChickenStore store = new ChickenStore();

        Chicken chicken = store.orderChicken("HODOL_VF");

        if(chicken != null) {
            print(chicken);
        }
    }

    public void print(Chicken chicken) {
    	NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("주문하신 " + chicken.getName() + "이 나왔습니다. 요금은 " + nf.format(chicken.getPrice()) + "원 입니다.");
    }

}