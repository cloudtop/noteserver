package org.tarena.note.service;

import org.tarena.note.entity.NoteResponse;
import org.tarena.note.entity.User;

public interface UserService {
	public NoteResponse checkLogin(
			String name,String password);
	public void addUser(User user);
}
