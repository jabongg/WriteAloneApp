package com.writealone.springbootstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.writealone.springbootstarter.entity.Wrider;

@Repository
//public interface WriderRepository  extends CrudRepository<Wrider, String> {

//}

public interface WriderRepository  extends JpaRepository<Wrider, String> {
}