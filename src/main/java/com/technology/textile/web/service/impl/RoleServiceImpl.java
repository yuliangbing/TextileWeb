package com.technology.textile.web.service.impl;

import com.technology.textile.web.entity.Role;
import com.technology.textile.web.mapper.RoleDao;
import com.technology.textile.web.service.RoleService;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author yuliangbing
 * @since 2019-06-25
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Override
	public boolean insert(Role entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAllColumn(Role entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertBatch(List<Role> entityList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertBatch(List<Role> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertOrUpdateBatch(List<Role> entityList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertOrUpdateBatch(List<Role> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByMap(Map<String, Object> columnMap) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Wrapper<Role> wrapper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBatchIds(List<? extends Serializable> idList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateById(Role entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAllColumnById(Role entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Role entity, Wrapper<Role> wrapper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBatchById(List<Role> entityList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBatchById(List<Role> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertOrUpdate(Role entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Role selectById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> selectBatchIds(List<? extends Serializable> idList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> selectByMap(Map<String, Object> columnMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role selectOne(Wrapper<Role> wrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> selectMap(Wrapper<Role> wrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object selectObj(Wrapper<Role> wrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount(Wrapper<Role> wrapper) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Role> selectList(Wrapper<Role> wrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Role> selectPage(Page<Role> page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> selectMaps(Wrapper<Role> wrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> selectObjs(Wrapper<Role> wrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Map<String, Object>> selectMapsPage(Page page, Wrapper<Role> wrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Role> selectPage(Page<Role> page, Wrapper<Role> wrapper) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
