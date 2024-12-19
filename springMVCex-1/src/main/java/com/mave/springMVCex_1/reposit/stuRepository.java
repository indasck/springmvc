package com.mave.springMVCex_1.reposit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mave.springMVCex_1.enti.studententi;

public interface stuRepository extends JpaRepository<studententi, Integer> {

}
