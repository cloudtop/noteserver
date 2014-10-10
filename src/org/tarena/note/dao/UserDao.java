package org.tarena.note.dao;

import org.tarena.note.entity.User;
import org.tarena.note.util.MyBatisDao;

@MyBatisDao
public interface UserDao {
	public User findByName(String name);
}
