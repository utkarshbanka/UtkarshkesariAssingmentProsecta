package com.prospecta.service;

import java.util.List;

import com.prospecta.dto.Entrytidedto;
import com.prospecta.excetion.EntryException;
import com.prospecta.model.Edata;

public interface EdataService {

	
	
	public List<Entrytidedto>  byCatogery(String catogery) throws EntryException;
	
	public Edata savedata(Edata edata) throws EntryException;
}
