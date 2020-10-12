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
@EnableSwagger2 // swagger ȯ�漳��
public class SwaggerConfig {
		
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("food") // ������ project�̸��̳� Domain�̸�
				.apiInfo(info()) // swagger ȭ�鿡 ǥ���� ���� ����
				.select()
				// rest ������ controller�� �ִ� package ����
				.apis(RequestHandlerSelectors.basePackage("com.ssafy.controller"))
				//PathSelectors.any()			path ������� swagger ����
				//PathSelectors.ant(pattern)	������ pattern�鸸 swagger ����
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
