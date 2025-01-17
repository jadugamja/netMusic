package com.netmusic.common.dao;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.netmusic.member.vo.NetMemberVO;

@Repository
public class ChabunDAOImpl implements ChabunDAO {
	private Logger logger = Logger.getLogger(ChabunDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	@Override
	public NetMemberVO getMemChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunDAOImpl getMemChabun >>> : ");
		return sqlSession.selectOne("getMemChabun");
	}

}
