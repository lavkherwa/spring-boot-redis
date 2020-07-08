package com.example.demo.redis.cache.impl;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.redis.pojo.ILoggedOnUser;

public class UserCacheKeyConverter implements Converter<UserCacheKey, String> {

	private ILoggedOnUser userInformation;

	public UserCacheKeyConverter(ILoggedOnUser userInformation) {
		this.userInformation = userInformation;
	}

	@Override
	public String convert(UserCacheKey userCacheKey) {
		final Object decoratedKey = decorateObjectKey(userCacheKey);
		return (String) decoratedKey;
	}

	protected Object decorateObjectKey(final Object key) {

		final String decoratedKey = userInformation.getId() + userInformation.getEmail() + String.valueOf(key);
		return decoratedKey;

	}

}
