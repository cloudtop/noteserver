package org.tarena.note.service;

import java.util.List;

import org.tarena.note.entity.Note;
import org.tarena.note.entity.NoteResponse;
import org.tarena.note.entity.NoteType;

public interface NoteService {
	//����ʼ����ӱʼ�
	public NoteResponse addNote(Note note);
	//����ʼǱ��⡢�û�Id���ʼǱ�Id�����ʼ�
	public NoteResponse addNote(String noteTitle,String userId,String notebookId);
	//�����û�Id��ѯ���бʼ�	
	public NoteResponse findNoteByUserId(String userId);
	//���ݱʼǱ�Id��ѯ�ʼǱ��е����бʼ�
	public NoteResponse findNoteByNoteBookId(String notebookId);
	//���ݱʼǱ����ѯ�ʼ�
	public NoteResponse findNoteByNoteTitle(String noteTitle);	
	//����ʼ�Id���ʼ����� �޸ıʼ�����
	public void updateNoteByNoteBody(String noteId,String noteBody);	
	//����ʼ�Id���޸ıʼ����� Ϊ�ղ� 3 normal:���� 1,recycle:����վ 2,favorites:�ղ� 3,action:� 4	
	public NoteResponse updateNoteToNoteType(String noteId);
	//��ָ���ʼ����÷���
	public NoteResponse updateNoteByNoteShare(String noteId);
	//����ʼ� �޸ıʼ�
	public void updateNote(Note note);
	//���ݱʼ�Idɾ���ʼǣ����ʼǷ������վ normal:���� 1 recycle:����վ 2	
	public NoteResponse deleteNoteByNoteId(String noteId);
	//���ݱʼ�����ID���һ���վ�еıʼ�
	public NoteResponse findDeleteNoteByNoteTypeId(String noteBookId);

	
}
