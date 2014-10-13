package org.tarena.note.service;

import java.util.List;

import org.tarena.note.entity.NoteBook;
import org.tarena.note.entity.NoteResponse;

public interface NoteBookService {
	//传入用户ID查找笔记本
	public NoteResponse findNoteBookByUserId(String userId);
	//传入笔记本名称添加笔记本
	public NoteResponse addNoteBookByNoteBookName(String notebookName,String userId);
	//传入笔记本根据传入的数据修改笔记本
	public NoteResponse updateNoteBook(NoteBook notebook);
	//传入笔记本根据笔记本直接删除笔记本不放入回收站
	public NoteResponse deleteNoteBook(NoteBook notebook);
}
