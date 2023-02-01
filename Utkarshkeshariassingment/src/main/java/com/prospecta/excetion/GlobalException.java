package com.prospecta.excetion;

import java.time.LocalDateTime;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(EntryException.class)
	public ResponseEntity<MyErrodetails> deviceExcetion(EntryException x, WebRequest re)
	{
		
		MyErrodetails s  = new MyErrodetails();
		
		s.setLocaldat(LocalDateTime.now());
		s.setDescrition(x.getMessage());
		s.setMessage(re.getDescription(false));
		
		return new ResponseEntity<MyErrodetails>(s, HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<MyErrodetails> notfound(NotFoundException x, WebRequest re)
	{
		
        MyErrodetails s  = new MyErrodetails();
		
		s.setLocaldat(LocalDateTime.now());
		s.setDescrition(x.getMessage());
		s.setMessage(re.getDescription(false));
		
		return new ResponseEntity<MyErrodetails>(s, HttpStatus.BAD_REQUEST);
		
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrodetails> allexception(Exception x, WebRequest re)
	{
		  MyErrodetails s  = new MyErrodetails();
			
			s.setLocaldat(LocalDateTime.now());
			s.setDescrition(x.getMessage());
			s.setMessage(re.getDescription(false));
			
			return new ResponseEntity<MyErrodetails>(s, HttpStatus.BAD_REQUEST);
	}
	
}
