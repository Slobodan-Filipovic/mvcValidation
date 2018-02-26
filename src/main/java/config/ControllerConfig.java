package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*
import controllers.HelloWorldController;
import controllers.VeterinarController;
import org.springframework.context.annotation.Bean;
*/

@Configuration 
@ComponentScan(basePackages = "controllers") 
public class ControllerConfig {
	
	
	
	
	/*
	@Bean
	public HelloWorldController controller() {
		return new HelloWorldController();
	}
	
	@Bean
	public VeterinarController veterinarController() {
		return new VeterinarController();
	}
*/
}
