package org.tarena.note.dao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tarena.note.dao.UserDao;
import org.tarena.note.entity.User;

public class TestUserDao {
	public static void main(String[] args){
		String conf = "applicationContext.xml";
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext(conf);
		UserDao dao = (UserDao)
			ac.getBean("userDao");
		System.out.println(dao.getClass().getName());
		User user = dao.findByName("tom");
		System.out.println(user.getName()+" "+user.getPassword());
	}
}
