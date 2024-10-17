package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class PresentationDynamique {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Scanner  scanner = new Scanner(new File("config.txt"));
		String daoClassName = scanner.nextLine();
		String metierClassName = scanner.nextLine();
		Class<?> cDao = Class.forName(daoClassName); //charger le classe en m�moire
		//IDao dao=(IDao) cDao.newInstance();//ancienne version//creer des instance de classe
		IDao dao = (IDao) cDao.getConstructor().newInstance();
		Class<?> cMetier = Class.forName(metierClassName);
		//IMetier metier = (IMetier) cMetier.newInstance();
		IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
		//metier.setDao(dao) n'existe pas car metier est une interface
		//Method m =cMetier.getMethod("setDao", new Class[]{IDao.class});// anciennne version
		Method m = cMetier.getDeclaredMethod("setDao", IDao.class);
		m.invoke(metier, dao);//injection de dependance
		System.out.println(metier.calcul());
		
		
		
				
	}

}
