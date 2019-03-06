package patterns.factory.abstractf;

/**
 * 
 */
public class NuNeRawMaFactory implements RawMaFactory {
	private static RawMaFactory rawMaFactory;
	
	private NuNeRawMaFactory() {}
	
	public static RawMaFactory getInstance() {
		if(rawMaFactory == null) {
			synchronized (RawMaFactory.class) {
				rawMaFactory = new NuNeRawMaFactory();
			}
		}
		return rawMaFactory;
	}
	
    public Dough createDough() {
        return new NuNeDough();
    }

    public Meat createMeat() {
        return new NuNeMeat();
    }
    
    public Oil createOil(String type) {
        if(type.equals("SEA")) {
            return new NuNeLittleNuttyOil();
        } else {
            return new NuNeSpicyOilyOil();
        }
    }

    public Source createSource(String type) {
        if(type.equals("SEA")) {
            return new NuNeGoodSeasoSource();
        } else if(type.equals("SNOW")) {
            return new NuNeHoneySource();
        } else {
            return new NuNeNuttySource();
        }
    }
}