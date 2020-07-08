package com.example.demo.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.redis.pojo.ILoggedOnUser;
import com.example.demo.redis.pojo.LoggedOnUser;

@Configuration
public class LoggedOnUserConfig {

	@Bean
	public ILoggedOnUser loggedOnUser() {

		/*
		 * In real case get this value from the thread local variable which keeps the
		 * loggedOnUserInfo and return
		 */

		LoggedOnUser user = new LoggedOnUser();
		user.setId(01);
		user.setEmail("abc.@java.com");

		return user;
	}

}