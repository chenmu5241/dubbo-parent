package net.newglobe.service.consumer.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;

import net.newglobe.service.DemoService;
import net.newglobe.service.consumer.TestService;

@Service
public class TestServiceImpl implements TestService{
	//获取代理对象
	@Reference
	private DemoService demoService;

	@Override
	public void test() {
		//调用provinder功能
		String demo = demoService.demo("zhangsan");
		System.out.println(demo);
	}
	
	

}
