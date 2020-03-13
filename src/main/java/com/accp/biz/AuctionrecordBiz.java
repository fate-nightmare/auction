package com.accp.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.IAuctionrecordDAO;
import com.accp.pojo.Auctionrecord;
import com.accp.vo.Rau;

@Service
public class AuctionrecordBiz {

	@Autowired
	private IAuctionrecordDAO dao;
	
	/* 竞拍 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addinsertByRecord(Auctionrecord a) {
		return dao.insertByRecord(a);
	}
	
	/* 根据拍卖品查看拍卖纪录 */
	public List<Rau> queryByRid(Integer auctionId){
		return dao.queryByRid(auctionId);
	}
	
	
}
