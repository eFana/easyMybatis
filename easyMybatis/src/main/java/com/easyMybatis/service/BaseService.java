package com.easyMybatis.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.easyMybatis.core.sqlSessionConfig;
import com.easyMybatis.entity.BaseUser;
import com.easyMybatis.mapper.BaseMapper;

public class BaseService {
	
	private static SqlSession sqlSession = sqlSessionConfig.getSqlSession();
    private static BaseMapper baseMapper = sqlSession.getMapper(BaseMapper.class);

	public void save() {
		BaseUser user = new BaseUser();
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setLogin("admin");
		user.setPassword("admin");
		user.setName("admin");
		user.setDescription("系统管理员");
		user.setEnabled("1");
		baseMapper.save(user);
	}

	public void saveBatch() {
		List<BaseUser> userList = new ArrayList<BaseUser>();
        for(int i = 0; i < 1; i++){
        	BaseUser user = new BaseUser();
        	user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
    		user.setLogin("admin");
    		user.setPassword("admin");
    		user.setName("admin");
    		user.setDescription("系统管理员");
    		user.setEnabled("1");
    		userList.add(user);
        }
        baseMapper.saveBatch(userList);
	}

}
