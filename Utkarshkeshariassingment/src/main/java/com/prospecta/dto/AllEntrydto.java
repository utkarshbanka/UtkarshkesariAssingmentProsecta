package com.prospecta.dto;

import java.util.List;

import com.prospecta.model.Edata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class AllEntrydto {

	
	
	private Integer count;
	
	
	private List<Edata> entries;
	
}
