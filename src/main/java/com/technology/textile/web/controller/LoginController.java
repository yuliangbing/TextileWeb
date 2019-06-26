package com.technology.textile.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technology.textile.web.entity.ZptcUser;
import com.technology.textile.web.service.ZptcUserService;
import com.technology.textile.web.util.JsonResult;

@RestController
public class LoginController extends BaseController {
	
	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private ZptcUserService zptcUserService;

	@RequestMapping("/login")
	public JsonResult login() {
		return JsonResult.success(FLAG_SUCCESS);
	}
	
	@RequestMapping("/register")
	public JsonResult register(ZptcUser zptcUser) {
		zptcUserService.insert(zptcUser);
		return JsonResult.success(FLAG_SUCCESS);
	}
}
