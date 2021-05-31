package com.jack;

import org.springframework.stereotype.Service;

/**
 * @author: Jack
 * @create: 2020-06-23 09:44
 * @description:
 **/
@Service("testServiceImplA")
public class TestServiceImplA implements TestService{
	@Override
	public void add() {
		System.out.println("AAAA");
	}
}
