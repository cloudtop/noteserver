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
			res.setMessage("�ʼ��Ѵ���,�����");
			return res;
		} else {
			res.setStatus("0");
			res.setMessage("���Դ����ʼ�");
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
			res.setMessage("�������бʼ�");
			res.setData(list);
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("û�бʼ�");
			return res;
		}

	}

	public NoteResponse findNoteByNoteBookId(String notebookId) {
		NoteResponse res = new NoteResponse();
		List<Note> list = noteDao.findByNoteBookId(notebookId);
		if (list.size() != 0) {
			res.setStatus("0");
			res.setMessage("�������бʼ�");
			res.setData(list);
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("û�з���ֵ");
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
			res.setMessage("�ɹ��ղ�");
			res.setData(note);
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("û���ղ�");
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
			res.setMessage("�ɹ��������վ");
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("û�гɹ��������վ");
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
			res.setMessage("�ɹ�����ʼ�");
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("û�з���ɹ�");
			return res;
		}

	}

	public NoteResponse findNoteByNoteTitle(String noteTitle) {
		NoteResponse res = new NoteResponse();
		Note note = noteDao.findByNoteTitle(noteTitle);
		if (note != null) {
			res.setStatus("0");
			res.setMessage("�鵽�ʼ�");
			res.setData(note);
			return res;
		} else {
			res.setStatus("1");
			res.setMessage("û�в�ѯ���ʼ�");
			return res;
		}

	}

	public NoteResponse addNote(Note note) {
		NoteResponse res=new NoteResponse();		
		if(note==null){
			res.setStatus("1");
			res.setMessage("�ʼǲ���Ϊ��");
			return res;			
		}else{
			note.setNoteId(NoteUtil.createUUID());
			noteDao.addNote(note);
			res.setStatus("0");
			res.setMessage("��ӱʼǳɹ�");
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
