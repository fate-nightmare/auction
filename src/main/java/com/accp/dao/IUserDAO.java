package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Auction;
import com.accp.pojo.Auctionuser;

public interface IUserDAO {
	
	/* 根据登录人查询ID */
	Auctionuser queryByUserName(@Param("userName") String userName);

	
	/* 登录 */
	Auctionuser login(@Param("userName") String userName,@Param("userPassword") String userPassword);

	/* 注册 */
	int register(@Param("u") Auctionuser u);
	
	
}
