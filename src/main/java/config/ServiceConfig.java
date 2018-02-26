package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import services.VeterinarServiceIml;
import services.interfaces.IVeterinarService;

@Configuration
public class ServiceConfig {
	
	@Bean
	public IVeterinarService veterinarService() {
		return new VeterinarServiceIml();
	}

}
