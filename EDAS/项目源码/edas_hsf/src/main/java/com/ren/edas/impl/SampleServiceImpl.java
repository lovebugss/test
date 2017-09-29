package com.ren.edas.impl;

import com.ren.edas.SampleService;

public class SampleServiceImpl implements SampleService{

	public String echo(String str) {
		System.out.println(str);
		return str;
	}

}
