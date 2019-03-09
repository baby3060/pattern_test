package patterns.tempmethod;

public class Baguette extends Bread {
    
    public void modling() {
        System.out.println("길다랗게 만든다.");
    }

    public boolean isAddtion() {
        return false;
    }

    public void insertMold() {
        System.out.println("아무것도 하지 않는다.");
    }
}