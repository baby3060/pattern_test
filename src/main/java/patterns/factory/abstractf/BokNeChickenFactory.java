package patterns.factory.abstractf;

/**
 * 볶네 치킨을 만들 때 사용할 재료 => 볶네 치킨 매장에서 관리하는 재료로 만든다.
 */
public class BokNeChickenFactory extends ChickenFactory {
    public Chicken createChicken(String type) {
        Chicken chicken = null;

        RawMaFactory rawMaFactory = BokNeRawMaFactory.getInstance();

        switch(type) {
            case "FIRE":
                chicken = new BokNeFireChicken(rawMaFactory);
                break;
            case "FR":
                chicken = new BokNeFriedChicken(rawMaFactory);
                break;
            case "HO":
                chicken = new BokNeHoneyChicken(rawMaFactory);
                break;
            default:
                chicken = null;
                break;
        }

        return chicken;
    }
}