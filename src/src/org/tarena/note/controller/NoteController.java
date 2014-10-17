package org.tarena.note.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tarena.note.entity.Note;
import org.tarena.note.entity.NoteResponse;
import org.tarena.note.service.NoteBookService;
import org.tarena.note.service.NoteService;

@Controller
@RequestMapping("/note")
public class NoteController {
	@Resource
	private NoteService noteService;
	@Resource
	private NoteBookService notebookService;
	@RequestMapping("/findAllNote")
	@ResponseBody
	public NoteResponse findAllNote(@RequestParam("notebookId") String notebookId){
		NoteResponse res = noteService.findNoteByNoteBookId(notebookId);
		return res;
	}
	@RequestMapping(value="findNoteByNoteBookId",method=RequestMethod.GET)
	@ResponseBody
	public NoteResponse findNoteByNoteBookId(HttpServletRequest request){
		NoteResponse res=new NoteResponse();
		String notebookId=(String)request.getSession().getAttribute("notebookId");
		res=noteService.findNoteByNoteBookId(notebookId);
		return res;
	}
	//在指定笔记本中添加笔记
	@RequestMapping(value="/addNote",method=RequestMethod.POST)
	@ResponseBody
	public NoteResponse addNote(Note note){
		NoteResponse res=new NoteResponse();
		res=noteService.addNote(note);
		return res;
	}
	//修改笔记内容
	@RequestMapping(value="/updateNote",method=RequestMethod.PUT)
	@ResponseBody
	public NoteResponse updateNote(@RequestParam("noteId")String noteId,@RequestParam("noteBody")String noteBody){
		NoteResponse res=new NoteResponse();
		res.setStatus("1");
		res.setMessage("没有修改笔记成功");
		noteService.updateNoteByNoteBody(noteId, noteBody);
		res.setStatus("0");
		res.setMessage("修改笔记成功");
		return res;		
	}
	@RequestMapping(value="deleteNote",method=RequestMethod.DELETE)
	public NoteResponse deleteNote(@RequestParam("noteId")String noteId){
		NoteResponse res=new NoteResponse();
		res=noteService.deleteNoteByNoteId(noteId);
		return res;			
	}
	@RequestMapping("/findDeleteNote")
	@ResponseBody
	public NoteResponse findDeleteNoteByNoteTypeId(@RequestParam("notebookId")String noteBookId){
		NoteResponse res = noteService.findNoteByNoteBookId(noteBookId);
		return res;
	}
}
