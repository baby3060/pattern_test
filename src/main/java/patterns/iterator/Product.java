package patterns.iterator;

public class Product {
    private String uniqCd;
    private String itemNm;
    private String itemGubun;
    private int price;

    public Product(String uniqCd, String itemNm, String itemGubun, int price) {
        this.uniqCd = uniqCd;
        this.itemNm = itemNm;
        this.itemGubun = itemGubun;
        this.price = price;
    }

    public String getUniqCd() {
        return this.uniqCd;
    }

    public String getItemGubun() {
        return this.itemGubun;
    }

    @Override
    public String toString() {
        String gubNm = "";
        if( itemGubun.equals("1") ) {
            gubNm = "과자";
        } else {
            gubNm = "음료";
        }
        return itemNm + "(" + uniqCd + ", " + gubNm + ") : " + price;
    }

    @Override 
    public int hashCode() {
        int result = 31;

        result = result + uniqCd.hashCode();
        result = result + itemGubun.hashCode();
        
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == null ) {
            return false;
        }

        if( obj == this ) {
            return true;
        }

        if( obj instanceof Product ) {
            Product tmp = (Product)obj;
            // 같은가에 대한 체크는 고유번호와 분류만으로 체크한다.
            return (tmp.getUniqCd().equals(uniqCd) && tmp.getItemGubun().equals(itemGubun));
        } else {
            return false;
        }
    }

}