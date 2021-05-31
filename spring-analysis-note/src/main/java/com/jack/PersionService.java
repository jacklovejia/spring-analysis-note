package com.jack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PersionService {

	@Autowired
	private MessageSource messageSource;

	@Autowired
	private Map<String, TestService> map;

	public void a() {
		System.out.println("map:"+map);
	}
}
