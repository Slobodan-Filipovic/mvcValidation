package config;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*
import repos.VeterinarRepositoryImpl;
import repos.interfaces.IVeterinarRepository;*/

@Configuration
@ComponentScan(basePackages = {"repos", "repos.interfaces"})
public class RepositoryConfig {
	
	
	/*
	@Bean
	public IVeterinarRepository getveterinarRepo() {
		return new VeterinarRepositoryImpl();
	}*/

}
