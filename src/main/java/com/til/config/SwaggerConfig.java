package com.til.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 // swagger 환경설정
public class SwaggerConfig {
		
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("food") // 서비스할 project이름이나 Domain이름
				.apiInfo(info()) // swagger 화면에 표시할 설명 정보
				.select()
				// rest 서비스할 controller가 있는 package 지정
				.apis(RequestHandlerSelectors.basePackage("com.ssafy.controller"))
				//PathSelectors.any()			path 상관없이 swagger 생성
				//PathSelectors.ant(pattern)	지정한 pattern들만 swagger 생성
				.paths(PathSelectors.any())
				.build();
		
	}

	private ApiInfo info() {
		return new ApiInfoBuilder().title("SSAFY API")
				.description("SSAFY API Reference for Developers")
				.license("SSAFY License")
				.version("3.0").build();
	}
}
