package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import metier.IMetier;

public class PresentationAvecSring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		IMetier metier = (IMetier) ctx.getBean(IMetier.class);
		System.out.println(metier.calcul());

	}

}
