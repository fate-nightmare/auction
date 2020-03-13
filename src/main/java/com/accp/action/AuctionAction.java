package com.accp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.AuctionBiz;
import com.accp.pojo.Auction;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/list")
public class AuctionAction {

	@Autowired
	private AuctionBiz biz;
	
	/**
	 *  删除 
	 * @param auctionId
	 * @return
	 */
	@DeleteMapping("/del/{auctionId}")
	public Map<String, Object> del(@PathVariable Integer auctionId) {
		Map<String, Object> message = new HashMap<String, Object>();
		int i = biz.moditydel(auctionId);
		if(i > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 *  发布 
	 * @param a
	 * @return
	 */
	@PostMapping("/insert")
	public Map<String, Object> insert(@RequestBody Auction a) {
		Map<String, Object> message = new HashMap<String, Object>();
		int i = biz.addinsert(a);
		if(i > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 * 修改
	 * @param a
	 * @return
	 */
	@PutMapping("/update")
	public Map<String, Object> update(@RequestBody Auction a) {
		Map<String, Object> message = new HashMap<String, Object>();
		int i = biz.modifyupdate(a);
		if(i > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 *  根据ID查询拍卖品 
	 * @param auctionId
	 * @return
	 */
	@GetMapping("/queryById/{auctionId}")
	public Auction queryById(@PathVariable Integer auctionId) {
		return biz.queryById(auctionId);
	}
	
	/**
	 * 查询拍卖列表
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Auction> queryAll(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		return biz.queryAll(pageNum, pageSize);
	}
	
}
