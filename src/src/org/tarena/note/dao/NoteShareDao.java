package org.tarena.note.dao;

import org.tarena.note.entity.NoteShare;
import org.tarena.note.util.MyBatisDao;

@MyBatisDao
public interface NoteShareDao {
	public NoteShare findByNoteId(String noteId);
}
