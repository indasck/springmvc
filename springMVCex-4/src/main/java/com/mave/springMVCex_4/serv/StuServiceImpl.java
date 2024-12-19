package com.mave.springMVCex_4.serv;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mave.springMVCex_4.Entit.Student;
import com.mave.springMVCex_4.reposit.StuRepository;

@Service
public class StuServiceImpl implements StuService{

	private StuRepository stuRepository;
	
	public StuServiceImpl(StuRepository stuRepository) {
		super();
		this.stuRepository = stuRepository;
	}

	@Override
	public boolean saveStudent(Student s) {
		// TODO Auto-generated method stub
		      Student savestu=stuRepository.save(s);
		return savestu.getSid()!= null ;
	}

	@Override
	public List<Student> getallstu() {
		// TODO Auto-generated method stub
		return stuRepository.findAll();
	}

	@Override
	public void deleteid(Integer sid) {
		// TODO Auto-generated method stub
		stuRepository.deleteById(sid);
	}

}
