package com.example.Student.maper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;

import org.springframework.stereotype.Component;

import com.example.Student.module.StudentModel;
import com.example.Student.module.entit.StudentEntit;

@Component
public class Studentmaper {

	public StudentEntit modelToEntity(StudentModel studentModel) {
		
		StudentEntit studentEntit= new StudentEntit();
		
		studentEntit.setSid(studentModel.getSid());
		studentEntit.setSname(studentModel.getSname());
		studentEntit.setMarks(studentModel.getMarks());
		studentEntit.setCreatdAt(LocalDateTime.now());
		studentEntit.setCreatedBy(System.getProperty("user.name"));
		
		
		return studentEntit;
		
	}
	
	public List<StudentEntit> modelToEntity1(List<StudentModel> studentModel){
		List<StudentEntit> studententity= new ArrayList<StudentEntit>();
		
		for(StudentModel studentmodel: studentModel) {
		
			StudentEntit studentEntits= new StudentEntit();
		studentEntits.setSid(studentmodel.getSid());
		studentEntits.setSname(studentmodel.getSname());
		studentEntits.setMarks(studentmodel.getMarks());
		studentEntits.setCreatdAt(LocalDateTime.now());
		studentEntits.setCreatedBy(System.getProperty("user.name"));
		
		studententity.add(studentEntits);
		}
		return studententity;
		
		
	}
	
}
