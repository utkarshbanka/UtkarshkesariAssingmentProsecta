package com.prospecta.excetion;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class MyErrodetails {

	
	private LocalDateTime localdat;
	
	private String message;
	
	private String descrition;
	
	
	
}
