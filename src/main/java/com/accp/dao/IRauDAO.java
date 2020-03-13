package com.accp.dao;

import java.util.List;

import com.accp.vo.Rau;

public interface IRauDAO {
	
	/* 已拍卖商品 */
	List<Rau> queryByMinTime();

	/* 查询拍卖中的商品 */
	List<Rau> queryByMaxTime();
	
}
