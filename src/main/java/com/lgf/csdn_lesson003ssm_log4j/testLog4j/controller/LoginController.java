package com.lgf.csdn_lesson003ssm_log4j.testLog4j.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  描述: 跳转登录页,测试日志类能否记录登录操作
 *  作者: 郎国峰 
 *  时间: 2019年4月18日 上午10:49:21
 */
@Controller
@RequestMapping("test")
public class LoginController {
	//声明日志操作类Logger
	static Logger log = Logger.getLogger(LoginController.class.getName());
	@RequestMapping("logintest")
	public String testLogin() {
		//记录登录操作
		log.debug("跳转登录页");
		return "login";
	}
}
