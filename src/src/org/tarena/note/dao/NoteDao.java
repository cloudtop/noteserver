package org.tarena.note.dao;

import java.util.List;

import org.tarena.note.entity.Note;
import org.tarena.note.util.MyBatisDao;
@MyBatisDao
public interface NoteDao {
	public List<Note> findByUserId(String userId);
	
	public List<Note> findByNoteBookId(String notebookId);
	
	public Note findByNoteId(String noteId);
	
	public Note findByNoteTitle(String noteTitle);
	
	public void addNote(Note note);
	
	public void deleteNote(String noteId);
	
	public void updateNote(Note note);
}
