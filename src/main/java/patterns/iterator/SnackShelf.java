package patterns.iterator;

import java.util.*;

public class SnackShelf implements Shelf {
    private ArrayList<Product> list;

    public SnackShelf() {
        list = new ArrayList<Product>();
    }

    @Override
    public Iterator<Product> createIterator() {
        return list.iterator();
    }

    @Override
    public void addItem(Product product) {
        if( list.contains(product) ) {
            System.out.println("해당 선반에 이미 등록된 품목입니다." + product);
        } else {
            if( product.getItemGubun().equals("1") ) {
                list.add(product);
                System.out.println("제품이 진열되었습니다(" + product + ").");
            } else {
                System.out.println("제품 구분이 과지일 경우에만 해당 선반에 등록가능합니다." + product);
            }
        }
    }

    @Override
    public void removeItem(Product product) {
        if( product.getItemGubun().equals("1") ) {
            System.out.println("제품이 진열이 취소되었습니다(" + product + ").");
            list.remove(product);
        } else {
            System.out.println("제품 구분이 과자일 경우에만 삭제가능합니다." + product);
        }
    }
}