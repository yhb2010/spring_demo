package com.mvc.version4.mvc.service;

import java.util.List;

import com.mvc.version4.mvc.domain.Spitter;
import com.mvc.version4.mvc.domain.Spittle;

public interface SpittleRepository {

	List<Spittle> findSpittles(int max, int count);

	Spittle findOne(int spittleId);

	void save(Spitter spitter);

	Spitter findByUserName(String userName);

}
