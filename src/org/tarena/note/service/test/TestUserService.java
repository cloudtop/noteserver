package org.tarena.note.service.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tarena.note.entity.NoteResponse;
import org.tarena.note.service.UserService;

public class TestUserService {

	/**
	 * @param args
	 */
	@Test
	public void test1(){
		String conf = "applicationContext.xml";
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext(conf);
		UserService service = (UserService)
			ac.getBean("userServiceImpl");
		NoteResponse res = 
			service.checkLogin("tom", "123");
		Assert.assertEquals("0", res.getStatus());
	}
	
	@Test
	public void test2(){
		String conf = "applicationContext.xml";
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext(conf);
		UserService service = (UserService)
			ac.getBean("userServiceImpl");
		NoteResponse res = 
			service.checkLogin("tom", "111");
		Assert.assertEquals("1", res.getStatus());
	}
	
	@Test
	public void test3(){
		String conf = "applicationContext.xml";
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext(conf);
		UserService service = (UserService)
			ac.getBean("userServiceImpl");
		NoteResponse res = 
			service.checkLogin("11", "11");
		Assert.assertEquals("0", res.getStatus());
	}
	
	

}
