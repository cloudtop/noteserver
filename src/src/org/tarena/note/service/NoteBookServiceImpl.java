package org.tarena.note.service;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.tarena.note.dao.NoteBookDao;
import org.tarena.note.dao.NoteDao;
import org.tarena.note.entity.Note;
import org.tarena.note.entity.NoteBook;
import org.tarena.note.entity.NoteResponse;

@Service
public class NoteBookServiceImpl implements NoteBookService {
	@Resource
	private NoteBookDao notebookDao;
	@Resource
	private NoteDao noteDao;
	
	public NoteResponse addNoteBookByNoteBookName(String notebookName,String userId) {
		NoteBook notebook=notebookDao.findByNoteBookName(notebookName);
		NoteResponse res=new NoteResponse();
		
		if(notebook!=null){
			res.setStatus("1");
			res.setMessage("笔记本已存在");
			return res;
		}else {
			res.setStatus("0");
			res.setMessage("可以创建笔记本");
			String notebookId=UUID.randomUUID().toString();
			notebook=new NoteBook();
			notebook.setNotebookName(notebookName);
			notebook.setNotebookId(notebookId);
			notebook.setUserId(userId);
			notebookDao.addNoteBook(notebook);
			res.setData(notebook);
			return res;
		}

	}

	public NoteResponse updateNoteBook(NoteBook notebook) {
		notebookDao.updateNoteBook(notebook);
		NoteResponse res=new NoteResponse();
		res.setStatus("0");
		res.setMessage("修改成功");
		res.setData(notebook);
		return res;
		
	}

	public NoteResponse deleteNoteBook(NoteBook notebook) {
		NoteResponse res=new NoteResponse();
		List<Note> list=noteDao.findByNoteBookId(notebook.getNotebookId());
		if(list.size()!=0){
			res.setStatus("1");
			res.setMessage("笔记本中还有未删除的笔记，不能删除此笔记本");
			return res;
		}else {
			res.setStatus("0");
			res.setMessage("可以删除此笔记本");
			notebookDao.deleteNoteBook(notebook.getNotebookId());
			return res;
		}		
	}
	public NoteResponse findNoteBookByUserId(String userId) {
		List<NoteBook> list=notebookDao.findByUserId(userId);
		NoteResponse res = new NoteResponse();
		res.setData(list);
		return res;
	}


}
