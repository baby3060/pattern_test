package patterns.factory.method;

/**
 * 원래 타입 앞에다가 프렌차이즈 명을 넣어놨었는데, 여기서는 호돌이 치킨만 생산하므로.
 */
public class HodolChickenFactory extends ChickenFactory {
    public Chicken createChicken(String type) {
        Chicken chicken = null;

        switch(type) {
            case "FR":
                chicken = new HodolFriedChicken();
                break;
            case "GAL":
                chicken = new HodolGalChicken();
                break;
            case "VF":
                chicken = new HodolVeryFireChicken();
                break;
            default:
                chicken = null;
                break;
        }

        return chicken;
    }
}