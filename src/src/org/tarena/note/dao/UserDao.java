package org.tarena.note.dao;

import org.tarena.note.entity.User;
import org.tarena.note.util.MyBatisDao;

@MyBatisDao
public interface UserDao {
	public User findByUserName(String name);
	public void add(User user);
}
