package com.accp.biz;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.IUserDAO;
import com.accp.pojo.Auctionuser;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class UserBiz {
	
	@Autowired
	private IUserDAO dao;
	
	/* 根据登录人查询ID */
	public Auctionuser queryByUserName(String userName) {
		return dao.queryByUserName(userName);
	}
	
	/* 登录 */
	public Auctionuser login(String userName,String userPassword) {
		return dao.login(userName, userPassword);
	}

	/* 注册 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int register(Auctionuser u) {
		return dao.register(u);
	}
	
	
}
