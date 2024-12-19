package com.example.Student.reposit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.module.entit.StudentEntit;

public interface StudentReposit extends JpaRepository<StudentEntit,Integer>{

}
