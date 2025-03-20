package Com.main;

import java.io.ObjectInputFilter.Config;
import org.springframework.cglib.transform.impl.AddDelegateTransformer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Com.config.ConfigClass;
import Com.entity.Customers;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Customers c1 = context.getBean(Customers.class);
		System.out.println(c1);
	}

}
