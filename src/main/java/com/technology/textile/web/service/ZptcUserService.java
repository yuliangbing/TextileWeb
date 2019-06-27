package com.technology.textile.web.service;

import java.util.List;
import java.util.Map;

import com.technology.textile.web.entity.ZptcUser;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author yuliangbing
 * @since 2019-06-25
 */
public interface ZptcUserService {
	//新增用户
	public boolean insert(ZptcUser entity);
	
	//获取用户列表
	public List<ZptcUser> getList(Map<String, Object> par);
	
}
