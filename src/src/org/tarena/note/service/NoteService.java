package org.tarena.note.service;

import java.util.List;

import org.tarena.note.entity.Note;
import org.tarena.note.entity.NoteResponse;
import org.tarena.note.entity.NoteType;

public interface NoteService {
	//传入笔记增加笔记
	public NoteResponse addNote(Note note);
	//传入笔记标题、用户Id、笔记本Id创建笔记
	public NoteResponse addNote(String noteTitle,String userId,String notebookId);
	//根据用户Id查询所有笔记	
	public NoteResponse findNoteByUserId(String userId);
	//根据笔记本Id查询笔记本中的所有笔记
	public NoteResponse findNoteByNoteBookId(String notebookId);
	//根据笔记标题查询笔记
	public NoteResponse findNoteByNoteTitle(String noteTitle);	
	//传入笔记Id、笔记内容 修改笔记内容
	public void updateNoteByNoteBody(String noteId,String noteBody);	
	//传入笔记Id，修改笔记类型 为收藏 3 normal:正常 1,recycle:回收站 2,favorites:收藏 3,action:活动 4	
	public NoteResponse updateNoteToNoteType(String noteId);
	//将指定笔记设置分享
	public NoteResponse updateNoteByNoteShare(String noteId);
	//传入笔记 修改笔记
	public void updateNote(Note note);
	//根据笔记Id删除笔记，将笔记放入回收站 normal:正常 1 recycle:回收站 2	
	public NoteResponse deleteNoteByNoteId(String noteId);
	//根据笔记类型ID查找回收站中的笔记
	public NoteResponse findDeleteNoteByNoteTypeId(String noteBookId);

	
}
