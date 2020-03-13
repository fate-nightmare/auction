package com.accp.vo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Rau {
	private Integer id;
	private Integer userId;
	private Integer auctionId;
	@JSONField(format="yyyy-MM-dd")
	private Date auctionTime;
	private Double auctionPrice;
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
	private String userName;
	private String userPassword;
	private String userCardNo;
	private String userTel;
	private String userAddress;
	private String userPostNumber;
	private String userIsadmin;
	private String userQuestion;
	private String userAnswer;
	
	
	@Override
	public String toString() {
		return "Rau [id=" + id + ", userId=" + userId + ", auctionId=" + auctionId + ", auctionTime=" + auctionTime
				+ ", auctionPrice=" + auctionPrice + ", auctionName=" + auctionName + ", auctionStartPrice="
				+ auctionStartPrice + ", auctionUpset=" + auctionUpset + ", auctionStartTime=" + auctionStartTime
				+ ", auctionEndTime=" + auctionEndTime + ", auctionPic=" + auctionPic + ", auctionPicType="
				+ auctionPicType + ", auctionDesc=" + auctionDesc + ", userName=" + userName + ", userPassword="
				+ userPassword + ", userCardNo=" + userCardNo + ", userTel=" + userTel + ", userAddress=" + userAddress
				+ ", userPostNumber=" + userPostNumber + ", userIsadmin=" + userIsadmin + ", userQuestion="
				+ userQuestion + ", userAnswer=" + userAnswer + "]";
	}

	public Rau(Integer id, Integer userId, Integer auctionId, Date auctionTime, Double auctionPrice, String auctionName,
			Double auctionStartPrice, Double auctionUpset, Date auctionStartTime, Date auctionEndTime,
			String auctionPic, String auctionPicType, String auctionDesc, String userName, String userPassword,
			String userCardNo, String userTel, String userAddress, String userPostNumber, String userIsadmin,
			String userQuestion, String userAnswer) {
		super();
		this.id = id;
		this.userId = userId;
		this.auctionId = auctionId;
		this.auctionTime = auctionTime;
		this.auctionPrice = auctionPrice;
		this.auctionName = auctionName;
		this.auctionStartPrice = auctionStartPrice;
		this.auctionUpset = auctionUpset;
		this.auctionStartTime = auctionStartTime;
		this.auctionEndTime = auctionEndTime;
		this.auctionPic = auctionPic;
		this.auctionPicType = auctionPicType;
		this.auctionDesc = auctionDesc;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userCardNo = userCardNo;
		this.userTel = userTel;
		this.userAddress = userAddress;
		this.userPostNumber = userPostNumber;
		this.userIsadmin = userIsadmin;
		this.userQuestion = userQuestion;
		this.userAnswer = userAnswer;
	}
	
	public Rau() {
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserCardNo() {
		return userCardNo;
	}
	public void setUserCardNo(String userCardNo) {
		this.userCardNo = userCardNo;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPostNumber() {
		return userPostNumber;
	}
	public void setUserPostNumber(String userPostNumber) {
		this.userPostNumber = userPostNumber;
	}
	public String getUserIsadmin() {
		return userIsadmin;
	}
	public void setUserIsadmin(String userIsadmin) {
		this.userIsadmin = userIsadmin;
	}
	public String getUserQuestion() {
		return userQuestion;
	}
	public void setUserQuestion(String userQuestion) {
		this.userQuestion = userQuestion;
	}
	public String getUserAnswer() {
		return userAnswer;
	}
	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}
	
}
