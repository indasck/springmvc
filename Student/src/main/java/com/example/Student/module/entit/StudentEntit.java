package com.example.Student.module.entit;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntit {

	@Id
	int sid;
	String sname;
	int marks;
	
	@CreatedDate
	private LocalDateTime creatdAt;
	
	@CreatedBy
	private String createdBy;
}
