package com.mave.springmvc.Enti;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class studentEnti {

	@Id
	private Integer sId;
	private String sname;
	private String Email;
	private long phno;
}
