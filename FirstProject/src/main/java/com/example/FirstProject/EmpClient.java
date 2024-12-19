package com.example.FirstProject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.FirstProject.convert.Empmap;
import com.example.FirstProject.reposit.Repository;

@Component
public class EmpClient implements CommandLineRunner {
	@Autowired
	Repository repository;
	
	@Autowired
	Empmap empmap;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Model model= new Model();
		model.setEid(1);
		model.setEname("indra");
		model.setEsal(40000);
		
		EntityEmp entityEmp= empmap.modeltoEntity(model);
		repository.save(entityEmp);
		
		Model m= new Model();
		m.setEid(2);
		m.setEname("medha");
		m.setEsal(30000);
		
		Model m1= new Model();
		m1.setEid(3);
		m1.setEname("vanita");
		m1.setEsal(20000);
		
		List<Model> model1= List.of(m,m1);
		List<EntityEmp> entityEmp2= empmap.modeltoEntity(model1);
		repository.saveAll(entityEmp2);
	
   repository.deleteById(2);		
		
		List<EntityEmp> employe= repository.findAll();
		
	  for(EntityEmp entitemp: employe) {
		  
		 System.out.println(entitemp);
	  }
	System.out.println(repository.findById(1));
	
	Optional<EntityEmp> e= repository.findById(2);
	
	if(e!= null) {
		System.out.println("your data existed");
	}else {
		System.out.println("your data deleted");
	}
	}
	
	

}
