package com.chapter4.version4.aspectj;

import org.springframework.stereotype.Component;
import com.chapter2.constructor.PerformanceException;

@Component
public class PerformerImpl implements Performer {

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Performer begining");
	}

}
