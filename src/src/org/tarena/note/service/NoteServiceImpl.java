package org.tarena.note.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.tarena.note.dao.NoteBookDao;
import org.tarena.note.dao.NoteDao;
import org.tarena.note.dao.ShareDao;
import org.tarena.note.dao.NoteStatusDao;
import org.tarena.note.entity.Note;
import org.tarena.note.entity.NoteBook;
import org.tarena.note.entity.NoteResponse;
import org.tarena.note.entity.Share;
import org.tarena.note.entity.NoteStatus;
import org.tarena.note.entity.NoteType;
import org.tarena.note.util.NoteUtil;

@Service
public class NoteServiceImpl implements NoteService {
	@Resource
	private NoteDao noteDao;
	@Resource
	private ShareDao shareDao;

	public NoteResponse addNote(String noteTitle, String userId,
			String notebookId) {
		NoteResponse res = new NoteResponse();
		Note note = noteDao.findByNoteTitle(noteTitle);
		if (note != null) {
			res.setStatus("1");
			res.setMessage("笔记已存在,请更改");
			return res;
		} else {
			res.setStatus("0");
			res.setMessage("可以创建笔记");
			String noteId = UUID.randomUUID().toString();
			note = new Note();
			note.setUserId(userId);
			note.setNoteId(noteId);
			note.setNotebookId(notebookId);
			note.setNoteStatusId("1");
			note.setNoteTypeId("1");			
			note.setNoteTitle(noteTitle);
			note.setNoteCreateTime(Long.parseLong(new Date(System
					.currentTimeMillis()).toString()));
			noteDao.addNote(note);
			res.setData(note);
			return res;
		}
	}

	public void updateNoteByNoteBody(String noteId, String noteBody) {
		Note note = noteDao.findNoteByNoteId(noteId);
		note.setNoteBody(noteBody);
		noteDao.updateNote(note);
	}

	public NoteResponse findNoteByUserId(String userId) {
		NoteResponse res = new NoteResponse();
		List<Note> list = noteDao.findByUserId(userId);
		if (list.size() != 0) {
			res.setStatus("0");
			res.setMessage("返回所有笔记");
			res.setData(list);
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("没有笔记");
			return res;
		}

	}

	public NoteResponse findNoteByNoteBookId(String notebookId) {
		NoteResponse res = new NoteResponse();
		List<Note> list = noteDao.findByNoteBookId(notebookId);
		if (list.size() != 0) {
			res.setStatus("0");
			res.setMessage("返回所有笔记");
			res.setData(list);
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("没有返回值");
			return res;
		}
	}

	public NoteResponse updateNoteToNoteType(String noteId) {
		NoteResponse res = new NoteResponse();
		Note note = noteDao.findNoteByNoteId(noteId);
		if (note != null) {
			note.setNoteTypeId("3");
			noteDao.updateNote(note);
			res.setStatus("0");
			res.setMessage("成功收藏");
			res.setData(note);
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("没有收藏");
			return res;
		}

	}

	public void updateNote(Note note) {
		noteDao.updateNote(note);

	}

	public NoteResponse deleteNoteByNoteId(String noteId) {
		NoteResponse res = new NoteResponse();
		Note note = noteDao.findNoteByNoteId(noteId);
		if (note != null) {
			note.setNoteTypeId("2");
			noteDao.updateNote(note);
			res.setStatus("0");
			res.setMessage("成功放入回收站");
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("没有成功放入回收站");
			return res;
		}
	}

	public NoteResponse updateNoteByNoteShare(String noteId) {
		NoteResponse res = new NoteResponse();
		Note note = noteDao.findNoteByNoteId(noteId);
		if (note != null) {
			note.setNoteStatusId("2");
			noteDao.updateNote(note);
			Share share = new Share();
			share.setNoteId(noteId);
			share.setShareId(UUID.randomUUID().toString());
			shareDao.addNoteShare(share);
			res.setStatus("0");
			res.setMessage("成功分享笔记");
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("没有分享成功");
			return res;
		}

	}

	public NoteResponse findNoteByNoteTitle(String noteTitle) {
		NoteResponse res = new NoteResponse();
		Note note = noteDao.findByNoteTitle(noteTitle);
		if (note != null) {
			res.setStatus("0");
			res.setMessage("查到笔记");
			res.setData(note);
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("没有查询到笔记");
			return res;
		}

	}

	public NoteResponse addNote(Note note) {
		NoteResponse res=new NoteResponse();		
		if(note==null){
			res.setStatus("1");
			res.setMessage("笔记不能为空");
			return res;			
		}else{
			note.setNoteId(NoteUtil.createUUID());
			noteDao.addNote(note);
			res.setStatus("0");
			res.setMessage("添加笔记成功");
			return res;
		}
		
	}

	public NoteResponse findDeleteNoteByNoteTypeId(String noteBookId) {
		NoteResponse res = new NoteResponse();
		List<Note> list = noteDao.findDeleteNoteByNoteTypeId(noteBookId);
		if(list.size()!=0){
			res.setStatus("0");
			res.setData(list);
		}
		return res;
	}

}
