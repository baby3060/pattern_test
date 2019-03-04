package patterns.decorator;


/**
 * 데코레이퍼 패턴 구현물 실행 클래스
 */
public class DecoratorClient {
    public void run() {
        ChickenSet set = new FriedChicken();

        System.out.println("이 세트의 가격은 : " + set.calcCost() + "이고, 구성품은 : " + set.getDescription());
        System.out.println(set.getMenuList());

        
        ChickenSet set2 = new PureFreshFriedChicken();
        set2 = new FriedChicken(set2);
        set2 = new SeasoningChickenNormal(set2);
        set2 = new Cider(set2);
        set2 = new Cider(set2);

        System.out.println("이 세트의 가격은 : " + set2.calcCost() + "이고, 구성품은 : " + set2.getDescription());
        System.out.println(set2.getMenuList());
        
    }
}