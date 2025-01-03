package com.mave.springMVCex_2.contro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.mave.springMVCex_2.addconmodel.addconnect;
import com.mave.springMVCex_2.regmodel.LoginModel;
import com.mave.springMVCex_2.regmodel.Registor;

@Controller
public class ControllMvc {

	@GetMapping("/")
	public String getregistor() {
		return "registor";
		
	}
	
	@PostMapping("/login")
	public String loginregistor(Model model,Registor registor) {
		if (registor.getName().equals("user") || 
		        registor.getEmail().equals("email") || 
		      registor.getPassword().equals("pass")) {
		  			return "login";
		}else {
			model.addAttribute("msg","invalid details");
		
		return "Registor";
		
		}
	}
		@GetMapping("/getlog")
		public String showlogpage() {
			return "login";
			
		}
		@GetMapping("/return")
		public String returnlog() {
			return "login";
		}
		
				@PostMapping("/logopen")
		public String getadddetails(Model model,LoginModel loginModel) {
			if(loginModel.getUserName().equals("user")&& 
					loginModel.getPassword().equals("pass")) {
			
				return "addDetail";
			
		}else {
			return "login";
		}
	}
				//hyperlink
				@GetMapping("/registor")
				public String getregistora() {
					return "registor";
				}

		@GetMapping("/getadd")
		public String showAddconnect() {
			return "addDetail";
		}
		
		@PostMapping("/getconnect")
		public String getaddconnect(Model model,addconnect addconnect) {
			if(addconnect.getName().equals("names") ||
					addconnect.getEmail().equals("mail")||
					addconnect.getAge() == 25) { 
			
			return "login";
			
		}else {
			
			return "showdetails";
		}
}
}
