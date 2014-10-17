package org.tarena.note.dao;

import java.util.List;

import org.tarena.note.entity.Note;
import org.tarena.note.util.MyBatisDao;
@MyBatisDao
public interface NoteDao {
	//�����û�Id��ʼ�
	public List<Note> findByUserId(String userId);
	//���ݱʼǱ�Id��ʼ�
	public List<Note> findByNoteBookId(String notebookId);
	//���ݱʼ�״̬Id��ʼ�
	public List<Note> findByNoteStatusId(String noteStatusId);
	//���ݱʼ�����Id��ʼ�
	public List<Note> findByNoteTypeId(String noteTypeId);
	//���ݱʼ�Id��ʼ�
	public Note findNoteByNoteId(String noteId);
	//���ݱʼǱ����ʼ�
	public Note findByNoteTitle(String noteTitle);
	//��ӱʼ�
	public void addNote(Note note);
	//���ݱʼ�Idɾ���ʼ�
	public void deleteNote(String noteId);
	//���ݱʼ��޸ıʼ�
	public void updateNote(Note note);
	//���ݱʼ�����ID���һ���վ�еıʼ�
	public List<Note> findDeleteNoteByNoteTypeId(String noteBookId);
	
}
