package com.writealone.springbootstarter.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.writealone.springbootstarter.entity.Wrider;
import com.writealone.springbootstarter.repository.WriderRepository;
import com.writealone.springbootstarter.repository.custom.WriderDao;

@Repository
public class WriderDaoImpl implements WriderDao {

	@Autowired
	private WriderRepository wriderRepository;
	
	@Override
	public void save(Wrider wrider) {
		wriderRepository.save(wrider);
	}

}
