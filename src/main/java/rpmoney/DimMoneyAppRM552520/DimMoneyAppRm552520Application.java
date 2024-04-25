package rpmoney.DimMoneyAppRM552520;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DimMoneyAppRm552520Application extends SpringBootServletInitializer {
	@Override
	// Configuring method has to be overridden
	protected SpringApplicationBuilder
	configure(SpringApplicationBuilder application){
		return application.sources(
				DimMoneyAppRm552520Application.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(DimMoneyAppRm552520Application.class, args);
	}

}
