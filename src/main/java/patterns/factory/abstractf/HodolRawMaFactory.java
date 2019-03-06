package patterns.factory.abstractf;

/**
 * 
 */
public class HodolRawMaFactory implements RawMaFactory {
	
	private static RawMaFactory rawMaFactory;
	
	private HodolRawMaFactory() {}
	
	public static RawMaFactory getInstance() {
		if(rawMaFactory == null) {
			synchronized (RawMaFactory.class) {
				rawMaFactory = new HodolRawMaFactory();
			}
		}
		return rawMaFactory;
	}
	
    public Dough createDough() {
        return new HodolDough();
    }

    public Meat createMeat() {
        return new HodolMeat();
    }
    
    public Oil createOil(String type) {
        if(type.equals("GAL")) {
            return new HodolSpicyOilyOil();
        } else {
            return new HodolLittleNuttyOil();
        }
    }

    public Source createSource(String type) {
        if(type.equals("GAL")) {
            return new HodolGalSource();
        } else if(type.equals("VF")) {
            return new HodolVeryFireSource();
        } else {
            return new HodolNuttySource();
        }
    }
}