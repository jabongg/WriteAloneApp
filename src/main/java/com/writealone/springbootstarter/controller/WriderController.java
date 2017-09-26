package com.writealone.springbootstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.writealone.springbootstarter.entity.Wrider;
import com.writealone.springbootstarter.service.WriderService;
import com.writealone.springbootstarter.service.impl.WriderServiceImpl;

/**
 * 
 * @author  Jang Sept 15, 2017
 *
 */

@RestController
public class WriderController {
	
	@Autowired
	private WriderService wriderService;
	
	@RequestMapping(method=RequestMethod.POST, value="/wriders")
	public void addWrider( @RequestBody Wrider wrider) {
		wriderService.save(wrider);
	}
}
