package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import repos.VeterinarRepositoryImpl;
import repos.interfaces.IVeterinarRepository;

@Configuration
public class RepositoryConfig {
	
	@Bean
	public IVeterinarRepository getveterinarRepo() {
		return new VeterinarRepositoryImpl();
	}

}
