package com.mave.MicroServices1.list;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class informe {

	private String intoid;
	private String infoname;
	private com.mave.MicroServices.user.user user;
}
