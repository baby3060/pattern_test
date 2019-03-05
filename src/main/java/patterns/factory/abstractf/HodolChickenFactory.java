package patterns.factory.abstractf;

/**
 * 원래 타입 앞에다가 프렌차이즈 명을 넣어놨었는데, 여기서는 호돌이 치킨만 생산하므로.
 */
public class HodolChickenFactory extends ChickenFactory {
    public Chicken createChicken(String type) {
        Chicken chicken = null;
        
        RawMaFactory rawFactory = new HodolRawMaFactory();

        switch(type) {
            case "FR":
                chicken = new HodolFriedChicken(rawFactory);
                break;
            case "GAL":
                chicken = new HodolGalChicken(rawFactory);
                break;
            case "VF":
                chicken = new HodolVeryFireChicken(rawFactory);
                break;
            default:
                chicken = null;
                break;
        }

        return chicken;
    }
}