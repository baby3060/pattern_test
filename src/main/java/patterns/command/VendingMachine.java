package patterns.command;

import java.util.*;

/**
 * 벤딩머신 클래스
 * Invoker 역할
 */
public class VendingMachine {
    private List<InsertDrinking> list;

    private int insertMoney;

    public void init() {
        Set<InsertDrinking> set = new HashSet<InsertDrinking>();

        InsertDrinking temp = null;
        DrinkingWater water = null;

        for( int i = 0; i < 6; i++ ) {
            water = DrinkingWater.valueOf(i);
            
            temp = new InsertDrinking(water);
            temp.setPrice(randomPrice());
            temp.setStock(randomStock());

            set.add(temp);
        }   

        list = new ArrayList<InsertDrinking>(set);

        insertMoney = randomMoney();

        System.out.println("투입 금액 : " + insertMoney);
    }

    public void pick(DrinkingWater waterType) {
        System.out.println(waterType + "을 뽑겠습니다.");
        InsertDrinking saveData = list.get(waterType.getProductId());

        if( insertMoney <= 0 ) {
            System.out.println("돈이 투입되어 있지 않습니다.");
        } else {
            if( saveData.getStock() <= 0 ) {
                System.out.println(waterType + "의 재고가 남아있지 않습니다.");
            } else {
                InsertDrinking temp = list.get(waterType.getProductId());

                if( insertMoney >= temp.getPrice() ) {
                    
                    Picker picker = getPicker(waterType);

                    picker.pick(waterType);
        
                    temp.setStock(temp.getStock() - 1);
        
                    System.out.println(waterType + "의 재고가 1 감소하였습니다(" + temp.getStock() + ").");
        
                    System.out.println(list);
        
                    insertMoney -= temp.getPrice();

                    System.out.println("남은 돈 : " + insertMoney);
                } else {
                    System.out.println("남은 돈(" + insertMoney + ")으로는 해당 음료수(" + waterType + " : " + temp.getPrice() + ")를 뽑을 수 없습니다.");
                }
            }
        }
    }

    private int randomMoney() {
        return ((int)(((Math.random() * (600 + 1)) + 5000 ) / 100)) * 100;
    }

    private int randomPrice() {
        return ((int)(((Math.random() * (600 + 1)) + 1000 ) / 100)) * 100;
    }

    private int randomStock() {
        return ((int)(Math.random() * (20 + 1)) + 15);
    }

    public Picker getPicker(DrinkingWater waterType) {
        Picker picker = null;

        switch(waterType) {
            case CIDER:
                picker = new CiderPicker();
                break;
            case COKE:
                picker = new CokePicker();
                break;
            case PEPSI:
                picker = new PepsiPicker();
                break;
            case WELCHS:
                picker = new WelchsPicker();
                break;
            case SPRITE:
                picker = new SpritePicker();
                break;
            case FANTA:
                picker = new FantaPicker();
                break;
        }

        return picker;
    }
    
}