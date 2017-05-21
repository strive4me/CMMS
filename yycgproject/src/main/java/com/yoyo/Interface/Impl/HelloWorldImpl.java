package com.yoyo.Interface.Impl;

import java.util.List;

import com.yoyo.Interface.IhelloWorld;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import yycg.base.dao.mapper.SysuserMapper;
import yycg.base.pojo.po.Sysuser;
import yycg.base.service.UserService;


@WebService(endpointInterface = "com.yoyo.Interface.IhelloWorld", serviceName = "HelloWorld")
//@Component(value="helloWorldImpl")

//@WebService(endpointInterface = "com.yoyo.Interface.IhelloWorld")
public class HelloWorldImpl implements IhelloWorld {
	
	@Autowired(required=false)  
	private SysuserMapper sysuserMapper;
	
	public String sayHi(String who) throws Exception {
System.out.println("---------------------------------------------");
if(sysuserMapper == null){
	System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
}

	
	    return "Hi,"+who+"MyPhone is : ";

	}
	
	

}