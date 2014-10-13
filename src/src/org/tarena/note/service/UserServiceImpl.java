package org.tarena.note.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.tarena.note.dao.UserDao;
import org.tarena.note.entity.NoteResponse;
import org.tarena.note.entity.User;
import org.tarena.note.util.NoteUtil;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao dao;
	
	public NoteResponse checkLogin(
			String name, 
			String password) {
		
		NoteResponse res = new NoteResponse();
		
		User user = dao.findByUserName(name);
		if(user == null){
			res.setStatus("1");
			res.setMessage("用户名不存在");
			return res;
		}
		
		if(!user.getUserPassword().equals(password)){
			res.setStatus("2");
			res.setMessage("密码错误");
			return res;
		}
		
		res.setStatus("0");
		res.setMessage("用户名和密码正确");
		Map map = new HashMap();
		map.put("userId",user.getUserId());
		map.put("token",NoteUtil.createUUID());
		res.setData(map);
		return res;
	}
	public void addUser(User user){
		dao.add(user);
	}
	public User findByName(String name){
		return dao.findByUserName(name);
	}

}
