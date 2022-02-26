package guru.springframework.sfgdi;

import guru.springframework.sfgdi.Controller.ConstructorInjectedController;
import guru.springframework.sfgdi.Controller.I18nController;
import guru.springframework.sfgdi.Controller.MyController;
import guru.springframework.sfgdi.Controller.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println("Profile-----------");
		System.out.println(i18nController.sayGreeting());

		MyController controller = (MyController) context.getBean("myController");
		System.out.println("Primary-----------");
		System.out.println(controller.sayHello());

		System.out.println("Property-----------");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController)context.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("Constructor-----------");

		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(		constructorInjectedController.getGreeting());
	}

}
