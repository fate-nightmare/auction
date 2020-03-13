package com.accp.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("auction")
public class Auction {
	private Integer auctionId;
	private String auctionName;
	private Double auctionStartPrice;
	private Double auctionUpset;
	@JSONField(format="yyyy-MM-dd")
	private Date auctionStartTime;
	@JSONField(format="yyyy-MM-dd")
	private Date auctionEndTime;
	private String auctionPic;
	private String auctionPicType;
	private String auctionDesc;
	
	
	@Override
	public String toString() {
		return "Auction [auctionId=" + auctionId + ", auctionName=" + auctionName + ", auctionStartPrice="
				+ auctionStartPrice + ", auctionUpset=" + auctionUpset + ", auctionStartTime=" + auctionStartTime
				+ ", auctionEndTime=" + auctionEndTime + ", auctionPic=" + auctionPic + ", auctionPicType="
				+ auctionPicType + ", auctionDesc=" + auctionDesc + "]";
	}

	public Auction(Integer auctionId, String auctionName, Double auctionStartPrice, Double auctionUpset,
			Date auctionStartTime, Date auctionEndTime, String auctionPic, String auctionPicType, String auctionDesc) {
		super();
		this.auctionId = auctionId;
		this.auctionName = auctionName;
		this.auctionStartPrice = auctionStartPrice;
		this.auctionUpset = auctionUpset;
		this.auctionStartTime = auctionStartTime;
		this.auctionEndTime = auctionEndTime;
		this.auctionPic = auctionPic;
		this.auctionPicType = auctionPicType;
		this.auctionDesc = auctionDesc;
	}
	
	public Auction() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(Integer auctionId) {
		this.auctionId = auctionId;
	}
	public String getAuctionName() {
		return auctionName;
	}
	public void setAuctionName(String auctionName) {
		this.auctionName = auctionName;
	}
	public Double getAuctionStartPrice() {
		return auctionStartPrice;
	}
	public void setAuctionStartPrice(Double auctionStartPrice) {
		this.auctionStartPrice = auctionStartPrice;
	}
	public Double getAuctionUpset() {
		return auctionUpset;
	}
	public void setAuctionUpset(Double auctionUpset) {
		this.auctionUpset = auctionUpset;
	}
	public Date getAuctionStartTime() {
		return auctionStartTime;
	}
	public void setAuctionStartTime(Date auctionStartTime) {
		this.auctionStartTime = auctionStartTime;
	}
	public Date getAuctionEndTime() {
		return auctionEndTime;
	}
	public void setAuctionEndTime(Date auctionEndTime) {
		this.auctionEndTime = auctionEndTime;
	}
	public String getAuctionPic() {
		return auctionPic;
	}
	public void setAuctionPic(String auctionPic) {
		this.auctionPic = auctionPic;
	}
	public String getAuctionPicType() {
		return auctionPicType;
	}
	public void setAuctionPicType(String auctionPicType) {
		this.auctionPicType = auctionPicType;
	}
	public String getAuctionDesc() {
		return auctionDesc;
	}
	public void setAuctionDesc(String auctionDesc) {
		this.auctionDesc = auctionDesc;
	}
	
}
