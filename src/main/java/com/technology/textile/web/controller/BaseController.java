package com.technology.textile.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	public static final Integer FLAG_SUCCESS = 0;// 请求响应成功
	public static final Integer FLAG_FAILED = 500;// 请求响应失败

	public Map<String, Object> getMap() {
		return new HashMap<String, Object>();
	}

	public String getParam(HttpServletRequest request, String name) {
		return request.getParameter(name);
	}

	public void setSession(HttpServletRequest request, String name, Object sessionObj) {
		request.getSession().setAttribute(name, sessionObj);
	}
}
