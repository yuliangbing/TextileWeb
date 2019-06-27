package com.technology.textile.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technology.textile.web.entity.ZptcUser;
import com.technology.textile.web.service.ZptcUserService;
import com.technology.textile.web.util.JsonResult;

//参数接受层、数据返回层
@RestController
@RequestMapping("/zptcUser")
public class ZptcController extends BaseController {
	
	//业务逻辑处理层
	@Autowired
	private ZptcUserService zptcUserService;

	@RequestMapping("/getUserList")
	public JsonResult getUserList(HttpServletRequest request, HttpServletResponse response) {
		
		//接收参数开始
		String teaName = request.getParameter("teaName");
		String teaCode = request.getParameter("teaCode");
		//接收参数结束
		
		//封装参数
		Map<String, Object> map = new HashMap<>();
		map.put("teaName", teaName);
		map.put("teaCode", teaCode);
		
		//调用service查询数据
		List<ZptcUser> zptcUserList = zptcUserService.getList(map);
		
		//封装返回数据
		return JsonResult.build(FLAG_SUCCESS, zptcUserList);
	}
}
