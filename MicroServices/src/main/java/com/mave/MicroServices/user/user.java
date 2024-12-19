package com.mave.MicroServices.user;

import org.springframework.stereotype.Component;

import com.mave.MicroServices.profit.profit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class user {

	private String userid;
	private String username;
	private long phono;
	private profit profit;
}
