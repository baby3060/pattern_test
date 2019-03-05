package patterns.factory.before;

/**
 * Chicken 점포
 * 치킨을 주문 받고, 치킨이 만들어지고 나면, 그 치킨의 포장을 해준다.
 * orderChicken 메소드에 일단은 딱 10개만 적용해놨는데 소스가 보기 어렵다.
 * 주문 코드라던가 이런게 변경되면 어떻게 될까?
 * 이제 캡슐화가 필요할 것 같다.
 */
public class ChickenStore {
    public Chicken orderChicken(String type) {
        Chicken chicken = null;

        switch(type) {
            case "NUNE_FR":
                chicken = new NuNeFriedChicken();
                break;
            case "NUNE_SEA":
                chicken = new NuNeSeasoChicken();
                break;
            case "NUNE_SNOW":
                chicken = new NuNeSnowChicken();
                break;
            case "NUNE_CLI":
                chicken = new NuNeCliChicken();
                break;
            case "BOKNE_FIRE":
                chicken = new BokNeFireChicken();
                break;
            case "BOKNE_FR":
                chicken = new BokNeFriedChicken();
                break;
            case "BOKNE_HO":
                chicken = new BokNeHoneyChicken();
                break;
            case "HODOL_FR":
                chicken = new HodolFriedChicken();
                break;
            case "HODOL_GAL":
                chicken = new HodolGalChicken();
                break;
            case "HODOL_VF":
                chicken = new HodolVeryFireChicken();
                break;
            default:
                chicken = null;
                break;
        }

        if(chicken == null) {
            System.out.println("반환된 치킨이 없습니다.");
        } else {
            chicken.packing();
        }
        
        return chicken;
    }

    public void returnningChicken(Chicken chicken) {
        
    }
}