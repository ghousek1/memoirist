package com.ghouse.memoirist.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

	@Bean
	public Docket swaggerConfigDocket() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.ghouse.memoirist")).build().apiInfo(swaggerApiInfo());
	}

	public ApiInfo swaggerApiInfo() {

		return new ApiInfo("Memorist API", "Memorist-Spring Boot Application developed by Ghouse", "v 1.0",
				"No Terms & Conditions",
				new springfox.documentation.service.Contact("Ghouse", "ghousek1.com", "ghousek1@outlook.com"),
				"GPL-2.0 License", "https://opensource.org/licenses/GPL-2.0", Collections.emptyList());

	}

}
