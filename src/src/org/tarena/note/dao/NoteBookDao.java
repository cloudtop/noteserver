package org.tarena.note.dao;

import java.util.List;

import org.tarena.note.util.MyBatisDao;
import org.tarena.note.entity.NoteBook;
@MyBatisDao
public interface NoteBookDao {
	public List<NoteBook> findByUserId(String userId);
	
	public List<NoteBook> findByNoteBookTypeId(String notebookTypeId);
	
	public NoteBook findByNoteBookId(String notebookId);
	
	public NoteBook findByNoteBookName(String notebookName);
	
	public void addNoteBook(NoteBook notebook);
	
	public void deleteNoteBook(String notebookId);
	
	public void updateNoteBook(NoteBook notebook);
	
}
