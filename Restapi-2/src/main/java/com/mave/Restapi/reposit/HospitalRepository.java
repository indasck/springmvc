package com.mave.Restapi.reposit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mave.Restapi.entit.Hospitalent;

public interface HospitalRepository extends JpaRepository<Hospitalent, Integer> {

}
