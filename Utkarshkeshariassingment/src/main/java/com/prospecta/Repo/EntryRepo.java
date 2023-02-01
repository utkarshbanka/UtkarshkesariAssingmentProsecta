package com.prospecta.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prospecta.model.Edata;

@Repository
public interface EntryRepo  extends JpaRepository<Edata, String>{

}
