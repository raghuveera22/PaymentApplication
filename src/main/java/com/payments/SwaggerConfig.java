/*//
//package com.payments;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import springfox.documentation.builders.ParameterBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.schema.ModelRef;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.ApiKey;
//import springfox.documentation.service.AuthorizationScope;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.GrantType;
//import springfox.documentation.service.OAuth;
//import springfox.documentation.service.Parameter;
//import springfox.documentation.service.ResourceOwnerPasswordCredentialsGrant;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger.web.ApiKeyVehicle;
//import springfox.documentation.swagger.web.SecurityConfiguration;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.function.Predicate;
//
//import static springfox.documentation.builders.PathSelectors.regex;
//
//import static springfox.documentation.builders.PathSelectors.*;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig extends WebMvcConfigurationSupport {
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				// .apis(RequestHandlerSelectors.any())
//				.apis(RequestHandlerSelectors.basePackage("com.payments")).paths(PathSelectors.any()).build()
//				//.securitySchemes(Arrays.asList(apiKey()))
//				// .securityContexts(Arrays.asList(securityContext()))
//				.apiInfo(apiInfo());
//		// .globalOperationParameters(Collections.singletonList(authHeader));
//	}
////
////	@Bean
////	public SecurityConfiguration securityInfo() {
////		return new SecurityConfiguration(null, null, null, null, null, ApiKeyVehicle.HEADER, "Authorization", "");
////	}
////
////	private ApiKey apiKey() {
////		return new ApiKey("Authorization", "Authorization", "header");
////	}
////
////	Parameter authHeader = new ParameterBuilder().parameterType("header").name("Authorization")
////			.modelRef(new ModelRef("string")).defaultValue("Bearer ").build();
//////	
////	@Override
////	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
////	 registry.addResourceHandler("swagger-ui.html")
////	 .addResourceLocations("classpath:/META-INF/resources/");
////	 registry.addResourceHandler("/webjars/**")
////	 .addResourceLocations("classpath:/META-INF/resources/webjars/");
////	}
//
//	private ApiInfo apiInfo() {
//	 return new ApiInfo(
//	 "Payments REST API",
//	 "Payments API",
//	 "v1.0",
//	 "Terms of service",
//	 new Contact("Raghu", "www.payments.com", "raghu@gmail.com"),
//	 "License of API", "API license ", Collections.emptyList());
//	}
//
//}*/