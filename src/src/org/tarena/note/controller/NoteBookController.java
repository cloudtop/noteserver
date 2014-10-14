package org.tarena.note.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tarena.note.entity.NoteBook;
import org.tarena.note.entity.NoteResponse;
import org.tarena.note.service.NoteBookService;

@Controller
@RequestMapping("/NoteBook")
public class NoteBookController {
	@Resource
	private NoteBookService service;
	@RequestMapping("/add")
	@ResponseBody
	public NoteResponse add(@RequestParam("notebookname") String notebookname,
						HttpServletRequest request){
		
		String userId= (String)request.getSession().getAttribute("userId");
		NoteResponse res = service.addNoteBookByNoteBookName(notebookname,userId);
		return res;
	}
	@RequestMapping("/findAllNoteBook")
	@ResponseBody
	public NoteResponse finaAllNoteBook(HttpServletRequest request){
		String userId=(String)request.getSession().getAttribute("userId");
		System.out.println(userId);
		NoteResponse res = service.findNoteBookByUserId(userId);
		return res;
	}
	@RequestMapping("/updataNoteBookName")
	@ResponseBody
	public NoteResponse updataNoteBookName(
			@RequestParam("prename") String prename,
			@RequestParam("newname") String newname){
		NoteBook notebook = service.findByNoteBookName(prename);
		notebook.setNotebookName(newname);
		NoteResponse res = service.updateNoteBook(notebook);
		return res;
	}
}
