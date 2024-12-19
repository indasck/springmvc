package com.mave.RestAndSecurity.reposit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mave.RestAndSecurity.entity.BikeEnti;

public interface BikeRepository extends JpaRepository<BikeEnti, Integer> {

}
