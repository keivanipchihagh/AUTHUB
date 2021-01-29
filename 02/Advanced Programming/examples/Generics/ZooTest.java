package generics;

public class ZooTest {

	public static void main(String[] args) {
		Animal africanZebra = new Animal("African Zebra");
		Lion persianLion = new Lion("Persian Lion");
		Tiger caspianTiger = new Tiger("Caspian Tiger");
		
		Zoo<Animal> tehranZoo = new Zoo<Animal>();
		
		tehranZoo.add(africanZebra);
		tehranZoo.add(persianLion);
		tehranZoo.add(caspianTiger);
		tehranZoo.display();
		
		Zoo<Lion> smallZoo = new Zoo<Lion>();
		Lion africanLion = new Lion("African Lion");
		Puma puma = new Puma("American Puma");
		
		smallZoo.add(persianLion);
		smallZoo.add(africanLion);
		smallZoo.add(puma);
		
//		not acceptable
//		smallZoo.add(africanZebra);
		
		smallZoo.display();
		
//		not acceptable
//		Zoo<Object> impossibleZoo = new Zoo<Object>();
	}

}
