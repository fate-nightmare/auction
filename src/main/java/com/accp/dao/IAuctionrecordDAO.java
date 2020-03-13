package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Auctionrecord;
import com.accp.vo.Rau;

public interface IAuctionrecordDAO {
	
	/* 竞拍 */
	int insertByRecord(@Param("a") Auctionrecord a);
	
	/* 根据拍卖品查看拍卖纪录 */
	List<Rau> queryByRid(@Param("auctionId") Integer auctionId);
	
	
}
