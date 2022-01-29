package com.algaworks.algalog.api.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.algaworks.algalog.api.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(buildApiInfo());
	}

	private ApiInfo buildApiInfo() {
		return new ApiInfoBuilder()
				.title("API AlgaLog")
				.description("REST API Para logistica de entregas")
				.contact(new Contact("Dorian Vieira", "https://github.com/oneyottabyte/algalog-api", null))
				.build();
	}
}
