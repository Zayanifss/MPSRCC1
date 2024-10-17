package dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoIMP implements IDao{
//data access object
	double t;
	public double getTemperature() {
		t =24;
		return t;
	}
	public void init() {
		System.out.println("initialisation de DaoIMP");
	}
	public DaoIMP() {
		System.out.println("instaciation de DaoIMP");
	}

	

}
