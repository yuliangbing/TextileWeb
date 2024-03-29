package com.technology.textile.web.service.impl;

import com.technology.textile.web.entity.ZptcUser;
import com.technology.textile.web.mapper.ZptcUserDao;
import com.technology.textile.web.service.ZptcUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yuliangbing
 * @since 2019-06-25
 */
@Service
public class ZptcUserServiceImpl implements ZptcUserService {
	
	//数据持久化层
	@Autowired
	private ZptcUserDao zptcUserDao;

	@Override
	public boolean insert(ZptcUser entity) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int count = zptcUserDao.insert(entity);
		if (count > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public List<ZptcUser> getList(Map<String, Object> par) {
		// TODO Auto-generated method stub
		return zptcUserDao.getList(par);
	}
	
}
