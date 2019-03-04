package patterns.decorator;

import java.util.*;

/**
 * 치킨의 경우 생성자가 두 개인 이유는 세트에 치킨이 한 마리 일리는 없기 때문
 */
public abstract class ChickenSet {
    protected Map<MenuEnum, Integer> menuList;
    
    public ChickenSet() {}

    {
        menuList = new LinkedHashMap<MenuEnum, Integer>();
    }

    public ChickenSet(ChickenSet set) {
        if( set.menuList == null ) {
            menuList = new LinkedHashMap<MenuEnum, Integer>();
        } else {
            menuList = set.menuList;
        }
    }

    public abstract long calcCost();
    public abstract String getDescription();

    public Map<MenuEnum, Integer> getMenuList() {
        return menuList;
    }

    public void menuAdd(Map<MenuEnum, Integer> dMenuList, MenuEnum mEnum) {

        if( dMenuList.isEmpty() ) {
        	dMenuList.put(mEnum, 1);
        } else {
            if(dMenuList.containsKey(mEnum)) {
                dMenuList.put(mEnum, dMenuList.get(mEnum) + 1);
            } else {
                dMenuList.put(mEnum, 1);
            }
        }
        
        menuList = new LinkedHashMap<MenuEnum, Integer>(dMenuList);
    }

}