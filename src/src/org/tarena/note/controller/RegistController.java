package org.tarena.note.controller;

import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tarena.note.entity.NoteResponse;
import org.tarena.note.entity.User;
import org.tarena.note.service.UserService;

import sun.misc.BASE64Decoder;

@Controller

public class RegistController {
	@Resource
	private UserService service;
	@RequestMapping("/regist")
	@ResponseBody
	public NoteResponse update(HttpServletRequest request) throws Exception{
			//Basic name:pwd
			String author = request.getHeader("Authorization");
			String[] author_arr=author.split(" ");
			//对author_arr[1]进行base64解码
			BASE64Decoder decoder = new BASE64Decoder();
			byte[] bbs = decoder.decodeBuffer(author_arr[1]);
			String author_dec=new String(bbs);
			//将解码后的author_dec进行切割,获取用户名和密码
			String[] author_arr1=author_dec.split(":");
			String name=author_arr1[0];
			String password=author_arr1[1];
			User user = new User();
			user.setUserName(name);
			user.setUserPassword(password);
			UUID uuid = UUID.randomUUID();			
			user.setUserId(uuid.toString());
			service.addUser(user);
			NoteResponse re = new NoteResponse();
			re.setStatus("6");
			return re;
	}
}
