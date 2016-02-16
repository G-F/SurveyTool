package com.g.f.survey.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import com.g.f.survey.intercepter.LoggingIntercepter;

//@EnableTransactionManagement //TODO 付けるかどうか判断
@Configuration
public class AppConfig {
	
	@Bean
	HandlerInterceptor loggingIntercepter(){
		return new LoggingIntercepter();
	}

}
