package com.accp.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("auctionrecord")
public class Auctionrecord {
	private Integer id;
	private Integer userId;
	private Integer auctionId;
	@JSONField(format="yyyy-MM-dd")
	private Date auctionTime;
	private Double auctionPrice;
	
	
	@Override
	public String toString() {
		return "Auctionrecord [id=" + id + ", userId=" + userId + ", auctionId=" + auctionId + ", auctionTime="
				+ auctionTime + ", auctionPrice=" + auctionPrice + "]";
	}

	public Auctionrecord(Integer id, Integer userId, Integer auctionId, Date auctionTime, Double auctionPrice) {
		super();
		this.id = id;
		this.userId = userId;
		this.auctionId = auctionId;
		this.auctionTime = auctionTime;
		this.auctionPrice = auctionPrice;
	}
	
	public Auctionrecord() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(Integer auctionId) {
		this.auctionId = auctionId;
	}
	public Date getAuctionTime() {
		return auctionTime;
	}
	public void setAuctionTime(Date auctionTime) {
		this.auctionTime = auctionTime;
	}
	public Double getAuctionPrice() {
		return auctionPrice;
	}
	public void setAuctionPrice(Double auctionPrice) {
		this.auctionPrice = auctionPrice;
	}
	
}
