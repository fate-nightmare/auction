package com.accp.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.UserBiz;
import com.accp.pojo.Auctionuser;

@RestController
@RequestMapping("/api/user")
public class UserAction {

	@Autowired
	private UserBiz biz;
	
	/**
	 *  根据登录人查询ID 
	 * @param userId
	 * @return
	 */
	@GetMapping("/queryByUserName/{userName}")
	public Auctionuser queryByUserName(@PathVariable String userName) {
		return biz.queryByUserName(userName);
	}
	
	/**
	 * 登录
	 * @param session
	 * @param l
	 * @return
	 */
	@GetMapping("/login/{userName}/{userPassword}")
	public Auctionuser login(HttpSession session,@PathVariable String userName,@PathVariable String userPassword) {
		System.out.println("=============="+biz.login(userName, userPassword));
		Auctionuser i = biz.login(userName, userPassword);
		if(i != null) {
			session.setAttribute("login", new Auctionuser(null, userName,userPassword, null, null, null, null, null, null, null));
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}
		return i;
	} 
	
	@GetMapping("/login/session")
	public Auctionuser queryBySession(HttpSession session) {
		return (Auctionuser) session.getAttribute("login");
	}
	
	/**
	 * 注册
	 * @param u
	 * @return
	 */
	@PostMapping("/register")
	public Map<String, Object> register(@RequestBody Auctionuser u) {
		Map<String, Object> message = new HashMap<String, Object>();
		int i = biz.register(u);
		if(i > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	
}
