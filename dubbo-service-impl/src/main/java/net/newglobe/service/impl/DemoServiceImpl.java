package net.newglobe.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import net.newglobe.service.DemoService;
@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public String demo(String demo) {
		return "传递的内容："+demo;
	}

}
