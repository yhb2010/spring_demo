package com.mvc.version4.mvc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mvc.version4.mvc.domain.Spitter;
import com.mvc.version4.mvc.domain.Spittle;

@Service
public class SpittleRepositoryImpl implements SpittleRepository {

	private List<Spittle> spittles = new ArrayList<Spittle>();
	private Map<String, Spitter> spitters = new HashMap<String, Spitter>();

	public SpittleRepositoryImpl(){
		for(int i=0; i<1000; i++){
			spittles.add(new Spittle(i, "Spittle" + i, new Date()));
		}
	}

	@Override
	public List<Spittle> findSpittles(int max, int count) {
		List<Spittle> spittles = new ArrayList<Spittle>();
		for(int i=max; i>max-count; i--){
			spittles.add(this.spittles.get(i));
		}
		return spittles;
	}

	@Override
	public Spittle findOne(int spittleId) {
		for(int i=0; i<spittles.size(); i++){
			if(spittles.get(i).getId() == spittleId){
				return spittles.get(i);
			}
		}
		return null;
	}

	@Override
	public void save(Spitter spitter) {
		spitters.put(spitter.getUserName(), spitter);
	}

	@Override
	public Spitter findByUserName(String userName) {
		return spitters.get(userName);
	}

}
