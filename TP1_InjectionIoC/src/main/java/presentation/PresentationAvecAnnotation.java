package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.IMetier;

public class PresentationAvecAnnotation {
	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		ApplicationContext ctx = new AnnotationConfigApplicationContext("dao","metier");//scanner les class
		IMetier m = ctx.getBean(IMetier.class);
		System.out.println(m.calcul());
		long takentime = System.currentTimeMillis()-starttime;
		System.out.println("le temps pris par  est " + takentime);
	}

}
