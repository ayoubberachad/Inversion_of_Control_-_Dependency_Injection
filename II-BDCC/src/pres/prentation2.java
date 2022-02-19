package pres;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import couplage.faible.IDao;
import metier.IMetier;

public class prentation2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	//read the file and get name of class 
	Scanner scanner =new Scanner (new File("config.txt"));
	String daoClassName =scanner.nextLine();
	Class cDao = Class.forName(daoClassName);
	// Creation of a dynamic instance
	IDao dao=(IDao) cDao.newInstance();
	
	String metierClassName =scanner.nextLine();
	Class cMetier = Class.forName(metierClassName);
	IMetier metier = (IMetier) cMetier.newInstance();
	//execute method in class
	Method method=cMetier.getMethod("setDao", IDao.class);
	
	// metier.setDao(dao): == statique
	method.invoke(metier, dao);
	System.out.println("Resultats : "+metier.calcule());
	
	}

}
