package com.devils.pics.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.devils.pics.dao.ScheduleDAO;

@Repository
public class ScheduleDAOImpl implements ScheduleDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NS = "ScheduleMapper.";
}