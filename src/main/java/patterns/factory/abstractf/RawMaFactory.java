package patterns.factory.abstractf;

/**
 * 원재료 생성 인터페이스
 * 해당 프렌차이즈별로 반죽과 고기는 동일하게 처리하고, 기름과 소스는 다르게 처리.
 * 문자열이 아닌 Enum 형으로 해도 좋음.
 */
public interface RawMaFactory {
    public abstract Dough createDough();
    public abstract Meat createMeat();
    public abstract Oil createOil(String type);
    public abstract Source createSource(String type);
}