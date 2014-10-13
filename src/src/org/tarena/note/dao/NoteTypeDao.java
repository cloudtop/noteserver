package org.tarena.note.dao;

import org.tarena.note.entity.NoteType;
import org.tarena.note.util.MyBatisDao;
@MyBatisDao
public interface NoteTypeDao {
	public NoteType findByNoteTypeId(String noteTypeId);

}
