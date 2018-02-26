package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;

import validators.VeterinarValidator;

@Configuration
public class ValidationConfig {
	
	@Bean
	@Qualifier("veterinarValidator")
	public Validator getVeterinarValidator() {
		return new VeterinarValidator();
	}

}
