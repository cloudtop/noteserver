package org.tarena.note.dao;

import org.tarena.note.entity.NoteBookType;
import org.tarena.note.util.MyBatisDao;

@MyBatisDao
public interface NoteBookTypeDao {
	public NoteBookType findByNoteBookTypeName(String notebookTypeName);

}
