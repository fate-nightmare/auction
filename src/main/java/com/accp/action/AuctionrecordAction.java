package com.accp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.AuctionrecordBiz;
import com.accp.pojo.Auctionrecord;
import com.accp.vo.Rau;

@RestController
@RequestMapping("/api/r")
public class AuctionrecordAction {

	@Autowired
	private AuctionrecordBiz biz;
	
	/**
	 *  竞拍
	 * @param a
	 * @return
	 */
	@PostMapping("/insertByRecord")
	public Map<String, Object> insertByRecord(@RequestBody Auctionrecord a) {
		Map<String, Object> message = new HashMap<String, Object>();
		int i = biz.addinsertByRecord(a);
		if(i > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 *  根据拍卖品查看拍卖纪录
	 * @param auctionId
	 * @return
	 */
	@GetMapping("/queryByRid/{auctionId}")
	public List<Rau> queryByRid(@PathVariable Integer auctionId){
		return biz.queryByRid(auctionId);
	}
	
	
}
