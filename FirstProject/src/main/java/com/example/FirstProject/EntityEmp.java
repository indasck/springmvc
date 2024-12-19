package com.example.FirstProject;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntityEmp{

	@Id
	int eid;
	String ename;
	double esal;
	
}
