package patterns.tempmethod;

public abstract class Bread {
    final void making() {
        prepare();

        modling();

        if(isAddtion()) {
            insertMold();
        }

        burning();
    }

    public final void prepare() {
        System.out.println("반죽 준비 완료");
    }

    public abstract void modling();

    public boolean isAddtion() {
        return false;
    }

    public final void burning() {
        System.out.println("오븐에 굽는다.");
    }

    public abstract void insertMold();
}