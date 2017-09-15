package com.writealone.springbootstarter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.writealone.springbootstarter.dao.WriderDao;
import com.writealone.springbootstarter.dao.impl.WriderDaoImpl;
import com.writealone.springbootstarter.entity.Wrider;
import com.writealone.springbootstarter.repository.WriderRepository;
import com.writealone.springbootstarter.service.WriderService;

@Service
public class WriderServiceImpl implements WriderService {

	WriderDaoImpl wriderDaoImpl = new WriderDaoImpl();
	
	@Autowired
	private WriderRepository wriderRepository;

	
	@Override
	public void save(Wrider wrider) {
		//wriderDaoImpl.save(wrider);
		wriderRepository.save(wrider);
	}

}
