package br.com.josebarbosa.ufla1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ufla1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationcontext =
				SpringApplication.run(Ufla1Application.class, args);

		Funcionario funcionario = applicationcontext.getBean(Funcionario.class);
		Laptop laptop = applicationcontext.getBean(Laptop.class);
		funcionario.show();
		
		Funcionario funcionario2 = applicationcontext.getBean(Funcionario.class);
		funcionario2.show();
		
		
	}

}
