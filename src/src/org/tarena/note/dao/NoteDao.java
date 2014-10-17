package org.tarena.note.dao;

import java.util.List;

import org.tarena.note.entity.Note;
import org.tarena.note.util.MyBatisDao;
@MyBatisDao
public interface NoteDao {
	//根据用户Id查笔记
	public List<Note> findByUserId(String userId);
	//根据笔记本Id查笔记
	public List<Note> findByNoteBookId(String notebookId);
	//根据笔记状态Id查笔记
	public List<Note> findByNoteStatusId(String noteStatusId);
	//根据笔记类型Id查笔记
	public List<Note> findByNoteTypeId(String noteTypeId);
	//根据笔记Id查笔记
	public Note findNoteByNoteId(String noteId);
	//根据笔记标题查笔记
	public Note findByNoteTitle(String noteTitle);
	//添加笔记
	public void addNote(Note note);
	//根据笔记Id删除笔记
	public void deleteNote(String noteId);
	//根据笔记修改笔记
	public void updateNote(Note note);
	//根据笔记类型ID查找回收站中的笔记
	public List<Note> findDeleteNoteByNoteTypeId(String noteBookId);
	
}
