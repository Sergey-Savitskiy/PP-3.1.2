package sprboot.MyPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import sprboot.MyPP.Controller.UserController;

@SpringBootApplication
public class MyPpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPpApplication.class, args);
	}

}
