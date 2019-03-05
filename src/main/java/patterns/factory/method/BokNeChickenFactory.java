package patterns.factory.method;

/**
 * 원래 타입 앞에다가 프렌차이즈 명을 넣어놨었는데, 여기서는 볶네 치킨만 생산하므로.
 */
public class BokNeChickenFactory extends ChickenFactory {
    public Chicken createChicken(String type) {
        Chicken chicken = null;

        switch(type) {
            case "FIRE":
                chicken = new BokNeFireChicken();
                break;
            case "FR":
                chicken = new BokNeFriedChicken();
                break;
            case "HO":
                chicken = new BokNeHoneyChicken();
                break;
            default:
                chicken = null;
                break;
        }

        return chicken;
    }
}