package presentation;

import dao.DaoIMP;
import metier.MetierIMP;

public class PresentationStatique {
	public static void main(String[] args) {
		DaoIMP dao = new DaoIMP();
		MetierIMP metier = new MetierIMP();
		//Injection de dependence
		metier.setDao(dao);//association de valeur//sans çs on aura une excepltion pointeur null
		System.out.println(metier.calcul());//ava.lang.NullPointerException: Cannot invoke "dao.IDao.getTemperature()" because "this.dao" is null
		
	}

}
