package com.travelyatri;

import java.util.Arrays;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.travelyatri.repository")
public class SpringbootJwtApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootJwtApplication.class, args);
		
		System.out.println("beans provided by SpringBoot are : ");
		
		String[] beans = ctx.getBeanDefinitionNames();
		Arrays.sort(beans);
		for(String bean : beans) {
			System.out.println(bean);
		}
	}
	
}
