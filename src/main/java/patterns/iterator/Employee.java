package patterns.iterator;

import java.util.*;

public class Employee {
    private Shelf snackShelf;
    private Shelf dwShelf;

    public Employee(Shelf snackShelf, Shelf dwShelf) {
        this.snackShelf = snackShelf;
        this.dwShelf = dwShelf;
    }

    public void orderItemAdd(Product product) {
        if( product.getItemGubun().equals("1") ) {
            snackShelf.addItem(product);
        } else {
            dwShelf.addItem(product);
        }
    }

    public void orderItemRemove(Product product) {
        if( product.getItemGubun().equals("1") ) {
            snackShelf.removeItem(product);
        } else {
            dwShelf.removeItem(product);
        }
    }

    public void printAll() {
        Iterator<Product> snackIt = snackShelf.createIterator();
        Iterator<Product> dwIt = dwShelf.createIterator();
        System.out.println("Snack Print Start");

        while (snackIt.hasNext()) {
            Product snack = snackIt.next();
            System.out.println(snack);
		}

        System.out.println("Snack Print End");

        System.out.println("DrinkWater Print Start");

        while (dwIt.hasNext()) {
            Product drinkWater = dwIt.next();
            System.out.println(drinkWater);
		}

        System.out.println("DrinkWater Print End");
    }

    public void printSnack() {
        Iterator<Product> snackIt = snackShelf.createIterator();
        while (snackIt.hasNext()) {
            Product snack = snackIt.next();
            System.out.println(snack);
		}
    }


    public void printDW() {
        Iterator<Product> dwIt = dwShelf.createIterator();
        while (dwIt.hasNext()) {
            Product drinkWater = dwIt.next();
            System.out.println(drinkWater);
		}
    }

}