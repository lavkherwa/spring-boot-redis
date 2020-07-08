package com.example.demo.redis.cache.impl;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.redis.pojo.ILoggedOnUser;

public class LoggedOnUserCacheKeyConverter implements Converter<String, String> {

	private ILoggedOnUser userInformation;

	public LoggedOnUserCacheKeyConverter(ILoggedOnUser userInformation) {
		this.userInformation = userInformation;
	}

	@Override
	public String convert(String key) {
		final Object decoratedKey = decorateObjectKey(key);
		return (String) decoratedKey;
	}

	protected Object decorateObjectKey(final Object key) {

		final String decoratedKey = userInformation.getId() + userInformation.getEmail() + String.valueOf(key);
		return decoratedKey;

	}

}
