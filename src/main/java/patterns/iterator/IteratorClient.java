package patterns.iterator;

public class IteratorClient {
    public void run() {
        SnackShelf snackShelf = new SnackShelf();
        DrinkingWaterShelf dwShelf = new DrinkingWaterShelf();

        Employee emp = new Employee(snackShelf, dwShelf);

        Product snack1 = new Product("1", "새우깡", "1", 1200);
        Product snack2 = new Product("2", "뻥이요", "1", 1700);
        Product snack3 = new Product("3", "뻥이요(허니)", "1", 1900);
        Product snack4 = new Product("4", "팝콘", "1", 4000);

        emp.orderItemAdd(snack1);
        emp.orderItemAdd(snack2);
        emp.orderItemAdd(snack3);
        emp.orderItemAdd(snack4);

        Product dw1 = new Product("1", "사이다", "2", 1200);
        Product dw2 = new Product("2", "콜라", "2", 1700);
        Product dw3 = new Product("3", "웰치스", "2", 1900);

        emp.orderItemAdd(dw1);
        emp.orderItemAdd(dw2);
        emp.orderItemAdd(dw3);

        System.out.println("과자 출력");
        emp.printSnack();

        emp.orderItemRemove(snack3);

        System.out.println("과자 출력(삭제 후)");
        emp.printSnack();

        System.out.println("음료수 출력");
        emp.printDW();

        emp.orderItemRemove(dw3);

        System.out.println("음료수 출력(삭제 후)");
        emp.printDW();

        System.out.println("전체 출력");
        emp.printAll();
    }
}