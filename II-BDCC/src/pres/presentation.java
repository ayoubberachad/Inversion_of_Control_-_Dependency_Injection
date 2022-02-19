package pres;

import couplage.faible.DaoImpl;
import metier.MetierImpl;

public class presentation {

	public static void main(String[] args) {
//		Injection of dependencies by static instantiation
 
		DaoImpl dao = new DaoImpl();
		MetierImpl metier = new MetierImpl();

		metier.setDao(dao);

		System.out.println(metier.calcule());
	}
}
