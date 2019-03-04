package patterns.decorator;

public enum MenuEnum {
    FCN("FriedChicken", "프라이드 치킨"),
    SCN("SeasoningChickenNormal", "양념 치킨"),
    PFFC("PureFreshFriedChicken", "순살 프라이드 치킨"),
    PFSC("PureFreshSeasoChicken", "순살 양념 치킨"),
    SIDE_CD("Cider", "사이다"),
    SIDE_COKE("Coke", "코카콜라");

    private String menuId;
    private String menuNm;

    MenuEnum(String menuId, String menuNm) {
        this.menuId = menuId;
        this.menuNm = menuNm;
    }

    public String toString() {
        return this.menuNm;
    }
}