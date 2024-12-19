package com.example.Gradle2.reposit;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Gradle2.entit.product;
import com.example.Gradle2.entit.productentit;


public interface proRepository extends JpaRepository<productentit, Integer> {

}
