package com.prospecta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Edata {

	@Id
	private String link;
	private String Api;
	
	private String Descrption;
	
	private String auth;
	
	private boolean Https;
	
	private String cors;
	
	private String catogery;
	
	
}
