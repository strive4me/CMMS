package yycg.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import yycg.base.service.UserService;

@Controller
public class TestAction {
	@Autowired
	private UserService userService;
	
	    //欢迎页面
		@RequestMapping("/test")
		public String welcomeTest() throws Exception{
			System.out.println("测试mybatis整合spring的通知事务好用否");
		
			return "/base/dwrtest";
		}
}
