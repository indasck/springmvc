package com.example.FirstProject.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.FirstProject.EntityEmp;
import com.example.FirstProject.Model;

@Component
public class Empmap {

	public EntityEmp modeltoEntity(Model module) {
		EntityEmp entityEmp= new EntityEmp();
		entityEmp.setEid(module.getEid());
		entityEmp.setEname(module.getEname());
		entityEmp.setEsal(module.getEsal());
		
		return entityEmp;
		
	}
	
	public  List<EntityEmp> modeltoEntity(List<Model> model) {
		
	List<EntityEmp> entiytemp= new ArrayList<EntityEmp>();
	
	for(Model model1 : model)
	{
		EntityEmp entityEmp= new EntityEmp();
		entityEmp.setEid(model1.getEid());
		entityEmp.setEname(model1.getEname());
		entityEmp.setEsal(model1.getEsal());
		entiytemp.add(entityEmp);
	}
		return entiytemp ;
	}
}
