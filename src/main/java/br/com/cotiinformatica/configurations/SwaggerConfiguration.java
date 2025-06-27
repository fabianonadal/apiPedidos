package br.com.cotiinformatica.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfiguration {
	
	@Bean
	OpenAPI customOpenApi() {		
		var info = new Info();				
		info.title("API Pedidos - Treinamento TJ/PR");
		info.description("...");
		info.version("v1");
		
		var openAPI = new OpenAPI().components(new Components());
		openAPI.info(info);
		
		return openAPI;
		
	}

}
