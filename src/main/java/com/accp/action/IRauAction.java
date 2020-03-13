package com.accp.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.RauBiz;
import com.accp.vo.Rau;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/rau")
public class IRauAction {

	@Autowired
	private RauBiz biz;
	
	/**
	 *  已拍卖商品 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/queryByMinTime")
	public List<Rau> queryByMinTime(){
		return biz.queryByMinTime();
	}
	
	/**
	 * 查询拍卖中的商品 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Rau> queryByMaxTime(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		return biz.queryByMaxTime(pageNum, pageSize);
	}
	
}
