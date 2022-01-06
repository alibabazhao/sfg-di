package guruspringframework.sfgdi;

import guruspringframework.sfgdi.controllers.MyController;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController=(MyController)ctx.getBean("myController");

		String greeting=myController.sayHello();
		System.out.println(greeting);
	}

}
