package com.zlinks.mapper;

import com.zlinks.domain.AuthElement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * Copyright (C), 2017-2018, cn.zlinks
 * FileName: AccountMapper
 * Author:   zhangjh
 * Date:     2018-7-10 19:53:10
 * Description: AuthElementMapper
 */
@Mapper
public interface AuthElementMapper{



AuthElement queryInfoById(Long id);

	int selectCount();

	int selectCountByCondition(AuthElement entity);

	List<AuthElement> selectByCondition(AuthElement entity);

	int updateById(AuthElement entity);

	int deleteById(int id);

	int insert(AuthElement entity);

	int insertList(List<AuthElement> entityList);

	List<AuthElement>  getList();




}