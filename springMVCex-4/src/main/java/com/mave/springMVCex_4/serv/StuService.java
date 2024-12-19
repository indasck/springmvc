package com.mave.springMVCex_4.serv;

import java.util.List;

import com.mave.springMVCex_4.Entit.Student;

public interface StuService {

	public boolean saveStudent(Student s);
	
	public List<Student> getallstu();
	
	public void deleteid(Integer sid);
}
