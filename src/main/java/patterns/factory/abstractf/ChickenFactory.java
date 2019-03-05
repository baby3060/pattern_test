package patterns.factory.abstractf;

/**
 * 팩토리 메소드 패턴에서는 객체 생성에 대한 권한을 추상 팩토리의 서브 클래스에 맡긴다.
 * 프렌차이즈 업체별로 만들어서 나온다고 해석한다. => 너네 치킨을 볶네 치킨 사의 요리사가 만드는 건 이상하다.
 */
public abstract class ChickenFactory {
    public Chicken orderChicken(String type) {
        Chicken chicken = createChicken(type);

        if(chicken == null) {
            System.out.println("반환된 치킨이 없습니다.");
        } else {
            chicken.packing();
            chicken.making(type);
        }
        
        return chicken;
    }

    public abstract Chicken createChicken(String type);

}