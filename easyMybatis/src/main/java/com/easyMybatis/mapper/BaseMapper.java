package com.easyMybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.easyMybatis.entity.BaseUser;

@Mapper
public interface BaseMapper {
	
	void save(BaseUser user);

	void saveBatch(List<BaseUser> userList);

}
