package com.mave.MicroServices.profit;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class profit {
	
	private String pid;
	private List<String> message;
	private List<String> notification;
   
}
