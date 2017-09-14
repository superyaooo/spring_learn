import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {
	
	// bean name has to be commented out to use "prototype" scope
//	@Bean(name="customerService")   
	@Bean
	public CustomerService getCustomerService() {
//		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		
		return service;
	}
	
//	@Bean("customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
