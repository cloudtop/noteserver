package org.tarena.note.service;

import org.tarena.note.entity.NoteResponse;

public interface UserService {
	public NoteResponse checkLogin(
			String name,String password);
}
