package org.tarena.note.dao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tarena.note.dao.NoteBookDao;
import org.tarena.note.dao.NoteDao;
import org.tarena.note.entity.Note;
import org.tarena.note.entity.NoteBook;
import org.tarena.note.entity.NoteResponse;
import org.tarena.note.service.NoteBookService;

public class TestDao {
	//@Test
	public void test1(){
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		//�����û�����ѯuser
		//UserDao uDao=act.getBean(UserDao.class);
		//User user=uDao.findByUserName("test1");
		//System.out.println(user.getUserId());
		
			//�����û�ID��ѯ�û��ʼǱ�
		NoteBookDao notebookDao=act.getBean(NoteBookDao.class);
		/*List<NoteBook> list=notebookDao.findByUserId(user.getUserId());
		for(NoteBook notebook:list){
			System.out.println(notebook.getNotebookName());
		}
		*/
		
			//���ԱʼǱ���	
		/*	
		 *  ��
		NoteBook notebook=new NoteBook();
		notebook.setNotebookDesc("����ɹ�");
		notebook.setNotebookId("3");
		notebook.setNotebookName("���");
		notebook.setNotebookTypeId("18");
		notebook.setUserId("007");
		notebook.setNotebookCreatetime(new Timestamp(System.currentTimeMillis()));
		notebookDao.addNoteBook(notebook);
			��
		NoteBook notebook=notebookDao.findByNoteBookId("3");
		notebook.setUserId("010");
		notebookDao.updateNoteBook(notebook);
			ɾ	
		notebookDao.deleteNoteBook("3");*/
			//�����û�ID��ѯ�û��ʼ�
		NoteDao dao=act.getBean(NoteDao.class);
		/*List<Note> list=dao.findByUserId(user.getUserId());
		for(Note note:list){
			System.out.println(note.getNoteTypeId());
		}*/
		
		//���Աʼǵ���ɾ��
		/* ��
		 * Note note=new Note();
		note.setNoteId("4");
		note.setNotebookId("14");
		note.setUserId("007");
		note.setNoteStatusId("06");
		note.setNoteTypeId("30");
		note.setNoteTitle("����");
		note.setNoteBody("����");
		note.setNoteCreateTime(null);
		note.setNoteLastModifyTime(null);
		System.out.println(note.toString());
		dao.addNote(note);
		*/
		Note note=dao.findByNoteId("4");
		//dao.deleteNote("0");
		note.setUserId("010");
		dao.updateNote(note);
		
	}
	@Test
	public void testNoteBookAdd(){
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		NoteBookService notebookService=act.getBean(NoteBookService.class);		
		NoteResponse res=notebookService.addNoteBookByNoteBookName("wang","007");		
		System.out.println(res.getStatus()+" "+res.getMessage());
		
	}
	//@Test
	public void testNoteBookDelete(){
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		NoteBookService notebookService=act.getBean(NoteBookService.class);
		NoteBookDao notebookDao=act.getBean(NoteBookDao.class);
		NoteBook notebook=notebookDao.findByNoteBookName("jerry");		
		notebookService.deleteNoteBook(notebook);
	}
	//@Test
	public void testNoteBookUpdate(){
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		NoteBookService notebookService=act.getBean(NoteBookService.class);
		NoteBookDao notebookDao=act.getBean(NoteBookDao.class);			
		NoteBook notebook=notebookDao.findByNoteBookName("tom");
		notebook.setNotebookName("jerry");
		notebook.setUserId("110");
		notebookService.updateNoteBook(notebook);
		
		System.out.println(notebook.getNotebookName()+" "+notebook.getUserId());
		
	}
	//@Test
	public void testNoteBookFindByUserID(){
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		NoteBookService notebookService=act.getBean(NoteBookService.class);
		NoteBookDao notebookDao=act.getBean(NoteBookDao.class);			
		NoteBook notebook=notebookDao.findByNoteBookName("tom");
			notebookService.findNoteBookByUserId(notebook.getUserId());
	}
}
