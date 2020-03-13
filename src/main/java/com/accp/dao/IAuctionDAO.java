package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Auction;
import com.accp.pojo.Auctionrecord;

public interface IAuctionDAO {
	
	/* 删除 */
	int del(@Param("auctionId") Integer auctionId);
	
	/* 发布 */
	int insert(@Param("a") Auction a);
	
	/* 修改 */
	int update(@Param("a") Auction a);
	
	/* 根据ID查询拍卖品 */
	Auction queryById(@Param("auctionId") Integer auctionId);
	
	/* 查询拍卖列表 */
	List<Auction> queryAll();
	
	
}
