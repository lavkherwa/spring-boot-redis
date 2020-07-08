package com.example.demo.redis.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.redis.config.CacheConfig;

@RestController
@RequestMapping("/api")
public class TestController {

	@GetMapping("/test1/{id}")
	@Cacheable(cacheManager = "sessionCacheManager", cacheNames = "session-cache", keyGenerator = CacheConfig.CUSTOM_KEYGENERATOR)
	public String test1(@PathVariable String id) {

		System.out.println("retrived from I/O");
		return id;
	}

	@GetMapping("/test2/{id}")
	@Cacheable(cacheManager = "userCacheManager", cacheNames = "user-cache", keyGenerator = CacheConfig.CUSTOM_KEYGENERATOR)
	public String test2(@PathVariable String id) {

		System.out.println("retrived from I/O");
		return id;
	}

}
