package com.mave.springmvc.reposit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mave.springmvc.Enti.studentEnti;

public interface stuRepository extends JpaRepository<studentEnti, Integer> {

}
