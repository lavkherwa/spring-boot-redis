package com.example.demo.redis.cache.impl;

public class UserCacheKey {

	private String key;

	public UserCacheKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
