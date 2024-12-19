package com.mave.springMVCex_3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcContro3 {
	
	public MvcContro3() {
		System.out.println("conntrol::started");
	}


	@GetMapping("/control")
	public ModelAndView getcontrol(){
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("msg","this is  mvc application");
		mv.setViewName("model");
		
		return mv;
		
		
	}
	
	@GetMapping("/product")
	public ModelAndView getproduct() {
		ModelAndView pro= new ModelAndView();
		
		pro.addObject("msg"," product is supplyed");
		pro.setViewName("model");
		
		return pro;
		
	}
}
