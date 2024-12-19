package com.example.Student.client;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Student.maper.Studentmaper;
import com.example.Student.module.StudentModel;
import com.example.Student.module.entit.StudentEntit;
import com.example.Student.reposit.StudentReposit;

@Component
public class StuClient implements CommandLineRunner {
    @Autowired
	StudentReposit studentReposit;
	@Autowired
	Studentmaper studentmaper;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		StudentModel studentModel= new StudentModel();
		studentModel.setSid(1);
		studentModel.setSname("indra");
		studentModel.setMarks(100);
		
		StudentEntit studentEntit= studentmaper.modelToEntity(studentModel);
		studentReposit.save(studentEntit);
	
	
	StudentModel s1= new StudentModel();
	s1.setSid(2);
	s1.setSname("santi");
	s1.setMarks(80);
	
	StudentModel s2= new StudentModel();
	s2.setSid(3);
	s2.setSname("vanita");
	s2.setMarks(90);
	
	StudentModel s3= new StudentModel();
	s3.setSid(4);
	s3.setSname("medha");
	s3.setMarks(88);
	
	List<StudentModel> stEntit= List.of(s1,s2,s3);
	           List<StudentEntit> stEntits= studentmaper.modelToEntity1(stEntit);
	           studentReposit.saveAll(stEntits);
	
	         System.out.println(studentReposit.findById(3));
	        
	         
	         Optional<StudentEntit> e= studentReposit.findById(3);
	     	if(e!=null) {
	     		studentReposit.deleteById(3);
	     	}else {
	     		studentReposit.findById(3);
	     	}
	     	   
	          List<StudentEntit> stuente = studentReposit.findAll();
	        for(StudentEntit studentEntit2: stuente) {
	        
	        	System.out.println(studentEntit2);
	        }
	
	
	}
	
	
}
