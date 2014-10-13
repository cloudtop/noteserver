package org.tarena.note.dao;

import org.tarena.note.entity.NoteStatus;
import org.tarena.note.util.MyBatisDao;

@MyBatisDao
public interface NoteStatusDao {
	public NoteStatus findByNoteStatusId(String noteStatusId);
}
