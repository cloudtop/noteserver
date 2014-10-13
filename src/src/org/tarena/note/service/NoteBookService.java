package org.tarena.note.service;

import java.util.List;

import org.tarena.note.entity.NoteBook;
import org.tarena.note.entity.NoteResponse;

public interface NoteBookService {
	//�����û�ID���ұʼǱ�
	public NoteResponse findNoteBookByUserId(String userId);
	//����ʼǱ�������ӱʼǱ�
	public NoteResponse addNoteBookByNoteBookName(String notebookName,String userId);
	//����ʼǱ����ݴ���������޸ıʼǱ�
	public NoteResponse updateNoteBook(NoteBook notebook);
	//����ʼǱ����ݱʼǱ�ֱ��ɾ���ʼǱ����������վ
	public NoteResponse deleteNoteBook(NoteBook notebook);
}
