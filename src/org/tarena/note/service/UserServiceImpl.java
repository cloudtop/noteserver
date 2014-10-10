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
		
		User user = dao.findByName(name);
		if(user == null){
			res.setStatus("1");
			res.setMessage("�û���������");
			return res;
		}
		
		if(!user.getPassword().equals(password)){
			res.setStatus("2");
			res.setMessage("�������");
			return res;
		}
		
		res.setStatus("0");
		res.setMessage("�û�����������ȷ");
		//�䷢һ�����ƺ��û�ID
		Map map = new HashMap();
		map.put("userId", user.getId());
		map.put("token", NoteUtil.createUUID());
		res.setData(map);
		return res;
	}

}
