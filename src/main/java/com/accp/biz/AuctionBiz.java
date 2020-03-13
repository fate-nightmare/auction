package com.accp.biz;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.IAuctionDAO;
import com.accp.pojo.Auction;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionBiz {

	@Autowired
	private IAuctionDAO dao;
	
	/* 删除 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int moditydel(Integer auctionId) {
		return dao.del(auctionId);
	}
	
	/* 发布 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addinsert(Auction a) {
		return dao.insert(a);
	}
	
	/* 修改 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifyupdate(Auction a) {
		return dao.update(a);
	}
	
	/* 根据ID查询拍卖品 */
	public Auction queryById(Integer auctionId) {
		return dao.queryById(auctionId);
	}
	
	/* 查询拍卖列表 */
	public PageInfo<Auction> queryAll(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Auction>(dao.queryAll());
	}
	
	
}
