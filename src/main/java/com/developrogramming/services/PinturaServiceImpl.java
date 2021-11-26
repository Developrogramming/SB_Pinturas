package com.developrogramming.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.developrogramming.model.Pintura;
import com.developrogramming.repository.PinturaRepository;


@Service
public class PinturaServiceImpl implements PinturaService{
	
	@Autowired
	PinturaRepository pinturaRepository;

	@Override
	public List<Pintura> findAll() {
		return pinturaRepository.findAll();
	}

}
