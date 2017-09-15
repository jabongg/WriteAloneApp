package com.writealone.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;

import com.writealone.springbootstarter.entity.Wrider;

public interface WriderRepository  extends CrudRepository<Wrider, String> {

}
