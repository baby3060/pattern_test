package patterns.factory.abstractf;

/**
 * 
 */
public class BokNeRawMaFactory implements RawMaFactory {
    public Dough createDough() {
        return new BokNeDough();
    }

    public Meat createMeat() {
        return new BokNeMeat();
    }
    
    public Oil createOil(String type) {
        if(type.equals("HO")) {
            return new BokNeNuttyOil();
        } else {
            return new BokNeOilyOil();
        }
    }

    public Source createSource(String type) {
        if(type.equals("FIRE")) {
            return new BokNeFireSource();
        } else if(type.equals("HO")) {
            return new BokNeSweetSource();
        } else {
            return new BokNeNuttySource();
        }
    }
}