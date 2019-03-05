package patterns.factory.abstractf;

/**
 * 치킨 상세 내역
 * 팩토리 메소드 패턴에서는 단순히 만들어졌다는 것만 표현했으나
 * 추상 팩토리 패턴에서는 팩토리 메소드 패턴을 이용해 치킨을 만들고,
 * 그 치킨이 어떤 재료들로 만들어졌는지도 표현한다.
 */
public abstract class Chicken {
    protected String name;
    protected Dough dough;
    protected Oil oil;
    protected Meat meat;
    protected Source source;

    public abstract void making(String type);
    public abstract int getPrice();
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        StringBuilder retStr = new StringBuilder();

        retStr.append("주문 받은 " + this.name + " 명세 : \n ");
        if(dough == null) {

        } else {
            retStr.append(" 소스 : " + dough.toString() + " \n");
        }

        if(oil == null) {

        } else {
            retStr.append(", 기름 : " + oil.toString() + " \n");
        }

        if(meat == null) {

        } else {
            retStr.append(", 고기 : " + meat.toString() + " \n");
        }

        if(source == null) {

        } else {
            retStr.append(", 소스 : " + source.toString() + " \n");
        }


        return retStr.toString();
    }

    public void packing() {
        System.out.println(this.name + " 포장중!!!!");
    }

}