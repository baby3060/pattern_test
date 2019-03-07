package patterns.command;

/**
 * 벤딩머신에 들어가는 음료수
 */
public class InsertDrinking {
    private int productId;
    private int price;
    private int stock;

    public InsertDrinking(DrinkingWater waterType) {
        this.productId = waterType.getProductId();
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == null ) {
            return false;
        }

        if(obj == this) {
            return true;
        }

        InsertDrinking tmp = (InsertDrinking)obj;

        if( tmp.getProductId() == this.productId ) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
    	DrinkingWater water = DrinkingWater.valueOf(productId);

        String result = String.format("음료수명 : %s : [가격 : %d, 재고 : %d] \n", water.toString(), this.price, this.stock);

        return result;
    }

    public boolean isEmpty() {
        return (stock <= 0);
    }

}