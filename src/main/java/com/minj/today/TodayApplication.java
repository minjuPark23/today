package com.minj.today;

import com.minj.today.FilterTest.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@ServletComponentScan
@SpringBootApplication
public class TodayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodayApplication.class, args);
	}

//	@Bean
//	public FilterRegistrationBean setFilterRegistration(){
//		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
//		filterRegistrationBean.addUrlPatterns("/api/filter/*");
//		return filterRegistrationBean;
//	}
}
