//表演者接口
package com.chapter4.aspectj.annotation;

import com.chapter2.constructor.PerformanceException;

public interface Performer {
	void perform() throws PerformanceException;
}