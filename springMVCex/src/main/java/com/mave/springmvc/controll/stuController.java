package com.mave.springmvc.controll;

import org.springframework.stereotype.Controller;

import com.mave.springmvc.Enti.studentEnti;

@Controller
public class stuController {
	
	public String savestu(studentEnti studentEnti) {
		
		return "stu";
		
	}

}
