package br.com.fmu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.fmu.repository")
/* @EntityScan(basePackages = "br.com.fmu.model") */
public class VouDeBike2Application {

	public static void main(String[] args) {
		
		System.setProperty("server.servlet.context-path", "/bike");
		System.setProperty("server.servlet.contextPath", "/bike");
		System.setProperty("server.contextPath", "/bike");
		
		System.setProperty("management.endpoints.web.exposure.include", "*");
		
		System.setProperty("server.compression.enabled", "true");
		System.setProperty("server.compression.mime-types", "application/json,application/xml,text/html,text/xml,text/plain");
		System.setProperty("endpoints.beans.id", "springbeans");
		System.setProperty("endpoints.beans.sensitive", "false");
		System.setProperty("endpoints.beans.enabled", "true");
		
		SpringApplication.run(VouDeBike2Application.class, args);
	}

}
