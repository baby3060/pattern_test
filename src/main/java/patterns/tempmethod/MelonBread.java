package patterns.tempmethod;

public class MelonBread extends Bread {
    
    public void modling() {
        System.out.println("동그랗게 만든다.");
    }

    public boolean isAddtion() {
        return true;
    }

    public void insertMold() {
        System.out.println("멜론을 넣는다.");
    }
}