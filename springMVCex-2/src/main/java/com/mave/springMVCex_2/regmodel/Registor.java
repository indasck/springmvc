package com.mave.springMVCex_2.regmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registor {
	
	private String name;
	private String email;
	private String password;

}
