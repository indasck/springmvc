package com.mave.springMVCex_4.reposit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mave.springMVCex_4.Entit.Student;

public interface StuRepository extends JpaRepository<Student, Integer> {

}
