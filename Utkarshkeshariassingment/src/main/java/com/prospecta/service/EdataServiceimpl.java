package com.prospecta.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prospecta.Repo.EntryRepo;
import com.prospecta.dto.AllEntrydto;
import com.prospecta.dto.Entrytidedto;
import com.prospecta.excetion.EntryException;
import com.prospecta.model.Edata;
import com.prospecta.service.EdataService;

@Service
public class EdataServiceimpl  implements EdataService{
	
	
	
	@Autowired
	private EntryRepo datal;

	@Override
	public List<Entrytidedto> byCatogery(String catogery) throws EntryException {
		// TODO Auto-generated method stub
		
		String uri = "https://api.publicapis.org/entries";
		
		RestTemplate res = new RestTemplate();
		
		AllEntrydto ss = res.getForObject(uri, AllEntrydto.class);
		
		List<Entrytidedto> lis = new ArrayList<>();
		
		for(Edata s:ss.getEntries())
		{
			if(s.getCatogery().equals(catogery))
			{
				lis.add( new Entrytidedto(s.getApi(), s.getDescrption()));
			}
		}
		
		if(lis.size()==0)
		{
			throw new EntryException("No Catogeries found");
		}
		
		return lis;
	}

	@Override
	public Edata savedata(Edata edata) throws EntryException {
		// TODO Auto-generated method stub
		
		  Optional<Edata> s = datal.findById(edata.getLink());
		  
		  
		  if(s.isPresent())
		  {
			  throw new EntryException("This type of data alredy exist");
		  }
		  
		   
		
		
		return  datal.save(edata);
	}



}
