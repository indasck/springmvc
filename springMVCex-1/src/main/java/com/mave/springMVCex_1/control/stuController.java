package com.mave.springMVCex_1.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mave.springMVCex_1.enti.studententi;
import com.mave.springMVCex_1.service.stuService;

import ch.qos.logback.core.status.Status;

@Controller
public class stuController {

	@Autowired
	private stuService stuService;
	
	@GetMapping("/")
	public String getid(Model model) {
		   studententi studententiobj= new studententi();
		   model.addAttribute("studententi",studententiobj);
		   //studententiobj.setSname("lalitha");
		return "stu";
		
	}
	
	@PostMapping("/studententi")
	public String savestu(Model model,studententi studententi) {
		   boolean studentsave = stuService.savestu(studententi);
		   if(studentsave) {
			   model.addAttribute("msg","it is exists");
		   }else {
			   model.addAttribute("emsg","it isn't exist" );
		   }
		return "stu";
		
	}
	
	
}
