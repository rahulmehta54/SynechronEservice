package com.EServiceApp.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EServiceApp.entity.Category;
import com.EServiceApp.entity.Serviceman;
import com.EServiceApp.repo.ServicemanRepository;

@Service
public class ServicemanService {

	@Autowired
	private ServicemanRepository repo;
	
	public Serviceman addServiceman(Serviceman serviceman) {
		
		return repo.saveAndFlush(serviceman) ;
	
	}

	public List<Serviceman> findByStatus(int i) {
		
		return repo.findByStatus(i);
}
	@Transactional
	public int deleteById(int status, long sid)
	{
		return repo.updateById(status, sid);
	}

	public Serviceman findById(long sid)
	{
		
		return repo.getOne(sid);
	}

	
}
