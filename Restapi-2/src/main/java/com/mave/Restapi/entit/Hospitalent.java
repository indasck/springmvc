package com.mave.Restapi.entit;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "Hospitales")
public class Hospitalent {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hno;
	@Column(name= "Hname")
	private String hname;
	@Column(name= "Hloc")
	private String hlocation;
	
	@CreatedBy
	private String creted_by;
	
	@CreatedDate
	private LocalDateTime time_date;
}
