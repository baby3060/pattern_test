package patterns.factory.abstractf;

/**
 * 원래 타입 앞에다가 프렌차이즈 명을 넣어놨었는데, 여기서는 너네 치킨만 생산하므로.
 */
public class NuNeChickenFactory extends ChickenFactory {
    public Chicken createChicken(String type) {
        Chicken chicken = null;
        
        RawMaFactory rawMaFactory = new NuNeRawMaFactory();

        switch(type) {
            case "FR":
                chicken = new NuNeFriedChicken(rawMaFactory);
                break;
            case "SEA":
                chicken = new NuNeSeasoChicken(rawMaFactory);
                break;
            case "SNOW":
                chicken = new NuNeSnowChicken(rawMaFactory);
                break;
            case "CLI":
                chicken = new NuNeCliChicken(rawMaFactory);
                break;
            default:
                chicken = null;
                break;
        }

        return chicken;
    }
}