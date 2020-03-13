package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.IRauDAO;
import com.accp.vo.Rau;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class RauBiz {

	@Autowired
	private IRauDAO dao;
	
	/* 已拍卖商品 */
	public List<Rau> queryByMinTime(){
		return dao.queryByMinTime();
	}
	
	/* 查询拍卖中的商品 */
	public PageInfo<Rau> queryByMaxTime(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Rau>(dao.queryByMaxTime());
	}
	
	
}
