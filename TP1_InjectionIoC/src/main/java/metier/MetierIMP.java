package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IDao;

@Service
public class MetierIMP implements IMetier{
	
	@Autowired
	private IDao dao;// couplage faible
	//private IDao dao = new MetierIMP();// couplage fort
	
	public double calcul() {
		double t = dao.getTemperature();
		return t*7;
	}

	

	public void setDao(IDao dao) {
		this.dao = dao;
		System.out.println("injection des depandance");
	}
	
	public void init() {
		System.out.println("initialisation de MetierIMP");
	}



	public MetierIMP() {
		System.out.println("instaciation de MetierIMP");
	}
	

}
