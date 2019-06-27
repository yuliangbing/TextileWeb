package com.technology.textile.web.mapper;

import java.util.List;
import java.util.Map;

import com.technology.textile.web.entity.ZptcUser;
import com.technology.textile.web.util.MyMapper;

/**
 * <p>
  * 用户表 Mapper 接口
 * </p>
 *
 * @author yuliangbing
 * @since 2019-06-25
 */
public interface ZptcUserDao extends MyMapper<ZptcUser> {

	public List<ZptcUser> getList(Map<String, Object> par);
}