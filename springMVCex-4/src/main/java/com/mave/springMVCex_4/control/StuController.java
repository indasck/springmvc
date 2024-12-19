package com.mave.springMVCex_4.control;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mave.springMVCex_4.Entit.Student;
import com.mave.springMVCex_4.serv.StuServiceImpl;

@Controller
public class StuController {
	
	private StuServiceImpl serviceImpl;

	public StuController(StuServiceImpl serviceImpl) {
		super();
		this.serviceImpl = serviceImpl;
	}
	
	@GetMapping("/")
	public String getdata(Model model) {
		
		return "create";
	}
	
	
	@PostMapping("/savestu")
    public ModelAndView stusave(Student stu) {
		 boolean studentsave= serviceImpl.saveStudent(stu);
    	ModelAndView mav= new ModelAndView();
    	if(studentsave) {
    		mav.addObject("msg", "it save successfully");
    	}else {
    		mav.addObject("emsg","it doesn't saved");
    	}
    	
    	mav.setViewName("create");
    	
		return mav;
    	
    }
	
	@GetMapping("/getallstu")
	public ModelAndView getallstu() {
		  List<Student> stude  = serviceImpl.getallstu();
		ModelAndView mav1= new ModelAndView();
		mav1.addObject("studen", stude);
		mav1.addObject("msg","it delete successfully");
		mav1.setViewName("getall");
		  
		return mav1;
		
	}
	@GetMapping("/delete")
	public ModelAndView deleteById(@RequestParam("sid") Integer sid) {
		serviceImpl.deleteid(sid);
		List<Student> stude  = serviceImpl.getallstu();
		ModelAndView mav1= new ModelAndView();
		mav1.addObject("studen", stude);
		mav1.setViewName("getall");
		  
		return mav1;
		
		
	}
}
