package com.example.FirstProject.reposit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FirstProject.EntityEmp;

public interface Repository extends JpaRepository<EntityEmp, Integer> {

}
