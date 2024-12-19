package com.mave.springMVCex_pract.reposit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mave.springMVCex_pract.model.entit.productEntit;

public interface productRepository extends JpaRepository<productEntit,Integer> {

}
