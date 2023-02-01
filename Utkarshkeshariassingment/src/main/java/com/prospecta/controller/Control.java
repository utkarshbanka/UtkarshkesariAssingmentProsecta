package com.prospecta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prospecta.dto.Entrytidedto;
import com.prospecta.excetion.EntryException;
import com.prospecta.model.Edata;
import com.prospecta.service.EdataService;

@RestController
public class Control {

	
	@Autowired
	private EdataService ser;
	
	@GetMapping("/{catogery}")
	public ResponseEntity<List<Entrytidedto>> catogeryhandneler(@PathVariable String catogery) throws EntryException
	{
		
		List<Entrytidedto> s = ser.byCatogery(catogery);
		
		return new ResponseEntity<List<Entrytidedto>>(s,HttpStatus.OK);
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<Edata> saveentrydata(@RequestBody Edata edat) throws EntryException
	{
		Edata s = ser.savedata(edat);
		
		return new ResponseEntity<Edata>(s,HttpStatus.CREATED);
	}
	
	
	
	
}
