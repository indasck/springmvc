package com.mave.springSecurity.pencil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pencil {

 @GetMapping("/pencil")
 public String draw() {
	
	 return "they draw the prictures ";
}


}
